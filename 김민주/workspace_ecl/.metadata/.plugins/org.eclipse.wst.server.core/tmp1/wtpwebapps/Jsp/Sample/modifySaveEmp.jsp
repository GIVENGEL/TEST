<%@page import="java.text.DateFormat"%>
<%@page import="java.sql.Date"%>
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
	String manager = request.getParameter("manager");	
	String hiredate = request.getParameter("hiredate");	
	String salary = request.getParameter("salary");	
	String commission = request.getParameter("commission");	
	String dno = request.getParameter("dno");
	
	// 2. 입력값을 vo 객체의 변수로 지정
	EmpVO vo = new EmpVO();
// 	데이터타입

	vo.setEno(Integer.parseInt(eno)); // 그래서 같은 자료형으로 형변환해줘야 한다.
	vo.setEname(ename); 
	vo.setJob(job);
	vo.setManager(Integer.parseInt(manager));
	vo.setHiredate(hiredate);
	vo.setSalary(Integer.parseInt(salary)); 
	vo.setCommission(Integer.parseInt(commission)); 
	vo.setDno(Integer.parseInt(dno)); 
	
	// 3. DAO 의 modifyEmp함수 호출
	EmpDAO dao = EmpDAO.getInstance();
	dao.modifyEmp(vo);
	// 수정 정보를 viewEmp로 보내줘야한다.
	response.sendRedirect("viewEmp.jsp?eno="+eno);
	
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