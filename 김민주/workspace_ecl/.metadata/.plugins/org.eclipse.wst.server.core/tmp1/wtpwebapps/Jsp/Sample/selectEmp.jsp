<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = 'java.util.*' %>
<%@ page import = 'sample.*' %>
<%
//  EmpDAO클래스의 인스턴스 객체 생성
// 	EmpDAO dao = new EmpDAO(); // 싱글톤으로 만들어줬기 때문에 사용 못함
	EmpDAO.getInstance();
// 	dao의 메소드 중 selectEmp() 메소드를 리스트에 저장
	List<EmpVO> list = EmpDAO.getInstance().selectEmp();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 사원 목록 </title>
</head>
<body>
	
	<table border = '1'>
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>업무</td>
			<td>담당 사수</td>
			<td>급여정보</td>
		</tr>
		<% for(EmpVO vo : list){ %>
			<tr>
				<td><%=vo.getEno() %></td>
				<td><a href='viewEmp.jsp?eno=<%=vo.getEno() %>'><%=vo.getEname() %></a></td>
				<td><%=vo.getJob() %></td>
				<td><%=vo.getManager() %></td>
				<td><%=vo.getSalary() %></td>
			</tr>
		<%} // end of for %>
		<tr>
			<td><a href="start.jsp">이전</a></td>
		</tr>
	</table>
	
</body>
</html>