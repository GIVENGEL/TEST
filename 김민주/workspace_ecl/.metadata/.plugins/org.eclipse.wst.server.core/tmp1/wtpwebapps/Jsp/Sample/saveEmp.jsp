<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "sample.*" %>
<%
	// 한글처리
	request.setCharacterEncoding("utf-8");

	// 1. 이전 화면에서 사용자 입력값을 얻어오기
	String eno = request.getParameter("eno");	// 파라메터로 받는건 무조건 스트링만 된다.
	String ename = request.getParameter("ename");	
	String job = request.getParameter("job");	
	String salary = request.getParameter("salary");	
	
	// 2. 입력값을 vo 객체의 변수로 지정
	EmpVO vo = new EmpVO();
	vo.setEno(Integer.parseInt(eno)); // 그래서 같은 자료형으로 형변환해줘야 한다.
	vo.setEname(ename); 
	vo.setJob(job);
	vo.setSalary(Integer.parseInt(salary)); 
	
	// 3. DAO 의 insert함수 호출
	EmpDAO dao = EmpDAO.getInstance();
	dao.insertEmp(vo);
	
	response.sendRedirect("selectEmp.jsp");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 사원등록 화면 </title>
</head>
<body>
	입력되었습니다.
	
</body>
</html>