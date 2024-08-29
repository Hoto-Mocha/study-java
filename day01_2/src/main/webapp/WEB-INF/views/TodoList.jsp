<%@page import="java.util.ArrayList"%>
<%@page import="myweb.model.TodoVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>할 일 목록</h1>
<a href="input">할일 입력</a><br>
<a href="delete">할일 삭제</a><br>
<a href="detail">할일 정보</a><br>
<a href="modify">할일 수정</a>
<table width="100%" border="1">
            <tr>
                <th>ID</th>
                <th>TITLE</th>
                <th>상태</th>
                <th>수정</th>
                <th>삭제</th>
            </tr>
    <%
    	/*ArrayList<TodoVo> todoList = new ArrayList<TodoVo>();
    	todoList.add(new TodoVo(101, "집가기", false));
    	todoList.add(new TodoVo(102, "집나오기", true));
    	todoList.add(new TodoVo(103, "집사기", false));*/
    	ArrayList<TodoVo> todoList = (ArrayList<TodoVo>) request.getAttribute("todoList");
        for(int i=0; i < todoList.size(); i++) {
        	TodoVo todo = todoList.get(i);
    %>
            <tr>
                <td><%= i %></td>
                <td><a href="detail?no=<%= todo.getNo() %>"><%= todo.getTitle() %></a></td>
                <td><%= todo.isDone() %></td>
                <td><a href="modify?no=<%= todo.getNo() %>">수정</a></td>
                <td><a href="delete?no=<%= todo.getNo() %>">삭제</a></td>
            </tr>
    <%
        };
    %>
</table>
</body>
</html>