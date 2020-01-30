<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
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

#footer {
	text-align: center;
	background-color: #778268;
	height: 100px;
}

table {
	border: 1px solid #373D40;
	text-align: center;
	margin-left: 43%;
}

tr td {
	border: 1px solid #373D40;
}

#div_sales {
	background-color: #DDDDF0;
	height: 500px;
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

		<div id="div_sales">
			<div style="text-align: center;">
				<b style="font-size: 30px;">회원매출조회</b>
			</div>
			<table>
				<tr>
					<td>회원번호</td>
					<td>회원성명</td>
					<td>고객등급</td>
					<td>매출</td>
				</tr>
			</table>
		</div>
	</section>
	<footer>
		<div id="footer">
			<jsp:include page="footer.jsp" />
		</div>
	</footer>
	<script>
		var json=${sales};
		console.log(json);
		var str = "";
		
		for(var i=0;i<json.length;i++){
			str+="<tr>";
			str+="<td>"+json[i].custno+"</a></td>";
			str+="<td>"+json[i].custname+"</td>";
			if(json[i].grade=='A'){
				str+="<td>VIP</td>";
			}else if(json[i].grade=='B'){
				str+="<td>일반</td>";
			}else if(json[i].grade=='C'){
				str+="<td>직원</td>";
			}
			str+="<td>"+json[i].sales+"</td>";
			str+="</tr>";
		}
		$("table").append(str);
	</script>
</body>
</html>