<%@ page contentType="text/xml; charset=utf-8" %>
<%@ page language="java" import="java.sql.*"%>

<%
String driverName ="com.mysql.jdbc.Driver";
String url = "jdbc:mysql://kic.cj7mov3fe2u4.ap-northeast-2.rds.amazonaws.com/";
String dbName = "COMPANY";
String user = "admin";   
String pass = "rladlscjf0!";


   Class.forName(driverName);
   Connection connection=DriverManager.getConnection(url+dbName,user,pass);
   
   String sql = "select * from EMP where ENAME = upper(?)";
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

