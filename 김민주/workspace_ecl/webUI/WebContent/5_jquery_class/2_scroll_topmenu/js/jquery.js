/**
 * 
 */


$(function(){
	
	//animate : 움직이는 함수?
	$('#intro').animate({  
		fontSize : '30px',
		padding : '20px',  // 안쪽 여백 
	},2000)	
	
	$('#navigation > ul > li').hover(function(){
		$(this).animate({
			fontSize : '+=2px',
			paddingLeft : '+=10px'
		},200);
	},function(){
		$(this).animate({
			fontSize : '-=2px',
			paddingLeft : '-=10px'
		},200);
	});
	
	// 고정메뉴 원리 ( 스크롤을 어디로 내려도 nav 위치 고정)
	// scroll이벤트는 윈도우에 걸어준다
	$(window).scroll(function(){
		$('#navigation').css('top', $(document).scrollTop());
	})
	
})