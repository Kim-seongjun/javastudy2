<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
name:${name }<br>
subject:${subject }<br>
orifileName:${orifileName }<br>
sysfileName:${sysfileName }<br>
<hr>
<a href = "upload/${sysfileName }">${orifileName }</a>

<img src = "upload/${sysfileName }" width="200">
</body>
</html>