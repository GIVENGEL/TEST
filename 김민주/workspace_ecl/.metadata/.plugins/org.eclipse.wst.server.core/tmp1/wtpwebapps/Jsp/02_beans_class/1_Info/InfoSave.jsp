<%@ page contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ page import = "info.beans.*" %>
<%
//   너무 자바스타일이기 때문에 액션태그를 사용한다.
	// 한글처리
	request.setCharacterEncoding("utf-8");
/*	// 1) 사용자 입력값 얻어오기
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	
	// 2) 1번의 입력값을 InfoBean 객체의 멤버로 지정(저장)
	InfoBean bean = new InfoBean(); // 다른 파일을 써야하니깐 page import해줘야함
	bean.setName(name);
	bean.setId(id);
 */	
%>
<jsp:useBean id="bean" class="info.beans.InfoBean">
<jsp:setProperty name='bean' property='*'></jsp:setProperty>
<%-- <jsp:setProperty name='bean' property='id'></jsp:setProperty> --%>
</jsp:useBean>
<!DOCTYPE html>
<html>
<body>
	<h2>  당신의 신상명세서 확인 </h2>
	<!-- InfoBean 의 멤버 출력 -->
	이   름  : <%=bean.getName() %><br/>
	주민번호 : <jsp:getProperty property="id" name="bean"/><br/>
	성  별   : <jsp:getProperty property="gender" name="bean"/><br/>  
	맞습니까????
</body>
</html>