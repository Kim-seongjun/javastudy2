<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	span{color:red}
</style>
</head>
<body>
	<c:if test="${id==null}">
		<form action="access" name="loginFrm" method="post">
			아이디:<input type="text" name="id"><br>
			비밀번호:<input type="password" name="pw"><br>
			<span>${msgAccess}</span>
			<button>로그인</button>
			<a href="joinfrm">회원가입</a>
		</form>
	</c:if>
	
	<c:if test="${id!=null}">
		<a href="logout">로그아웃</a>
		<a href="proupfrm">상품등록</a>
		<a href="cartfrm">장바구니</a>
	</c:if>
</body>
</html>