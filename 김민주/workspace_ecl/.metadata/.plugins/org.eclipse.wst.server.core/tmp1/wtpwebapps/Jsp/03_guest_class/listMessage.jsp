<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="guest.model.*,guest.service.*"%>
<%@ page import="java.util.List"%>

<%
	// 페이지 번호 넘겨 받기
	String pNume = request.getParameter("page");
	

	// 전체 메세지 레코드 검색
	ListMessageService service = ListMessageService.getInstance();
	List <Message> mList =  service.getMessageList(pNume);
 	
	// 전체 페이지 수 얻어오기
	int totalPageCount = service.getTotalCount();
	
	
	
	
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록 목록</title>
</head>
<body>

	<% if( mList.isEmpty() ) { %>
	남겨진 메세지가 하나도~~없
	습니다.
	<br>
	<% } else { %>
	<table border="1">
		<%
		// 향상된 포문
		for(Message msg : mList){
	%>
		<tr>
			<td><%=msg.getMessageId() %></td>
			<td><%=msg.getGuestName() %></td>
			<!-- 삭제하기를 누르면 글번호를 포함한 deleteMessage.jsp로 이동한다. 이때 meesageId는 파라매터로 같이 전송된다. -->
			<td><a href="deleteMessage.jsp?messageId=<%=msg.getMessageId()%>">[삭제하기]</a></td>
		</tr>
		<tr>
			<td colspan='3'>
			<textarea cols=35 rows=3 style="font-family: '돋움', '돋움체'; font-size: 10pt; font-style: normal; line-height: normal; color: #003399; background-color: #D4EBFF; border: 1 solid #00009C;"><%=msg.getMessage() %></textarea>
			</td>
		</tr>

		<%} // end else - for%>
	</table>
	<% } // end if-else %>


	<a href="insertMessage.jsp">글쓰기</a>
	<hr />
	<!-- 페이지 번호 출력 -->
	<%for(int i = 1; i<=totalPageCount; i++){ %>
		<a href="listMessage.jsp?page=<%=i%>">[<%=i %>]</a>
	<%} %>	<!-- end for -->
</body>
</html>