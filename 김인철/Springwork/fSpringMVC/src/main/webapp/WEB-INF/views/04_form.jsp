<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_form.jsp</title>
</head>
<body>
폼의 입력값들 여기에 출력하기
아이디 : ${memberVO.id} <br>
이름 : ${memberVO.name} <br>
나이 : ${memberVO.age}
<hr>
${sessionScope.login }
</body>
</html>