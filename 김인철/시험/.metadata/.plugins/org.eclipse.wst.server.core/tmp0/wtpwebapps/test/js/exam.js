$(function(){

	// (1) 오늘 날짜 출력
	var year = $(".year");
	var month = $(".month");
	var date = $(".date");

	var now = new Date();

	year.text(now.getFullYear());
	month.text(now.getMonth()+1);
	date.text(now.getDate())

	// (2) 포커스 가면 '검색어를 입력하세요'를 안보이고 다시 포커스가 없으면 다시 출력
	var keyword = $("#keyword");

	keyword.focusin(function(){

		keyword.css("background","none");

	});

	keyword.focusout(function(){

		keyword.css("background",'url("images/sch_guide.gif") no-repeat');

	});


	// (3) 탭팬 구현
	var tabmenu = $("#tabmenu");
	var tabbtn1 = $(".tab_btn1");
	var tabbtn2 = $(".tab_btn2");
	var tabbtn3 = $(".tab_btn3");

	tabbtn1.css("cursor","pointer").click(function(){
		$(".tab_btn1 img").attr("src","images/tab_btn_1_over.gif");
		$(".tab_btn2 img").attr("src","images/tab_btn_2_out.gif");
		$(".tab_btn3 img").attr("src","images/tab_btn_3_out.gif");
		tabmenu.children('dd:eq(0)').css("display","block");
		tabmenu.children('dd:eq(1)').css("display","none");
		tabmenu.children('dd:eq(2)').css("display","none");
	})

	tabbtn2.css("cursor","pointer").click(function(){
		$(".tab_btn1 img").attr("src","images/tab_btn_1_out.gif");
		$(".tab_btn2 img").attr("src","images/tab_btn_2_over.gif");
		$(".tab_btn3 img").attr("src","images/tab_btn_3_out.gif");
		tabmenu.children('dd:eq(0)').css("display","none");
		tabmenu.children('dd:eq(1)').css("display","block");
		tabmenu.children('dd:eq(2)').css("display","none");

	})

	tabbtn3.css("cursor","pointer").click(function(){
		$(".tab_btn1 img").attr("src","images/tab_btn_1_out.gif");
		$(".tab_btn2 img").attr("src","images/tab_btn_2_out.gif");
		$(".tab_btn3 img").attr("src","images/tab_btn_3_over.gif");
		tabmenu.children('dd:eq(0)').css("display","none");
		tabmenu.children('dd:eq(1)').css("display","none");
		tabmenu.children('dd:eq(2)').css("display","block");
	})

	// (4) 이미지슬라이드 구현
	/*var best_bg = $("#best_bg");
	$("#best_bg ul li").css("float","left");
	$("#best_bg ul").css("margin-left","100px");
	$("#best_bg ul li").css("margin-left","25px");
	var start =0;
	var max = $("#best_bg ul").children().length;
	for(var i=0;i<$("#best_bg ul").children().length;i++){
		$("#best_bg ul").children("li:eq("+i+")").css("display","none");
	}
	for(var i=0;i<5;i++){
		$("#best_bg ul").children("li:eq("+i+")").css("display","block");
	}

	$(".next_btn").css("cursor","pointer").click(function(){
		if(start<5){
			for(var i=0;i<$("#best_bg ul").children().length;i++){
				$("#best_bg ul").children("li:eq("+i+")").css("display","none");
			}
			for(var i=start;i<start+5;i++){
				$("#best_bg ul").children("li:eq("+i+")").css("display","block");
			}
			start = start+1;
		}else if(start==4){
			$(this).hide();
		}


	})
	$(".prev_btn").css("cursor","pointer").click(function(){
		if(start>0){
			for(var i=0;i<$("#best_bg ul").children().length;i++){
				$("#best_bg ul").children("li:eq("+i+")").css("display","none");
			}
			for(var i=start;i<start+5;i++){
				$("#best_bg ul").children("li:eq("+i+")").css("display","block");
			}
			start = start-1;
		}else if(start==1){
			$(this).hide();
		}


	})*/
	
	$("#best_bg").addClass('banner_wrap');
	$( '#best_bg ul' ).wrap( '<div class="slide_banner"></div>' );
	$( '#best_bg ul li' ).unwrap();

	$( '#best_bg li a' ).unwrap();
	$( '#best_bg a' ).wrap( '<div></div>' );
	$("#best_bg a").css("margin-left","100px");


	$(".banner_wrap").css("position","relative");
	$(".prev_btn").css("left","-50px");
	$(".next_btn").css("right","30px");
	
	var slide = $('.slide_banner').bxSlider({
//		mode : 'vertical',
//		captions : true,
		controls: true,
		minSlides : 4,
		maxSlides : 4,
		slideMargin : 0,
		slideWidth : 220,
		auto : true,
		moveSlides : 1,
		speed : 300
	});

	$( '.prev_btn a' ).on( 'click', function () {
		slide.goToPrevSlide();  //이전 슬라이드 배너로 이동
		return false;              //<a>에 링크 차단
	} );

	//다음 버튼을 클릭하면 다음 슬라이드로 전환
	$( '.next_btn a' ).on( 'click', function () {
		slide.goToNextSlide();  //다음 슬라이드 배너로 이동
		return false;
	} );

	






	// (5) [로그인]을 누르면 로그인 창이 보이고 [Close]를 누르면 다시 안 보임
	var login_wrap_btn = $(".login_wrap img");
	var login_f = $("#login_f");

	login_wrap_btn.css("cursor","pointer").click(function(){
		login_f.css("z-index","10");
		login_f.css("top","25px");
		login_f.css("left","-110px");
		$("#sch_f").css("z-index","0");
	})

	$(".login_close_btn").css("cursor","pointer").click(function(){
		login_f.css("z-index","10");
		login_f.css("top","-500px");
		login_f.css("left","-300px");
	})

	// (6) [전체메뉴]를 선택하면 전체메뉴가 보이고 [Close] 누르면 다시 안 보임
	$("#total_btn a").children("img:eq(0)").css("float","right");
	$("#total_btn a").children("img:eq(0)").css("margin-right","100px");
	var total_btn = $("#total_btn a").children("img:eq(0)");
	$("#total_btn").prepend("<a href='#'>");
	$("#total_btn").prepend("<img src='images/gnb_4_out.gif' alt='1번'/>");
	$("#total_btn").prepend("</a>");
	$("#total_btn").prepend("<a href='#'>");
	$("#total_btn").prepend("<img src='images/gnb_3_out.gif' alt='1번'/>");
	$("#total_btn").prepend("</a>");
	$("#total_btn").prepend("<a href='#'>");
	$("#total_btn").prepend("<img src='images/gnb_2_out.gif' alt='1번'/>");
	$("#total_btn").prepend("</a>");
	$("#total_btn").prepend("<a href='#'>");
	$("#total_btn").prepend("<img src='images/gnb_1_out.gif' alt='1번'/>");
	$("#total_btn").prepend("</a>");
	$("#total_btn").css("width","100%");
	$("#total_btn").css("background-color","#AE1C17");
	$("#total_btn").css("right","0px");
	$("#total_btn").css("bottom","-10px");




	/*$("#total_btn").wrap("<div id='total_wrap' style='top:100px;width:100%; height:100px; background-color:red '></div>");*/


	var total_ctn = 0;
	total_btn.css("cursor","pointer").click(function(){
		if(total_ctn%2==0){
			$("#total_menu").css("display","inline");
			total_ctn++;
		}
		else{
			$("#total_menu").css("display","none");
			total_ctn++;
		}
	})

	$("#total_close").css("cursor","pointer").click(function(){
		$("#total_menu").css("display","none");
		total_ctn=0;
	})





})