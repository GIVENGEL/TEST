<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
<title>가입</title>
</head>
<body>

가입해라
<form name="frm" action="empInsert.jsp" >
<table border="1">
	<tr><td>사원번호</td><td><input type="text" name="empno" size="3"/></td></tr>
	<tr><td>사원명</td><td><input type="text" name="ename" size="15"/></td></tr>
	<tr><td>직업</td><td><select name="job" id="job">
								<option value="SALESMAN">SALESMAN</option>
								<option value="MANAGER">MANAGER</option>
								<option value="CLERK">CLERK</option>
						</select></td></tr>
	<tr><td>부서</td><td><select name="deptno" id="deptno">
								<option value="10">NEW YORK</option>
								<option value="20">DALLAS</option>
								<option value="30">CHICAGO</option>
								<option value="40">BOSTON</option>
						</select></td></tr>
	<tr><td><input type="submit" value="입력"/></td></tr>
</table>
</form>
</body>
</html>