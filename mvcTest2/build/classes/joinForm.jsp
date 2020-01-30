<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 폼</h1>
${msg}
<form name="joinForm" action="memberjoin" method="post" onsubmit="return formCheck()">
	아이디:<input type="text" name="id" id="id"><br>
	비밀번호:<input type="password" name="pw" id="pw"><br>
	이름:<input type="text" name="name" id="name"><br>
	성별:<input type="radio" name="gender" id="gender1" value="남자">남자
		<input type="radio" name="gender" id="gender2" value="여자" checked>여자
	<br>
	<input type="submit" value="회원가입">
	<input type="reset" value="취소">
	

</form>
</body>
<script>
function formCheck() {
	var length=document.joinForm.length-4;
	console.log(length);
	//var form = document.joinForm;
	var form = document.forms[0];
	for(var i=0;i<length;i++){
		if(form[i].value==""){
			alert(form[i].name+"울 입력하세여");
			form[i].focus();
			return false;
		}
	}
	return true; //일반버튼인 경우 form.submit();
}

</script>
</html>