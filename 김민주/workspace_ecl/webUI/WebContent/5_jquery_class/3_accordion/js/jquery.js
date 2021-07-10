/**
 * 
 */

$(function(){
//	여러개의 선택지가 있을 때 각자 이벤트를 발동해라
	$('.accordion').each(function(){
//		$(this)  ->  <dl> 을 가르킨다.
//		dl안의 자식,자손인 dt와 dd 를 각각 변수에 담는다.
		let allDt = $(this).find('dt');
		let allDd = $(this).find('dd');
		
		
		allDd.hide();
		
		allDt.css({'cursor': 'pointer'});
		
		allDt.click(function(){
//			우선 이벤트가 발생하면 다른 요소를 숨긴다.
//			allDd.hide();
			
//			클릭한(이벤트를 발생시킨) 바로 다음 요소를 선택하는 법(next)
//			클릭한 요소의 다음 요소를 펼친다(show).
//			$(this).next().show();
//			each 함수를 사용했기 때문에 dl(.accordion) 은 서로 다른 객체이다.
//			그러므로 각자 이벤트가 발동한다.
//			밑에 dl의 dd를 열었다고 위의 dl의 열려있던 dd 가 닫히지는 않는다. 

//			위 두가지 식을 하나로 결합하는 법 (toggle)
			$(this).next().toggle();
			
		});
		
	
		
		
		
		
	})
})