$(function(){
	
	$('.accordion').find('dt').css({'cursor':'pointer'});
	$('.accordion').accordion({
//		시작시 몇번째 인덱스가 열려있도록 설정할지
		active:0,
//		본문을 담은 dd의 높이스타일을 지정
//		'content' 로 지정하면 본문내용의 길이만큼만 dd의 높이가 설정됨.
		heightStyle:'content'
	});
});