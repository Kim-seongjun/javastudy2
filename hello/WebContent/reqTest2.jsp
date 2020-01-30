<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>reqTest2.jsp</h1>
<%-- 서버의 도메인:<%=request.getServerName() %><br> --%>
URL:<%=request.getRequestURL()%><br>
컨텍스트 경로:<%=request.getContextPath()%><br>
URI:<%=request.getRequestURI()%><br>
<%-- <--호스트명<%=request.getRemoteHost()%><br> --%>
IP:<%=request.getRemoteAddr()%><br>
<%
int length=request.getContextPath().length();
String uri=request.getRequestURI();
String url=uri.substring(length);
%>
최종자원:<%=url %><br>
최종 자원:<%=request.getRequestURI().substring(6) %>
</body>
</html>