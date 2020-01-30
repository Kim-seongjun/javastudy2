<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<!-- ${mList} -->

<h1>jstl사용</h1>
<table border="1">
	<c:forEach var="id" items="${mList}">
		<tr>
			<td><a href="memberinfo?id=${id}">${id}</a></td>
			<td><a href="memberdelete?id=${id}">삭제</a></td>
		</tr>
	</c:forEach>
</table>
<hr>
<div id="infozone">마우스존</div>
<c:if test="${empty id}">
	<h3>id가 비어있음 ==비로그인</h3>

</c:if>
<c:if test="${!empty id}">
	<h3>id가 들어있음 ==로그인</h3>

</c:if>
<c:if test="${id!=null}">
	<h3>로그인중</h3>
</c:if>
<c:if test="${id==null}">
	<h3>비로그인중</h3>
</c:if>
<c:if test="${sessionScope.id=='admin'}">
	<h3>관리자 로그인중</h3>
</c:if>
<c:if test="${sessionScope.id!='admin'}">
	<h3>일반인 로그인중</h3>
</c:if>
<hr>
<c:choose>
	<c:when test="${id=='admin'}">
		<h3>관리자 로그인중</h3>
	</c:when>
	<c:when test="${id!='admin'}">
		<h3>일반인 로그인중</h3>
	</c:when>
</c:choose>
<c:set var ="data" value="관리자,일반인" />
<c:out value="${data}"></c:out>
${info}
<h3>history</h3>
<table border="1">
	<c:forEach var="idasdasd" items="${ht}">
		<tr>
			<td><a href="memberinfo?id=${id}">${id}</a></td>
			<td><a href="memberdelete?id=${id}">삭제</a></td>
		</tr>
	</c:forEach>
</table>
${logOutHtml}
${ht}

</body>
<script>
	/* console.log("${id}");
	console.log(${id!=null});	//boolean
	console.log("${id!=null}");
	if(${id!=null}){
		alert("로그인중");
	}else{
		alert("비로그인중");
	} */
	/*var json=${mList};
	console.log(json);
	var tmp;
	tmp+="<table border='1'>"
    for(var key in json){
    	tmp+="<tr align='center'>"
    	tmp+="<td><a href='memberinfo?id="+mList.get(i)+"'>"+mList.get(i)+"</a></td>";
    	tmp+="<td><a href='memberdelete?id="+mList.get(i)+"'>삭제</a></td>";
    	tmp+="</tr>";
    }
    tmp+="</table>"; */

    
</script>
</html>