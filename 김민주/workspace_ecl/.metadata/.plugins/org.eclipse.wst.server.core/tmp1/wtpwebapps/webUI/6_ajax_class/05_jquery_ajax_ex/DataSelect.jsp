<%@page contentType="text/xml; charset=utf-8" %>
<%@ page language="java" import="java.sql.*"%>

<%
String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://kic.cj7mov3fe2u4.ap-northeast-2.rds.amazonaws.com/";
String dbName = "PRAC04";
String user = "admin";
String pass = "rladlscjf0!";



String rtn_xml="";

	Class.forName(driverName);
	Connection connection=DriverManager.getConnection(url+dbName,user,pass);
	
	String sql = "select * from ajax_temp";
	
	Statement stmt = connection.createStatement();
	ResultSet rs = stmt.executeQuery(sql);	
	
	rtn_xml += "<customer>";

	while (rs.next()){		
		rtn_xml += "<person>";
		rtn_xml += "<name>" + rs.getString("name") + " </name>";
		rtn_xml += "<age>" + rs.getString("age") +  "</age>";
		rtn_xml += "<tel>" + rs.getString("tel") +  "</tel>";
		rtn_xml += "<addr>" + rs.getString("addr") +  "</addr>";
		rtn_xml += "</person>";		
	}	
	rtn_xml += "</customer>";
	rs.close();
	stmt.close();
	connection.close();

	

// 	System.out.println(rtn_xml);
	
	out.write(rtn_xml);

%>