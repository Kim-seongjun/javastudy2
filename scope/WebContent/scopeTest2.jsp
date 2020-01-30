<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scopeTest2.jsp</h1>
	<%
		request.setCharacterEncoding("UTF-8"); //한글깨짐 방지
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hidden = request.getParameter("includepage");
		//application 영역 저장
		application.setAttribute("id", "a_" + id);
		application.setAttribute("name", "a_" + name);
		application.setAttribute("hidden", "a_" + hidden);

		//session 영역 저장
		session.setAttribute("id", "s_" + id);
		session.setAttribute("name", "s_" + name);
		session.setAttribute("hidden", "s_" + hidden);

		//request 영역 저장
		request.setAttribute("id", "r_" + id);
		request.setAttribute("name", "r_" + name);
		request.setAttribute("hidden", hidden);

		//page 영역 저장
		pageContext.setAttribute("id", "p_" + id);
		pageContext.setAttribute("name", "p_" + name);
		pageContext.setAttribute("hidden", "p_" + hidden);

		//Dispatcher 포워딩-->req, res객체공유
		RequestDispatcher dis = 
		request.getRequestDispatcher("scopeTest3.jsp");
		dis.forward(request, response);
		//redirct 포워딩
		//response.sendRedirect("scopeTest3.jsp");
	%>
	<%-- <jsp:forward page="scopeTest3.jsp"> --%>
	<%-- <jsp:param value="010-1234-5678" name="tel"/> --%>
	<%-- </jsp:forward>jsp:forward> --%>
<!-- 	<a href="scopeTest3.jsp?id=aaa&name=kim">scopeTest3.jsp</a> -->
<!-- 	<a href="#" onclick="forward()">scopeTest3.jsp</a> -->
	<!-- 	<a href="scopeTest3.jsp">scopeTest3.jsp로 이동</a> -->
</body>
<script>
	function forward() {
		location.href="scopeTest3.jsp";
	}
</script>
</html>