<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>응답 페이지</h1>
아이디:<%=id%><br>
비밀번호:<%=pw%>
</body>
</html>