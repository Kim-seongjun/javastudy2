<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>영역값 출력</h1>
   <h3>application 영역값</h3>
   id:<%=application.getAttribute("id") %><br>
   name:<%=application.getAttribute("name") %><br>
   hidden:<%=application.getAttribute("hidden") %><br>
   <h3>세션 무효화</h3>
   
   초기화 이전 session id:<%=session.getId() %>
   <% session.invalidate(); %>
   <!-- 세션이 무효화되면 EL을 사용할 수 없다. -->
   <!-- 새로운 세션 객체 생성 -->
   <% HttpSession session2= request.getSession(); %>
   초기화 이후 새로운 session id:<%=session2.getId() %>
   <% session2.setAttribute("sid", "new session"); %>
   <% session2.setAttribute("sname", "new session"); %>
   <h3>session 영역값</h3>
   
   id:${sid }<br>
   name:${sname }
   <h3>request 영역값</h3>
   id:<%=request.getAttribute("id") %><br>
   name:<%=request.getAttribute("name") %><br>
   hidden:<%=request.getAttribute("hidden") %><br>
   <h3>파라미터 값</h3>
   id:<%=request.getParameter("id") %><br>
   name:<%=request.getParameter("name") %><br>
   <h3>pageContext 영역값</h3>
   id:<%=pageContext.getAttribute("id") %><br>
   name:<%=pageContext.getAttribute("name") %><br>
   hidden:<%=pageContext.getAttribute("hidden") %><br>
   
   <!-- EL 표기법 익스프레스 랭귀지 -->
   
   <h3>파라미터 확인</h3>
   id:${param.id}<br>
   name:${param.name}<br>
   hidden:${param.hidden}<br>
   
   <h3>include 중요</h3>
<%--    <%@ include file= "header.jsp" %> --%>
<jsp:include page="${hidden}">
	<jsp:param value="010-1234-5678" name="tel"/>
</jsp:include>


</body>
</html>