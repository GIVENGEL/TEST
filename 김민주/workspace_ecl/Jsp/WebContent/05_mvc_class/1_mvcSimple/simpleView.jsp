<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
	//************************************************************
	// 이전 화면에서 넘겨받는 파라메터
	String type = request.getParameter("type");
	
	// request 객체에 저장한 것을 얻어 올 때 
	Object obj = request.getAttribute("param");
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 메인이라네 </title>
</head>
<body>
	
		<%= type%> // <%= obj %> <br/>
		복잡하다고 지나친 좌절과 놀람은 금물입니다. <br/><br/>
		<img src="05_mvc_class/1_mvcSimple/imgs/sponge_1.JPG"/><br/><br/>
		<!-- 절대경로 -->
		<img src="/Jsp/05_mvc_class/1_mvcSimple/imgs/sponge_1.JPG"/><br/><br/>

</body>
</html>