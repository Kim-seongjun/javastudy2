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
div {
	border: 1px red solid;
	width: 200px;
	height: 100px;
	overflow: auto;
}
</style>
<script>
$(document).ready(function(){
	$.ajax({
	url:'http://sample.bmaster.kro.kr/contacts?pageno=2&pagesize=5',
	type:'get',
	dataTape:'json',
	success:function(result){
		console.log(result);
	},
	error:function(error){
		console.log(error);
	}
	});
});
</script>
</head>
<body>
	<button id="btn2" type="button">RESTful Service</button>

	<!-- (url,   함수명,        결과위치) -->
	<input type="button" onclick="Aj('test.ajax',testAjaxShow,'result1')"
		value="AjTest1">
	<input type="button" onclick="Aj('list.ajax',listAjaxShow,'result2')"
		value="AjTest2">

	<div id="result1">result1: Ajtest1 출력</div>
	<div id="result2">result2: Ajtest2 출력</div>
	<script>
		function Aj(url, fctName, position) {
			$.ajax({
				type : 'get',
				url : url,
				//data
				dataType : 'json',
				success : function(data) { //통신 성공시 호출할 callback함수
					console.log(data);
					fctName(data, position);
					
					
				},
				error : function(error) {
					console.log(error);
				}
			}); //ajax End
		} //Aj End

		function testAjaxShow(data, position) {
			alert("testAjaxShow call");
			
			var str = "";
			
			for(var key in data){
				str+=key + ":" + data[key] + "<br>";
			}
			$("#result1").html(str);
		};

		function listAjaxShow(data, position) {
			alert("listAjaxShow call");
			
			var str="";
		      for(var key in data){
		         
		         for(var key2 in data[key]){
		         str+=key2+"="+data[key][key2]+"<br/>";
		         }
		         str+="<hr/>";
		      }
		      $("#result2").html(str);
		};
	</script>
</body>
</html>