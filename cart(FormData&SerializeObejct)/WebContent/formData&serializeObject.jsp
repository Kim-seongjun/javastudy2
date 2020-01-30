<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="jquery-3.3.1.min.js"></script>
<script src="jquery.serializeObject.js"></script>
</head>
<body>
	<h3>FormData</h3>
	<form id="joinFrm1" method="post" enctype="multipart/form-data">
		<input type="text" name="id" id="id" value="aaa" /><br />
		<input
			type="password" name="pw" id="pw" value="1111" /><br />
			<!-- multiple:2개이상 파일을 선택 -->
			<input type="file"	name="file" id="file" multiple/><br/> 
			
			<input type="button" onclick="formData()" value="FormData테스트" />
	</form>
	<script>
	function formData(){
		console.dir(document.getElementById('file'));
		console.log(document.getElementById('file').files);//files속성은 jQuery객체엔 없음
		console.log($("#file").files); //undefine
		console.log(document.getElementById('file').files.length);
		console.log(document.getElementById('file').files[0]);
		console.log(document.getElementById('file').files[1]);
		
		//multipart/form-data를 전송시 무조건 사용(파일업로드)
		//FormData객체는 form의 일부데이터만 서버에 전송하고 싶을 때 좋음.
		//ajax에서 사용함.
		var formData=new FormData();
		formData.append("id",$("#id").val());
		formData.append("pw",$("#pw").val());
		var files=document.getElementById("file").files;
		for(var i=0;i<files.length;i++){   //파일만 추가할 것이므로 for(in)문 사용하지 말것.
			formData.append("files"+i,files[i]);
		}
		
		$.ajax({
			url: "formData?cnt="+files.length, 		
			type: "post",  //multipart/form-data를 전송시 post
			data: formData,
			processData:false,// application/x-www-form-urlencoded(쿼리스트링 형식) 처리 금지
			contentType:false, // multipart의 경우 contentType을 false로
			//contentType:'application/json; charset=UTF-8', 
			dataType:"html", //생략가능
			success:function(data){
				console.log(data);
			},
			error:function(error){
				console.log(error);
			}
		}); //ajax End
	}
	</script>	
	
	<!-- <h3>SerializeObject</h3>
	<form id="joinFrm2" method="post">
		<input type="text" name="id" id="id" value="aaa" /><br />
		<input type="password" name="pw" id="pw" value="1111" /><br />
			
		<input type="button" onclick="serializeObject()" value="SerializeObject테스트" />
	</form>
</body>
<script>
function serializeObject(){
	//폼 양식안의 모든 데이터를 js 객체로 자동 생성한다.
	//var obj=$('#joinFrm2').serializeObject();  //jquery-plugin 추가할것.
	var obj=[{id:'xxx',pw:'1111'},{id:'yyy',pw:'2222'}];  //js Object
	console.log(obj);
	var jsonData=JSON.stringify(obj);  //js객체를 json(문자열)로 변환
	console.log(jsonData);
	
	$.ajax({
		url: "serializeObject", 		
		type: "post",  //get가능 
		data: {data:jsonData},
		//스프링에서 data:jsonStr 이렇게 보내면 스프링이 json을 까보기 때문에 아래처럼 설정해야됨..
		//contentType:'application/json; charset=UTF-8',  
		dataType:"html", //생략가능
		success:function(data){
			console.log(data);	
		},
		error:function(error){
			console.log(error);
		}
	}); //ajax End
}
</script> -->
</html>

