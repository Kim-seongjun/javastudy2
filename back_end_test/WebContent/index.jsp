<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#header {
	background-color: #58557A;
	text-align: center;
	height: 100px;
}

#nav {
	background-color: #9D9BCC;
	height: 50px;
}

#section {
	background-color: #DDDDF0;
	height: 500px;
}

#footer {
	text-align: center;
	background-color: #778268;
	height: 100px;
}
</style>
</head>
<body>
	<header>
		<div id="header">
			<jsp:include page="header.jsp" />
		</div>
	</header>
	<nav>
		<div id="nav">
			<jsp:include page="nav.jsp" />
		</div>
	</nav>
	<section>
		<div id="section">
			<jsp:include page="menu.jsp" />
		</div>
	</section>
	<footer>
		<div id="footer">
			<jsp:include page="footer.jsp" />
		</div>
	</footer>
</body>
</html>