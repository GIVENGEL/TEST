<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%  //--------------------------- 값 지정
	pageContext.setAttribute("name", "KIM");	// 안씀
	request.setAttribute("name", "SEUNGMIN");	// 해당 페이지에서만 유지
	session.setAttribute("name", "DOKDO");		// 웹브라우저가 종료되거나 유지시간을 변경하지않았다면 30분이 디폴트값
	application.setAttribute("name", "KOREA");	// 안씀
	//application.log("FirstPage.jsp : " + pageContext.getAttribute("name") + "님 접속");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 첫번째 페이지 </title>
</head>
<body>

하나의 페이지 속성 : <%= pageContext.getAttribute("name") %> <br>
하나의 요청 속성 :	 <%= request.getAttribute("name") %> <br>
하나의 세션 속성 :	 <%= session.getAttribute("name") %> <br>
하나의 어플리케이션 속성 : <%= application.getAttribute("name") %> <br>

<!-- #############  -->
<a href="SecondPage.jsp">다음페이지 이동</a>

<!-- redirect 로 이동  -->
<!-- request도 동일한 페이지를 보여주지만 새로운 주소로 열린 웹브라우저라 저장이 안됨 -->
<%-- <%response.sendRedirect("SecondPage.jsp"); %>	 --%>
<!-- 페이지 forward 이동된다면  -->
<!-- request 유지된다. -->
<jsp:forward page="SecondPage.jsp"></jsp:forward>

</body>
</html>