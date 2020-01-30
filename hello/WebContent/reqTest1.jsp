<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>reqTest1.jsp</h1>
	<%
	request.setCharacterEncoding("UTF-8");
	String name=request.getParameter("name");
	String gender=request.getParameter("gender");
	String[] hobby=request.getParameterValues("hobby");
	%>
	
		 

	<table border="1" style="width:400px">
		<tr>
			<th><%="이름" %></th>
			<th><%="성별"%></th>
			<th><%="취미"%></th>
		</tr>
		<tr>
			<td><%=name %></td>
			<td><%=gender %></td>
			<td><% for(int i=0;i<hobby.length;i++){ %>
			<%=hobby[i] %><br>
			<% } %></td>
		</tr>
		
	</table>
	
	이름1:<%=name%><br>
	성별2:<%=gender%><br>
	취미3:<% for(int i=0;i<hobby.length;i++){ %>
		<b><%=hobby[i] %></b><br>
		<% } %>
</body>
</html>