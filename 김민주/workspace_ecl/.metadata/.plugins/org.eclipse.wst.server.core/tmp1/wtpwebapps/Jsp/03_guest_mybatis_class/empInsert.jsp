<%@ page language="java" contentType="text/html; charset=utf-8"%>
 <%@ page import="mybatis.guest.service.EmpService" %>   
 <%@ page import="java.util.*" %>   
  
 <!--  이전 폼에서 넘겨오는 데이타의 한글 처리  -->
 <% 
 	request.setCharacterEncoding("utf-8");
 %>
  

 <!-- 서비스의 메소드 호출  -->
 <%
 // 전페이지에서 받은 값 hashmap 에 저장
	String empno = request.getParameter("empno");
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	String deptno = request.getParameter("deptno");
	
	HashMap map = new HashMap();
	map.put("empno", empno);
	map.put("ename", ename);
	map.put("job", job);
	map.put("deptno", deptno);
	
	EmpService.getInstance().empInsert(map);
 
 %>
    
    
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
<title>입력</title>
</head>
<body>

입력되었는지 확인해보세요. <br/>
<a href="emp.jsp">목록보기</a>

</body>
</html>