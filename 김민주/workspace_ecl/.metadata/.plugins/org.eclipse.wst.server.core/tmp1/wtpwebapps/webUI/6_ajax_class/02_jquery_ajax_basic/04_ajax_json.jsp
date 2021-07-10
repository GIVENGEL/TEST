<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>
	<script  type="text/javascript"  src="libs/jquery-1.9.1.min.js"> </script>
	<script type="text/javascript">
	$(function(){
		// 서버로 보낼 데이터
		var param = {cate : 'kkkk', name : 'oooo'}; // json 구조로 만들어진 객체
		$.ajax({
			type : "get",  // 내용이 적으니 get
			url : "04_server.jsp",
			data : param,		// 서버로 보내는 데이터
			dataType : 'text',   // 서버로 부터 받는 데이터 타입 / 종류 ==  text/xml/html/json....
			// 추후에 json 라이브러리 이용하여 json 으로 받자
			success : function(result){		// 공부를 위한 함수자체를 success에 선언 원래는 밖에다 함수 선언하고 함수자체를 변수로서 불러와야함
				alert(result);
				var obj = {};
				obj = eval(result); // 변수 객체화시켜서 변수에 저장
				$('#cate').val(obj.first);	// 객체화시킨 변수의 first를 #cate에 저장
				$('#name').val(obj.second);	// 객체화시킨 변수의 second를 #cate에 저장
			}		
		}) // end ajax
		
		
		
		
	})// end onload
</script>
</head>

<body>
서버로부터 넘겨받은 데이터<br/>
첫번째 데이터 : <input type="text" name="" id="cate"/><br/>
두번째 데이터 : <input type="text" name="" id="name"/><br/>
</body>
</html>


