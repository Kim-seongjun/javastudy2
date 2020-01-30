<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div{overflow:auto;}
</style>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<body>
<h1>INDEX.JSP</h1>
<input type="button" id="btn" value="Ajax">
<div id="jaxaDiv" style="border:1px red solid; width:200px; height:100px">
</div>
<hr>
assdvxcbdsfgfbxcvbxghfgh<br>
assdvxcbdsfgfbxcvbxghfgh<br>
<script>
var param={id:"icia", pw:"1111"};
$('#btn').click(function() {
	alert("ajax");
	$.ajax({
		//서버에 요청시 옵션
		type:'get', //post
		url:'ajaxTest', //mapping URL
		data:param,
		//서버에서 리턴시 옵션
		dataType:'json', //html(text), 'json', 'jsonp', 'xml'
		success: function(data){ //callback(콜백)함수
			//console.log(data);
			//$("#jaxaDiv").append(data);
			var str = "";
			
// 			for(var key in data){
// 				$("#ajaxDiv").append(key+":"+data[key]+"<br>");
// 			}
			
			for(var key in data){
				str+=key + ":" + data[key] + "<br>";
			}
			$("#jaxaDiv").html(str);
		},
		error:function(error){
			console.log(error);
		}
	}); //ajax End
})
</script>
</body>

</html>