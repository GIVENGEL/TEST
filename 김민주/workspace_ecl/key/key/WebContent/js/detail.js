$(function(){
//	김민주 ======================================================================================================
// 	domestic.js 에서 저장한 localStorage 의 키값을 각 변수에 담음 
//	localStorage 는 보존기간이 영구적이라고 나오는데 sessionStorage는 웹 브라우저 종료시 삭제라고 나와있어서
//	sessionStorage를 쓰는게 좋을거같은데 가격정보는 중요한 정보가 아니어서 localStorage 로 사용했습니다.
//	로컬스토리지에 변수 값이 있다면 가져오고 가져온 내용을 name,price로 분류하는 작업
//	if (localStorage.getItem('sokcho_package') != null){
//		var sokcho_packageInfo = window.localStorage.getItem('sokcho_package');
//		var sokcho_package_name = sokcho_packageInfo.substr(0,6);
//		var sokcho_package_price = parseInt(sokcho_packageInfo.slice(-6),10);
//			$('#packageInfo').text("["+sokcho_package_name+"] 패키지 구입 절차");
//		}
//	else if (localStorage.getItem('jeju_package') != null){
//		var jeju_packageInfo = window.localStorage.getItem('sokcho_package');
//		var jeju_package_name = jeju_packageInfo.substr(0,4);					//	jeju
//		var jeju_package_price = parseInt(jeju_packageInfo.slice(-6),10);		//	400000
//			$('#packageInfo').text("["+jeju_package_name+"] 패키지 구입 절차");
//		}
//	else if (localStorage.getItem('yeosu_package') != null){
//		var yeosu_packageInfo = window.localStorage.getItem('yeosu_package');
//		var yeosu_package_name = yeosu_packageInfo.substr(0,5);					//	yeosu
//		var yeosu_package_price = parseInt(yeosu_packageInfo.slice(-6),10);		//	300000
//			$('#packageInfo').text("["+yeosu_package_name+"] 패키지 구입 절차");
//		}
//	else if (localStorage.getItem('hawaii_package') != null){
//		var hawaii_packageInfo = window.localStorage.getItem('hawaii_package');
//		var hawaii_package_name = hawaii_packageInfo.substr(0,6);  				//	hawaii
//		var hawaii_package_price = parseInt(hawaii_packageInfo.slice(-7),10);	//	1500000
//			$('#packageInfo').text("["+hawaii_package_name+"] 패키지 구입 절차");
//		}
//	else if (localStorage.getItem('europe_package') != null){
//		var europe_packageInfo = window.localStorage.getItem('europe_package');
//		var europe_package_name = europe_packageInfo.substr(0,6);				//	europe
//		var europe_package_price = parseInt(europe_packageInfo.slice(-7),10);	//	3000000
//			$('#packageInfo').text("["+europe_package_name+"] 패키지 구입 절차");
//		} 
//	else if (localStorage.getItem('cruise_package') != null){
//		var cruise_packageInfo = window.localStorage.getItem('cruise_package');
//		var cruise_package_name = cruise_packageInfo.substr(0,6);				//	cruise
//		var cruise_package_price = parseInt(cruise_packageInfo.slice(-7),10);	//	5000000
//			$('#packageInfo').text("["+cruise_package_name+"] 패키지 구입 절차");
//	}
//	김민주 ======================================================================================================	
	let buy=$('#buy');
	
	buy.click(function(){
		location.href = 'end.html';

		
	})
});