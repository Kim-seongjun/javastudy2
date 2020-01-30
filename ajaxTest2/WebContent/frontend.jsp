<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>front_end test</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style>
	header{
		background-color: blue;
		
	}

</style>
</head>
<body>
<header ><input type="text" id="select">

</header>
<nav>

</nav>
<footer>

</footer>
</body>
<script>
$(function() {
	   $.ajax({
	      type:"get",
	      url:'http://sample.bmaster.kro.kr/contacts?pageno=2&pagesize=5',
	      data:{pageno:2,pagesize:5},
	      dataType:'json',
	      success:function(result){
	         console.log(result);
	         $.each(result.contacts,function(idx,member){
	            console.log("idx="+idx);
	            console.log("member="+member);
	            
	            var $tr=$("<tr>").appendTo("table");
	            $("<td>").text(member.name).appendTo($tr);
	            $("<td>").text(member.address).appendTo($tr);
	            $("<td>").text(member.tel).appendTo($tr);
	            $("<img>").attr("alt",member.name+"의 사진").attr("src",member.photo).appendTo($("<td>").appendTo($tr));
	         })//each End
	      },
	      error:function(error){
	         console.log(error);
	      }
	   });
</script>
</html>