$(function(){
	
	var img1= $('#dom1');
	var img2= $('#dom2');
	var img3= $('#dom3');
	
//-------------------------------------------------	
	// 김민주
	// 국내 패키지
	var sokcho_package = '';
	var jeju_package = '';
	var yeosu_package = '';
//	국내 패키지 정보를 담은 변수(지금은 문자열로 나옵니다.)
	sokcho_package = $('#domes >#dom1').next().attr('id');	// sokcho_package_price#100000
	jeju_package = $('#domes2 >#dom2').next().attr('id');	// jeju_package_price#400000	
	yeosu_package = $('#domes3 >#dom3').next().attr('id');	// yeosu_package_price#300000

//	각 패키지 정보를 담은 값을 로컬스토리지(https://www.daleseo.com/js-web-storage/ 설명 읽어보셔야 할거 같아요.)에
//  저장하면 같은 로컬호스트의 js파일 어디든  window.localStorage.getItem('키값')으로 불러와 사용 가능하다.
//	생성된 로컬스토리지 확인은 개발자도구 => application => storage => localStorage
//	window.localStorage.setItem('sokcho_package',sokcho_package); 
//	window.localStorage.setItem('jeju_package',jeju_package);
//	window.localStorage.setItem('yeosu_package',yeosu_package);

	
	
	
//-------------------------------------------------	
	img1.css("cursor","pointer").click(function(){
//김민주 ================================================================
//	이미지 클릭 시 속초 패키지 정보를 담은 변수를 로컬스토리지에 저장
		var sokcho_packageInfo = $('#domes >#dom1').next().attr('id');
		var sokcho_package = {};
		sokcho_package.name	= sokcho_packageInfo.sokcho_packageInfo.substr(0,6);
		sokcho_package_price = parseInt(sokcho_packageInfo.slice(-6),10);
		$.ajax({
			url:'../detail.js',
			type:'post',
			dataType:'json',
			data:sokcho_package,
			success:function(data){
				alert("속초");
			}
		})
			 
		location.href = 'detail.html';
	});
	img1.next().next().hide();
	img1.hover(function(){
		img1.next().next().show(500);
	},function(){
		
	})
	
	
	img2.css("cursor","pointer").click(function(){
//김민주 ================================================================
//		이미지 클릭 시 제주 패키지 정보를 담은 변수를 로컬스토리지에 저장
		window.localStorage.setItem('jeju_package',jeju_package);
		location.href = 'detail.html';
		
	});
	img2.next().next().hide();
	img2.hover(function(){
		img2.next().next().show(500);
	},function(){
		
	})
	
	img3.css("cursor","pointer").click(function(){
//김민주 ================================================================
//		이미지 클릭 시 여수 패키지 정보를 담은 변수를 로컬스토리지에 저장
		window.localStorage.setItem('yeosu_package',yeosu_package);
		location.href = 'detail.html';
		
	});
	img3.next().next().hide();
	img3.hover(function(){
		img3.next().next().show(500);
	},function(){
		
	})
	
});