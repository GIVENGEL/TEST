<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="libs/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		// 키 : 벨류 , 키 : 벨류  == json 형태
		var param = {
			cate : 'book',
			name : 'hong'
		}
		// get방식으로 01_server.jsp로 param 을 보내면 parseData 실행해라
		//$.get('01_server.jsp', param, parseData); ==> 밑에 코딩의 축약형이다
		$.ajax({
			type : 'get',
			url : '01_server.jsp',
			data : param,
			success : parseData,
			error : function (){		// 자바스크립트는 함수도 변수값이다.
				alert('에러에러');		// 이처럼 일회성 에러함수는 바로 변수처럼 사용가능하다.
			}
		});
		
		
	function parseData(strText) {

			alert( strText );

			var aryData = strText.split("|");

			for (var i = 0; i < aryData.length; i++) {
				var param = aryData[i].split("=");
				if (param[0].trim() == 'cate') { // 공백제거를 하지 않으면 처음에 공백에 들어와서 cate를 찾지 못함
					document.getElementById("cate").value = param[1];
				}

				if (param[0].trim() == 'name') {
					document.getElementById("name").value = param[1];
				}

			}

		}

	})
</script>
</head>

<body>
	서버로부터 넘겨받은 데이터
	<br /> 첫번째 데이터 :
	<input type="text" name="" id="cate" />
	<br /> 두번째 데이터 :
	<input type="text" name="" id="name" />
	<br />
</body>
</html>


