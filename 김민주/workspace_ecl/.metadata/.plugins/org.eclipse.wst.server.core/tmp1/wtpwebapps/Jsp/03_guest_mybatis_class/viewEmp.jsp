<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="mybatis.guest.service.EmpService" %>  
<%

		String empno = request.getParameter("eno");
		HashMap map = new HashMap();
		map.put("empno", empno);
		HashMap empView = EmpService.getInstance().empView(map);	
%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<table border='1'>
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>업무</td>
			<td>담당사수</td>
			<td>고용일</td>
			<td>연봉</td>
			<td>Commission</td>
			<td>부서번호</td>
			<td>부서명</td>
			<td>지역</td>
		</tr>
		<tr>
			<td><%=empView.get("EMPNO") %></td>
			<td><%=empView.get("ENAME") %></td>
			<td><%=empView.get("JOB") %></td>
			<td><%=empView.get("MGR") %></td>
			<td><%=empView.get("HIREDATE") %></td>
			<td><%=empView.get("SAL") %></td>
			<td><%=empView.get("COMM") %></td>
			<td><%=empView.get("DEPTNO") %></td>
			<td><%=empView.get("DNAME") %></td>
			<td><%=empView.get("LOC") %></td>
		</tr>
		<tr><a href="empDelete.jsp?eno<%=empView.get("EMPNO")%>">삭제삭제</a></tr>
	</table>
	
	
</body>
</html>