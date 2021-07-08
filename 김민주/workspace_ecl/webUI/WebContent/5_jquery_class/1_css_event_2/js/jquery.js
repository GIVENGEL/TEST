/**
 * 
*/
//<div class="header">
//		<ul class="menu">
//			<li><a href="#" class="rollover"><img src="imgs/menu01_off.png" alt="Home" /></a></li>
//			<li><a href="#" class="rollover"><img src="imgs/menu02_off.png" alt="Products" /></a></li>
//			<li><a href="#" class="rollover"><img src="imgs/menu03_off.png" alt="Company" /></a></li>
//		</ul>
//	</div>
// 위 구문의 img태그의 src 속성을 바꿔야 하는데 $('.rollover')으로만 위치 지정하면 a 태그 내부에서만 찾기때문에 children 으로 img를 지정 해줘야함
$(function(){
	
	$('.rollover').children('img').hover(function(){
//		이벤트 발생 함수 안에 변수를 선언해줘야지만 같은 경로의 값을 가지고 온다.
		var a = $(this).attr('src');
//		$('.rollover img') 와 $('.rollover').children('img') 은 동일 
		$(this).attr('src',a.replace('off','on'));
	},function(){
		var a = $(this).attr('src');
		$(this).attr('src',a.replace('on','off'));		
		
	});
});	