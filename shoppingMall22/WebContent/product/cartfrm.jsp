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
   h1{
   		width:98%;
		text-align:center; color: white;
		border: 1px solid green;
		background-color: black;
		}
		#header{
		border: 3px solid black;
		width:98%; height:20%;
		}
	 #cart{
	 	border: 3px solid black;
        width: 98%; height: 500px;
        text-align: left;
        overflow: auto;
        }
        
     #aaa{
        text-align: center; 
        position: fixed;
 		bottom: 330px; 
        margin-left: 750px;
        }
        
        
</style>
</head>
<body>
<h1>장바구니</h1>
<header>
		<div id="header">
		<jsp:include page="/header.jsp" />
		</div><br>
</header>
<div id="cart">
	<div id="cartlist">
		<div>
			<input type="checkbox"><a href="#">aa</a>
		</div><br>
		<div>
			<input type="checkbox"><a href="#">bb</a><div border="1px solid black">ddd</div>
		</div><br>
		<div>
			<input type="checkbox"><a href="#">cc</a>
		</div><br>
		<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
		<div>
			<input type="checkbox"><a href="#">ee</a> aaa
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
				<div>
			<input type="checkbox"><a href="#">dd</a>
		</div><br>
		
	</div>
	
	<div id="aaa">
	<input type="button" value="선택구매">
	<input type="button" value="선택리셋">
	</div>
	
</div>
	
<script>

</script>
</body>
</html>