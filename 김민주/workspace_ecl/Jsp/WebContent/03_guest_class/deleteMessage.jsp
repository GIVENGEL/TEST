<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="guest.model.*" %>
<%
	//한글처리
	request.setCharacterEncoding("utf-8");
	// 전페이지에서 받아온 메세지아이디(글번호)를 변수에 저장한다.
	String messageId = request.getParameter("messageId");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 방명록 삭제 </title>
</head>
<body>
	메세지를 삭제하려면 암호를 입력하세요. <br/><br/>
	<form action="deleteConfirm.jsp" method="post">
		<!-- 인풋태그를 hidden으로 숨기고 value에 전페이지에서 받아온 값을 지정해준다. -->
		<input type="hidden" name='messageId' value='<%=messageId%>'/>
		암호 : <input type="password" name="password" />
		<input type="submit" value="메세지 삭제"/>
	</form>
</body>
</html>