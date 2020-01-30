<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<style>
		h1,h3{
			width:98%;
			text-align:center; color: white;
			border: 1px solid green;
			background-color: black;
		}
		html,body{
			height:95%;
			margin: 10px;
			
		}
		div{
			border: 1px solid black; margin:5px;
		}
		#header{
			width:98%; height:20%;
		}
		#middle{
			width:98%; height:60%;
			overflow:hidden;	/* 공식1 */
			border: 1px solid black;
			/*position:relative;*/ /* 공식2 */
			display:flex;
		}
		#menu{
			width:18%; height:95%;
			text-align:center;
			float:left;
		}
		#main{
			width:79%; height:95%;
			text-align:center;
			float:left;
			overflow:auto;
		}
		#footer{
			width:98%; height:20%;
			text-align:center;
			overflow:auto;
		}
	</style>
</head>
<body>
	<h1>My Shop</h1>
	<header>
		<div id="header">
			<jsp:include page="header.jsp" />
		</div>
	</header>
	
		<div id="middle">
			<div id="menu"></div>
			<div id="main"></div>
		</div>
	
	<footer>
		<div id="footer">
			Since 2018
			<jsp:include page="footer.jsp" />
		</div>
	</footer>
	<script>
 		/* if(${id==null}){	//로그인 된 경우 */
			Aj("menu","#menu");
 		//if(${id!=null}){
 		
			if(${page==null}){
				Aj("newItem","#main");	//newItem.jsp
			}else{
				Aj("${page}","#main")	//bestItem.jsp
			}
 		//}
 		/* } */
		function Aj(url, position){
			$.ajax({
				url: url,
				type: "get",
				//data 생략
				dataType:"html",
				success:function(page){
					$(position).html(page);	
				},
				error:function(error){
					console.log(error);
				}
			});//ajax End
		}
	</script>
</body>
</html>