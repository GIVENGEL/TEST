/**
 * 
 */

$(function(){
//	validate = 속성
	$('form').validate({
		rules : {
			name : {required : true},	// name을 입력하지 않으면 넘어가지 않게한다. (필수니? true)
			email : {required : true,	
					email : true },		// email 형식에 맞는지
			url : { url : true},
			password : {minlength : 6,
						maxlength : 12},
			passconf : {equalTo : '#password'},
			
		},
		success : function(label){
			label.addClass('valid');
			label.text('성공')	// 출력은 안되지만 녹색체크 표시
		}
	});
//	attr()가 안먹힌다면 ====> prop() 을 사용 
	$('.check-all').click(function(){
//		클릭하면 전부 클릭하는 느낌!
//		$('.check-all').click(function(){

//		밑의 함수를 축약한 것
//		.agree를 check해라, $('.check-all').prop("checked") 가 true라면
		$(".agree").prop("checked",$('.check-all').prop("checked"));
		
		// 위 조항 모두를 클릭했을때
//		if($('.check-all').prop("checked")){
//			// 위 조항 모두가 체크 되어있다면
//			$("input[type=checkbox]").prop("checked",true);
//			// 모든 체크박스를 true로
//		}
//		else{
//			// 위 조항 모두가 체크가 되어있지 않을시
//			$("input[type=checkbox]").prop("checked",false);
//			// 모든 체크박스를 false로
//		}

	})
	
})