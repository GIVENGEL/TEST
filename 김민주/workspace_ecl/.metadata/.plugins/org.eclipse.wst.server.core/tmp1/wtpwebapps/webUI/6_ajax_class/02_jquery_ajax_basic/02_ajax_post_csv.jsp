<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script  type="text/javascript"  src="libs/jquery-1.9.1.min.js"> </script>
<script type="text/javascript">
	$(function() {
		// 키 : 벨류 , 키 : 벨류  == json 형태
		var param = {
			cate : 'book',
			name : 'hong'
		}
		// get방식으로 01_server.jsp로 param 을 보내면 parseData 실행해라
		// 사용자는 어차피 url 에 정보가 표시되지 않지만 용량의 문제로 post,get의 방식을 구분해서 사용한다.
		// 보낼 정보가 많으면 post
// 		$.post('02_server.jsp', param, parseData);
		$.ajax({
			type : 'post',   			// type 기본값은 웹브라우저마다 다르므로 지정해주는걸 권장한다.
			url : '02_server.jsp',
			data : param,
			dataType : text,     		// 데이터타입 받을때의 데이터 타입 / 기본값은 text
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
서버로부터 넘겨받은 데이터<br/>
첫번째 데이터 : <input type="text" name="" id="cate"/><br/>
두번째 데이터 : <input type="text" name="" id="name"/><br/>
</body>
</html>


