<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 사원등록 화면 </title>
</head>
<body>
	<!-- 사번,이름,업무,월급 -->
	<!-- get은 주소에 정보가 그대로 노출된다. -->
	<form action="saveEmp.jsp" method ="post">  
	<table>
		<tr>
			<td>사번</td>
			<td><label for="eno"><input type="text" id="eno" name="eno" placeholder="사번"/></label></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><label for="ename"><input type="text" id="ename" name = 'ename'/></label></td>
		</tr>
		<tr>
			<td>업무</td>
			<td><label for="job"><input type="text" id="job"name = 'job'/></label></td>
		</tr>
		<tr>
			<td>월급</td>
			<td><label for="salary"><input type="text" id="salary" name = "salary" /></label></td>
		</tr>
		<tr>
			<td colspan ="2" align='center'>
			<input type="submit" value="가입" />
			<input type="reset" value="취소" />
			</td>
		</tr>
		<tr>
			<td><a href="start.jsp">이전</a></td>
		</tr>
	</table>
	</form>
	
</body>
</html>