<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 성적 결과 </h1>
<h2>${name}님 (${age})세 성적표</h2>
<h1>${msg}</h1>
-----------------------------------
<h2>자바 : ${java}점</h2>
<h2>오라클 : ${oracle}점</h2>
<h2>웹 : ${web}점</h2>
------------------------------------
<h2>총점 : ${total}점</h2>
<h2>평균 : ${avg}점</h2>
<h2>학점 : ${grade}점</h2>
</body>
</html>