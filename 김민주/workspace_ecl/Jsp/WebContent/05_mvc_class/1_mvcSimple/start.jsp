<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String prjName= "/Jsp"; %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 상대경로 -->
	<a href="simpleView.jsp">기존방식 상대경로</a><br/>
	<!-- 절대경로 -->
	<a href="<%=prjName %>/05_mvc_class/1_mvcSimple/simpleView.jsp">기존방식 절대경로</a><br/>
	<hr/>
	
	<a href='<%=prjName%>/sc'> MVC 방식</a>
	<a href='<%=prjName%>/sc?type=first'> MVC 방식</a>
	<a href='<%=prjName%>/min.do?type=first'> MVC 방식</a>
	
</body>
</html>