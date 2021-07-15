<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multiInsert.jsp</title>
</head>
<body>
<h3> 멤버 목록 보기</h3>
<table border="1">
	<thead>
		<th>아이디</th>
		<th>이름</th>
		<th>나이</th>
	</thead>
	<tbody>
		<tr>
			<td>${vo.id }</td>
			<td>${vo.name }</td>
			<td>${vo.age }</td>
		</tr>
		
	</tbody>
</table>


</body>
</html>