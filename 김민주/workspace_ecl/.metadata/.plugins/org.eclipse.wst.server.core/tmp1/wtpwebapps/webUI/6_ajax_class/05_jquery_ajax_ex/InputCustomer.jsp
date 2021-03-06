<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>고객관리 프로그램</title>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#btnInsert').click(function() {
			var param = {	name : $('#name').val(),
							age : $('#age').val(),
							tel : $('#tel').val(),
							addr : $('#addr').val()
						}	 // end param
						
			$.ajax({
				type : 'post',
				data : param,
				url : 'DataInput.jsp',
				success : function(result) {
// 					alert('<'+result+'>')
					if(result.trim() == '1'){
						alert('입력되었습니다.')
					}
				}

			})
		}); // end btnInsert click

		$('#btnSelect').click(function() {
			$.ajax({
				type : 'get',
				url : 'DataSelect.jsp',
// 				dataType : 'text' 디폴드값이므로 잠시 주석
				success : parseData		// ()를 붙히면 함수를 호출하는 꼴이 되버림.
			});
			function parseData(data){
// 			 	alert(data)
//				$('선택자',대상)
				// 해당 대상에서 선택자를 찾고자 할때 
			var person = $('person', data);
			$('#tdb').empty();
// 			alert(person.length);
				person.each(function(){
				 	var name = $('name', this).text();
				 	//나머지도 진행해봐
				 	var age = $('age',this).text();
				 	var tel = $('tel',this).text();
				 	var addr = $('addr',this).text();
				 	$('#tbd').append('<tr>');
				 	$('#tbd').append('<td>'+name+'</td>');				 	
				 	$('#tbd').append('<td>'+age+'</td>');				 	
				 	$('#tbd').append('<td>'+tel+'</td>');				 	
				 	$('#tbd').append('<td>'+addr+'</td>');				 	
				 	$('#tbd').append('</tr>');
				})

			}
		}); // end btnSelect click
	})
</script>

</head>


<!-- <body> -->
<body>

	<h2>고객정보 입력</h2>

	<form name="inForm" method="post">
		<table border=1>
			<tr>
				<td width="80" align="center">Name</td>
				<td width="50" align="center">Age</td>
				<td width="100" align="center">Tel</td>
				<td width="250" align="center">Addr</td>
			</tr>
			<tr>
				<td align="center"><input type="text" size="8" name="name"
					id="name"></td>
				<td align="center"><input type="text" size="4" name="age"
					id="age"></td>
				<td align="center"><input type="text" size="12" name="tel"
					id="tel"></td>
				<td align="center"><input type="text" size="30" name="addr"
					id="addr"></td>
			</tr>
			<tr>
				<td colspan="4" align="center"><input type="button"
					id='btnInsert' value="입력"></td>
			</tr>
		</table>

		<br>
		<hr>

		<h2>고객정보 목록보기</h2>
		<table border='1' style="width: 510">
			<tr>
				<td align="right"><input type="button" id='btnSelect'
					value="가져오기"></td>
			</tr>
		</table>
		<table border=1 id="listTable">
			<tr>
				<td width="80" align="center">Name</td>
				<td width="50" align="center">Age</td>
				<td width="100" align="center">Tel</td>
				<td width="250" align="center">Addr</td>
			</tr>
			<tbody id='tbd'></tbody>
		</table>
		<div id="myDiv"></div>

	</form>
</body>
</html>