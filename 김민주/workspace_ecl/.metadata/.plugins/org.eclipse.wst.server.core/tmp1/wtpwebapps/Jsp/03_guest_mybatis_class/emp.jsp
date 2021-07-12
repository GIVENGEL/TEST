<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*" %>
 <%@ page import="mybatis.guest.service.EmpService" %>  
  
    
<%

// 	HashMap map = new HashMap(); 
	List<HashMap> mList = EmpService.getInstance().empSelect();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>	사원정보 </title>
</head>
<body>
	<!-- table 구조로 사원번호/사원명/업무/부서명 출력하기  -->
	<table border='1'>
		<tr>
			<td>사원번호</td>
			<td>사원명</td>
			<td>업무</td>
			<td>부서명</td>
		</tr>
		<% for(int i=0; i<mList.size(); i++) { %>
		<tr>
			<td><%=mList.get(i).get("empno")  %></td>
			<td><a href="viewEmp.jsp?eno=<%=mList.get(i).get("empno")%>"><%=mList.get(i).get("ename") %></a></td>
			<td><%=mList.get(i).get("job") %></td>
			<td><%=mList.get(i).get("dno") %></td>
		</tr>
	<% } %>
		<tr><a href="empInsertForm.jsp">회원등록합시다.</a></tr>
	</table>
	
	
</body>
</html>