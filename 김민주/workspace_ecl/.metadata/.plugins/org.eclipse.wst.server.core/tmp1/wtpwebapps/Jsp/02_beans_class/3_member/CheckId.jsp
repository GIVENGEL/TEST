<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "member.beans.*" %>
<%@ page import="java.sql.*"%>
<%
// 	String userId = request.getParameter("userId");
// 	boolean result = MemberDao.getInstance().isDuplicatedId(userId);
%>
<%
String driverName ="com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://kic.cj7mov3fe2u4.ap-northeast-2.rds.amazonaws.com/";
String dbName = "PRAC02";
String user = "admin";   
String pass = "rladlscjf0!";


   Class.forName(driverName);
   Connection connection=DriverManager.getConnection(url+dbName,user,pass);
   
   String sql = "select * from memberTest where id = upper(?)";
//    System.out.println(sql);
   PreparedStatement ps = connection.prepareStatement(sql);
   ps.setString(1, request.getParameter("id"));
   ResultSet rs = ps.executeQuery(); 

	String result="NO";
	if (rs.next()){		
		result = "YES";
	}
	out.print(result);
%>
<%-- <%
	String id = request.getParameter("id");
	MemberDao.getInstance().isDuplicatedId(id);
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 아이디 중복 확인 </title>
</head>
<body>
<%-- <%
	if(result) {
%>
		사용중인 아이디가 있습니다. 다시 입력하여 주십시오.
<%  }else { %>
		사용할 수 있는 아이디입니다.
<%  } %> --%>
</body>
</html>