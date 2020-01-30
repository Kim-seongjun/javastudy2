<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>scopeTest1</h1>
<h3>4대 영역에 저장할 내용</h3>
<form action="scopeTest2.jsp" method="post">
	<input type="hidden" name="includepage" value="includeTest1.jsp">
	id:<input type="text" name="id"><br>
	name:<input type="text" name="name"><br>
	<button>서버로 전송</button> 
</form>
</body>
</html>