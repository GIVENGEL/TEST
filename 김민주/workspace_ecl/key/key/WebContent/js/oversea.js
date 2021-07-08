$(function(){
	
	var img1= $('#ove1');
	var img2= $('#ove2');
	var img3= $('#ove3');
	
//	김민주 ======================================================================================================	
// 가격 가져오는 변수
// 해외 패키지
	var hawaii_package = '';
	var europe_package = '';
	var cruise_package = '';


//	국내 패키지 정보를 담은 변수(지금은 문자열로 나옵니다.)
	hawaii_package = $('#oves1 >#ove1').next().attr('id');	//hawaii_package_price#1500000
	europe_package = $('#oves2 >#ove2').next().attr('id');	//europe_package_price#3000000
	cruise_package = $('#oves3 >#ove3').next().attr('id');	//cruise_package_price#5000000
	
//	각 패키지 정보를 담은 값을 로컬스토리지(https://www.daleseo.com/js-web-storage/ 설명 읽어보셔야 할거 같아요.)에
//  저장하면 같은 로컬호스트의 js파일 어디든  window.localStorage.getItem('키값')으로 불러와 사용 가능하다.
//	생성된 로컬스토리지 확인은 개발자도구 => application => storage => localStorage
//	김민주 ======================================================================================================	
	
	img1.css("cursor","pointer").click(function(){
//김민주 ================================================================
//		이미지 클릭 시 하와이 패키지 정보를 담은 변수를 로컬스토리지에 저장
		window.localStorage.setItem('hawaii_package',hawaii_package);
		location.href = 'detail.html';

	});
	img1.next().next().hide();
	img1.hover(function(){
		img1.next().next().show(500);
	},function(){
		
	})
	
	img2.css("cursor","pointer").click(function(){
//김민주 ================================================================
//		이미지 클릭 시 유럽 패키지 정보를 담은 변수를 로컬스토리지에 저장		
		window.localStorage.setItem('europe_package',europe_package);
		location.href = 'detail.html';

	});
	img2.next().next().hide();
	img2.hover(function(){
		img2.next().next().show(500);
	},function(){
		
	})
	
	img3.css("cursor","pointer").click(function(){
//김민주 ================================================================
//		이미지 클릭 시 유럽 패키지 정보를 담은 변수를 로컬스토리지에 저장
		window.localStorage.setItem('cruise_package',cruise_package);
		location.href = 'detail.html';

	});
	img3.next().next().hide();
	img3.hover(function(){
		img3.next().next().show(500);
	},function(){
		
	})
	
});