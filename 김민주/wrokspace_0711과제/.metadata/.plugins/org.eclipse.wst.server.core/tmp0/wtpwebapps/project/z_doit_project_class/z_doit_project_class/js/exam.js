/**
 * 
 */
$(function(){
	//1 번 날짜 가져오기
	var date = new Date();
	
	var year = date.getFullYear();
	var month = date.getMonth();
	var date = date.getDate();
	$('#date_wrap').children('.year').text(year);
	$('#date_wrap').children('.month').text(month);
	$('#date_wrap').children('.date').text(date);
	
	// 2번 포커스 가면 ‘검색어를 입력하세요’를 안보이고 다시 포커스가 없으면 다시 출력
	$('#keyword').focus(function(){
		$(this).css({"background":"url('')"});	
	});
	
	$('#keyword').blur(function(){
		$(this).css({"background":"url('images/sch_guide.gif')",
					"background-repeat":"no-repeat"});	
	});
	
	
	//3 번 탭팬 구현
	// 버튼 클릭시 src 변경해서 이미지 변경
//	$('.tab_btn1').click(function(){
//		$('.tab_btn1').children(1).attr('src',"images/tab_btn_1_over.gif");
//		$('.tab_btn2').children(1).attr('src',"images/tab_btn_2_out.gif");
//		$('.tab_btn3').children(1).attr('src',"images/tab_btn_3_out.gif");
//		
//
//		$('#tabmenu dt:nth-child(1)+dd').css({'display':'block'});
//		$('#tabmenu dt:nth-child(2)+dd').css({'display':'none'});
//		$('#tabmenu dt:nth-child(3)+dd').css({'display':'none'});
//	})
//	
//	$('.tab_btn2').click(function(){
//		$('.tab_btn1').children(1).attr('src',"images/tab_btn_1_out.gif");
//		$('.tab_btn2').children(1).attr('src',"images/tab_btn_2_over.gif");
//		$('.tab_btn3').children(1).attr('src',"images/tab_btn_3_out.gif");
//
//		$('#tabmenu dt:nth-child(1)+dd').css({'display':'none'});
//		$('#tabmenu dt:nth-child(2)+dd').css({'display':'block'});
//		$('#tabmenu dt:nth-child(3)+dd').css({'display':'none'});
//	})
//	$('.tab_btn3').click(function(){
//		$('.tab_btn1').children(1).attr('src',"images/tab_btn_1_out.gif");
//		$('.tab_btn2').children(1).attr('src',"images/tab_btn_2_out.gif");
//		$('.tab_btn3').children(1).attr('src',"images/tab_btn_3_over.gif");
//		
//		$('#tabmenu dt:nth-child(1)+dd').css({'display':'none'});
//		$('#tabmenu dt:nth-child(2)+dd').css({'display':'none'});
//		$('#tabmenu dt:nth-child(3)+dd').css({'display':'block'});
//	})
	   $('.tab_btn2').click(function(){
		      $('.tab_btn1').next().css('display', 'none')
		      $('.tab_btn3').next().css('display', 'none')
		      $(this).next().css('display', 'block')
		      
		      $('.tab_btn1 img').attr('src','images/tab_btn_1_out.gif')
		      $('.tab_btn2 img').attr('src','images/tab_btn_2_over.gif')
		      $('.tab_btn3 img').attr('src','images/tab_btn_3_out.gif')
		   })
	   $('.tab_btn1').click(function(){
			   $('.tab_btn2').next().css('display', 'none')
			   $('.tab_btn3').next().css('display', 'none')
			   $(this).next().css('display', 'block')
			   
			   $('.tab_btn1 img').attr('src','images/tab_btn_1_over.gif')
			   $('.tab_btn2 img').attr('src','images/tab_btn_2_out.gif')
			   $('.tab_btn3 img').attr('src','images/tab_btn_3_out.gif')
		   })
	   $('.tab_btn3').click(function(){
			   $('.tab_btn1').next().css('display', 'none')
			   $('.tab_btn2').next().css('display', 'none')
			   $(this).next().css('display', 'block')
			   
			   $('.tab_btn1 img').attr('src','images/tab_btn_1_out.gif')
			   $('.tab_btn2 img').attr('src','images/tab_btn_2_out.gif')
			   $('.tab_btn3 img').attr('src','images/tab_btn_3_over.gif')
		   })
		   
//		4. 이미지슬라이드 구현
		   $('#best_bg').bxSlider({
			   	 mode:vertical,
				 minSlides : 4,
		    	 maxSlides : 4,
		    	 moveSlides : 0,
		    	 slideMargin : 10
//		    	 controls : true
		    	 
	 		})
		   
	

})