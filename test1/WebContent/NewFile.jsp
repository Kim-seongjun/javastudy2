<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" action="hello" method="post">
		이름: <input type="text" name="name"><br>
		<input type="button" onclick="check()" value="click">
	</form>
	<a href="hello?name=kkk&pw=11111">서버로</a>
</body>
<script>
	function check() {
		location.href="hello?name=kkk&pw=11111";
	}
</script>
</html>