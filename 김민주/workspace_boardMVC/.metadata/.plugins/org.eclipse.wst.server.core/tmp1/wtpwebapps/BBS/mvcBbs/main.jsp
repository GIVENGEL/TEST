<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% String projectName = "/BBS"; %>    


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록 메인</title>
</head>
<body>
	메인화면이라 . . . 그냥 상상하고 . . . 
	<a href="<%= projectName %>/BbsControl?cmd=list-page&page=null"> 방명록 </a><br/><br/>
	<a href="<%= projectName %>/BbsControl?cmd=main-page"> 홈 </a><br/><br/>
	<img src="imgs/image.gif"><br/>
</body>
</html>