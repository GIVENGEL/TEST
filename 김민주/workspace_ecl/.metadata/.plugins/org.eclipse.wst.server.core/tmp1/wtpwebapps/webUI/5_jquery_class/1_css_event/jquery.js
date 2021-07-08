/**
 *  여기에 완성하기
 */



$(function(){})


$(function(){
//	$('#celebs > table.data th').css({
//		'background':'#ddaa99',
//		'color' : 'red',
//		'font-size' : '14px'
//	});
	
	
//	$('#celebs tbody tr:even').addClass('table_striping')
	
//	테이블에 마우스가 올라갔을 때만 색이 변경하기 
//	$('#celebs tbody tr td').addClass('td_mouseover')
	$('#celebs tr').hover(function(){
		$(this).addClass('td_mouseover')
	},function(){
		$(this).removeClass('td_mouseover')
	});
});