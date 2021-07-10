$(function(){
// tabSet 이란 클래스를 선택하는 문구를 topDiv에 저장
	var topDiv = $('.tabSet');
//	$('.tabSet') 안의 ul.tabs(ul중 tabs 라는 클래스)의 자손중 a 태그를 선택하는 문구를 변수에 저장
	var anchors = topDiv.find('ul.tabs a');
//	div.panel 을 변수에 저장
	var panelDiv = topDiv.find('div.panel');
	
//	a태그 를 보여준다 (첫번째, 두번째... )//(nav 느낌)
	anchors.show();
//	본문 내용은 숨긴다.
	panelDiv.hide();
	
//	lastAnchor에 on클래스를 가진 a 태그 저장(이때 filter를 사용하면 벨류까지 저장한다).
	var lastAnchor = anchors.filter('.on');
//	위에 저장한 a태그의 주소값을 변수에 저장
	var lastPanel = $(lastAnchor.attr('href')) // ==> #panel1-1
//	on클래스를 가진 a 태그의 본문을 보여줌(href) 를 선택했기 때문에 주소로 연결되어 본문이 열려짐
	lastPanel.show();
//	커서를 a태그에 올리면 포인터 모양 바뀜
	anchors.css({'cursor':'pointer'});
	
//	a태그를 클릭하면
	anchors.click(function(){
//		선택한 a 태그를 currAnchor 에 저장
		var currAnchor = $(this);
//		그 주소값을 currPanel에 저장
		var currPanel =$(currAnchor.attr('href'));
		
//		위에 저장한 on클래스를 가진 a태그에 on 클래스를 지워준다.(초기화작업)
		lastAnchor.removeClass('on');
//		그리고 선택한 a태그에 on클래스를 더해준다
		currAnchor.addClass('on');
//		기존에 열려있던 a태그의 본문(href로 가져온)을 숨긴다
		lastPanel.hide();
//		선택한 a 태그에 on클래스를 재부여했으니 currPanel(href 값을 가져오는 변수)을 사용해 href로 해당 본문을 연다 
		currPanel.show();
//		데이터 교체(갱신)
		lastAnchor = currAnchor;
		lastPanel = currPanel;
	})
})