<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg}
<h1>회원가입 폼</h1>
<form name="joinForm" action="memberjoin" method="post" onsubmit="return formCheck()">
	아이디:<input type="text" name="id" id="id"><br>
	비번:<input type="password" name="pw" id="pw"><br>
	이름:<input type="text" name="name" id="name"><br>
	성별:<input type="radio" name="gender" id="gender" value="남자">남자
	<input type="radio" name="gender" id="gender" value="여자" checked>여자<br>
	<input type="submit" value="회원가입">
	<input type="reset" value="리셋">
</form>
<form>
	

</form>
</body>
<script>
	function formCheck(){
		var length=document.joinForm.length-4;
		console.log(length);
		//var form=document.joinForm;
		var form=document.joinForm;
		var form=document.forms[0]
		for(var i=0;i<length;i++){
			if(form[i].value==""){
				alert(form[i].id+"을 입력하세요");
				form[i].focus();
				return false;
			}
		}
		return true;	//일반 버튼인 경우 form.submit
	}
</script>
</html>