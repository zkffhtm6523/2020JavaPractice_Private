<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
ul li {
	list-style-type: none; float: left; margin-left: 20px;margin-top: 15px;
}
a {text-decoration: none; color: black;}

</style>
<title>JSP Practice</title>
</head>
<body>
	<div
		style="color: black; height: 50px;  background-color: gray;">
		<span style="height: 20; width: 50px"> </span>
		<ul>
			<li><a href="main.jsp">JSP Practice</a></li>
			<li><a href="profile.jsp">Profile</a></li>
			<li><a href="board.jsp">Board</a></li>
		</ul>
		<ul style="align-content: right;">
			<li><a href="login.jsp">LogIn</a></li>
			<li><a href="myPage.jsp">MyPage</a></li>
		</ul>
		
	</div>
	<div style="text-align: center;">개인 연습</div>
</body>
</html>