<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "sample.*" %>    
    
<% 
	// 1. 삭제할 사번 넘겨받기
	String eno = request.getParameter("eno"); // 변수로 안담으면 저장이 안된다.
	// 2. DAO deleteEmp() 호출시 사번 넘겨주기
	EmpDAO dao = EmpDAO.getInstance(); // static 으로 선언해놨기에 클래스명으로 접근 가능
	int result = dao.deleteEmp(eno);
	if(result > 0 ){ // 삭제가 되었다면 
		response.sendRedirect("selectEmp.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사정 정보 삭제</title>
</head>
<body>

</body>
</html>