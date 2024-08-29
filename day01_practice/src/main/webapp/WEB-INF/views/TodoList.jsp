<%@page import="myweb.model.TodoVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>할 일 리스트</h1>
<a href="input">할 일 입력</a>
<a href="detail">할 일 보기</a>
<a href="modify">할 일 수정</a>
<a href="delete">할 일 삭제</a>
<table border="1" width="100%">
	<tr>
		<th>NO</th>
		<th>NAME</th>
		<th>DONE</th>
		<th>EDIT</th>
		<th>DELETE</th>
	</tr>
<%
	ArrayList<TodoVo> todoList = (ArrayList<TodoVo>) request.getAttribute("todoList");
	for(TodoVo todo : todoList) {
%>
	<tr>
		<td><%=todo.getNo() %></td>
		<td><%=todo.getTitle() %></td>
		<td><%=todo.isDone() %></td>
		<td><a href="modify?no=<%=todo.getNo() %>">수정</a></td>
		<td><a href="delete?no=<%=todo.getNo() %>">삭제</a></td>
	</tr>
<%
	};
%>
</table>

</body>
</html>