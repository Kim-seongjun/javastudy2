<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button onclick="goAjax()">AJAX(비동기)통신</button>
	<a href = "home">home</a>
	<h1>회원정보</h1>
	<div id="memberInfo"></div>

<script>
	var obj1 = {id:"이순신", pw:"1111"};
	var obj2 = {id:"김유신", pw:"2222"};
	
	var arr=[];
	arr.push(obj1);
	arr.push(obj2);
	console.log("arr=",arr);
	
	var obj = {};
	obj.arr = arr;
	obj.val = 100;
	console.log("obj=",obj);
	console.log("obj.arr=",obj.arr);
	
	
	function goAjax() {
		var json = JSON.stringify(obj.arr); //서버에서 JSON문자열로 반환
		$.ajax({
			type:'get',
			url:'member/info', //restFul 방식
			data:{data: json},
			//contentType:'application/json; charset=UTF-8',
			
			dataType : "json",
			timeout:"3000", //요청 타임 아웃
			success:function(data){
				console.log(data);
			},
			error:function(error){
				console.log(error);
			}
		});
	}
	
</script>

</body>
</html>