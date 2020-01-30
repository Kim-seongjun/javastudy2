<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>responseTest1.jsp</h1>
아이디:<%= request.getParameter("id") %><br>
비번:<%= request.getParameter("pw") %><br>

<% //리다이렉트 포워딩
	//response.sendRedirect("responseTest2.jsp");

//디스패처 포워딩
	RequestDispatcher dis=
	request.getRequestDispatcher("responseTest2.jsp");
	dis.forward(request, response);
%>

</body>
</html>