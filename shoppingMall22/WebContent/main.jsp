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
   #list{width: 30%; height: 100px; float: left; border: solid black 5px;}
   #detail.open{display: black; color: black;}
   #detail{
      display:none;
   }
</style>
</head>
<body>
<h3>main.jsp</h3>
<div id="detail">
</div>

${pList}

<script>
   function detail(pCode) {
      
      $('#detail').toggle('open');
      
      $.ajax({
         url:'ajaxDetail',
         type:'get',
         data:{pCode:pCode},
         dataType:'json',
         
         success:function(data){
            console.log(data);
            var pcode=data.p_code;
            $('#detail').html('상품코드:'+data.p_code+'<br>'
                  +'상품명:'+data.p_name+'<br>'
                  +'상품설명:'+data.p_contents+'<br>'
                  +'가격:'+data.p_price+'원<br>'
                  +'재고량:'+data.p_qty+'개<br>'
                  +'등록자:'+data.p_id+'<br>'
                  +'등록일:'+data.p_date+'<br>'
                  +"<input id='test' name='"+data.p_code+"' type='button' value='장바구니담기' onclick=\"cart('"+pcode+"')\">"
                  +"<input id='test2' name='"+data.p_code+"' type='button' value='바로구매' onclick=\"cart('"+pcode+"')\">"
                  );
            
         },
         error:function(error){
            console.log(error);
         }
         
      })

   }
   function cart(pcode){
      alert(pcode+"되는건가?");
   }
   
</script>
</body>
</html>