<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = 'java.util.*' %>
<%@ page import = 'sample.*' %>
<%
	// 한글처리
	request.setCharacterEncoding("utf-8");
	

	// 이전 화면에서 넘겨주는 파라메터 값 받기
	String eno = request.getParameter("eno");
	// DAO 에 viewEmp()호출
	EmpDAO dao = EmpDAO.getInstance(); // 인스턴스객체 생성(싱글톤)
	EmpVO vo = dao.viewEmp(eno);
// 	EmpVO vo = dao.viewEmp(eno);
	// 아래 화면에 해당 사원의 각각의 정보 출력

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
			<td>담당사수</td>
			<td>고용일</td>
			<td>급여정보</td>
			<td>COMMISSION</td>
			<td>부서번호</td>
			
		</tr>
		
			<tr>
				<td><%=vo.getEno() %></td>
				<td><%=vo.getEname() %></td>
				<td><%=vo.getJob() %></td>
				<td><%=vo.getManager() %></td>
				<td><%=vo.getHiredate() %></td>
				<td><%=vo.getSalary() %></td>
				<td><%=vo.getCommission() %></td>
				<td><%=vo.getDno() %></td>
			</tr>
			<tr>
				<td><a href="deleteEmp.jsp?eno=<%=vo.getEno() %>">삭제</a></td>
				<td><a href="selectEmp.jsp">이전</a></td>
				<td><a href="modifyEmp.jsp?eno=<%=vo.getEno() %>">수정</a></td>
			</tr>
	
	</table>
	
</body>
</html>