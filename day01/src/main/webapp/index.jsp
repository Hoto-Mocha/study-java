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
<%! // <- !를 붙여야 선언문이 된다.
// 선언문: 멤버 필드, 멤버 메서드 등
// service 함수 외부에 들어가는 내용
	private String name = "홍길동";
	public String sayHello() {
		return name + "님 안녕하세요!";
	}
%>

<%
// service 함수 내부에 들어가는 내용
// 스크립트릿: 이 부분에서 자바 소스코드 사용 가능
// JSP 파일을 Tomcat에서 실행하면 Servelt JAVA 소스 코드로 변환됨
// 변환된 소스 코드가 컴파일되어 .class 파일이 생성됨
// Tomcat이 .class 파일을 브라우저에 실행하도록 만들어 준다(HTML 형식으로 바뀜).

// src영역에 선언된 JAVA 객체 사용 가능.(사용할 클래스 import 필수)
TodoVo todo = new TodoVo(101, "집안 정리하기", true);
%>

<p>결과: <%=todo%> </p>
<p><%=sayHello() %></p>

<h1>Hello JSP World</h1>
<a href="app">app 실행</a>


</body>
</html>