<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix='c' uri ='http://java.sun.com/jsp/jstl/core'%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 변수 선언 -->
	<c:set var = 'gender' value='male'></c:set>
	<c:set var = 'age'>15</c:set>
	<!-- 제어문 -->
<!-- 	젠더라는 변수가 'male 이니깐 남성입니다. 출력 -->
	<c:if test="${gender == 'male' }">남성입니다.</c:if>
	<c:if test="${gender eq 'female' }">여성입니다.</c:if>
	<c:if test="${age ge '20' }">성인입니다.</c:if>
	<hr>
	
	<c:choose>
		<c:when test="${age lt 10 }">어린이</c:when>
		<c:when test="${age gt 10 and age lt 20 }">청소년</c:when>
		<c:otherwise>어른</c:otherwise>
	</c:choose>
	<hr>
	
	<c:set var='sum' value='0'></c:set>
	<c:forEach var='i' begin='1' end='100'>
		<c:set var = 'sum' value='${sum + i }'></c:set>
	</c:forEach>
	
	1~100 까지의 합 : ${sum }<br/>
	
	<hr>
	<!--1~100까지 홀수의 합과 짝수의 합 -->
<%-- 	<c:set var='sum1' value='0'></c:set> --%>
<%-- 	<c:forEach var='i' begin='1' end='100'> --%>
<%-- 		<c:if test='${i mod 2 == 1}'> --%>
<%-- 			<c:set var='sum1' value='${ sum1 + i}'></c:set> --%>
<%-- 		</c:if> --%>
<%-- 	</c:forEach> --%>
<%-- 		<c:set var='sum2' value='0'></c:set> --%>
<%-- 	<c:forEach var='i' begin='1' end='100'> --%>
<%-- 		<c:if test='${i mod 2 eq 0}'> --%>
<%-- 			<c:set var='sum2' value='${ sum2 + i}'></c:set> --%>
<%-- 		</c:if> --%>
<%-- 	</c:forEach> --%>
<c:forEach var='i' begin='1' end='100'>
	<c:choose>
		<c:when test="${i%2==0 }">
			<c:set var='sum1' value='${sum1+i }'></c:set>
		</c:when>
		<c:when test="${i%2==1 }">
			<c:set var='sum2' value='${sum2+i }'></c:set>
		</c:when>
	</c:choose>
</c:forEach>
	1~100 중 짝수 합 : ${sum1 } <br />
	1~100 중 홀수 합 : ${sum2 } <br />
	
	
</body>
</html>