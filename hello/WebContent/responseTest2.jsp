<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<h1>responseTest2.jsp</h1>
리다이렉트(포워딩)된 페이지<br>
아이디:<%= request.getParameter("id") %><br>
비번:<%= request.getParameter("pw") %><br>

</body>

</html>