<%@ page language="java" import="java.sql.*"%>
<%
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://kic.cj7mov3fe2u4.ap-northeast-2.rds.amazonaws.com/";
	String dbName = "PRAC04";
	String user = "admin";
	String pass = "rladlscjf0!";

	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String tel = request.getParameter("tel");
	String addr = request.getParameter("addr");

	Class.forName(driverName);
	Connection connection = DriverManager.getConnection(url + dbName, user, pass);
	// values('?') 자바는 "" 문자열 query문은 '' 로 감싸야 문자열
	String sql = "insert into ajax_temp(name, age, tel, addr) values(";
	sql += "'" + name + "','" + age + "','" + tel + "','" + addr + "')";

	Statement stmt = connection.createStatement();
	int result = stmt.executeUpdate(sql);

	stmt.close();
	connection.close();

	out.write(String.valueOf(result));
%>