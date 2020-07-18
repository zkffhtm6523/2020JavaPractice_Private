<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="">
<meta charset="UTF-8">
<title>JSP Practice</title>
</head>
<body>
	<%--userID를 null로 초기화 후 -> 로그인 성공 시 session에 속성 부여 --%>
	<% String userID = null;
		if(session.getAttribute("userID") != null){
			userID = (String)session.getAttribute("userID");
		}
	%>
	<div
		style="color: black; height: 50px;  background-color: gray;">
		<span style="height: 20; width: 50px"> </span>
		<ul>
			<li><a href="main.jsp">JSP Practice</a></li>
			<li><a href="profile.jsp">Profile</a></li>
			<li><a href="board.jsp">Board</a></li>
		</ul>
		<span class = "loginBlock">
			<a href="login.jsp" class="loginBlock1">LogIn</a>
			<a href="myPage.jsp">MyPage</a>
		</span>
	</div>
	<div class="bodyContents">
		<h1>개인 연습</h1>
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>