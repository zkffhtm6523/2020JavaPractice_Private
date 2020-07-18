<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="">
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
		<div class="bodyContents" >
			<h1>개인 연습</h1>
			<form action="joinAction.jsp" method="post">
				<ul class="joinView" style="width: 600px; " >
					<li>
						<label for="name">이름 : </label>
						<input type="text" name="name" placeholder="성함을 입력하세요.">
					</li>
					<li>
						<label>아이디 : </label>
						<input type="text" placeholder="아이디를 입력하세요.">
					</li>
					<li>
						<label>비밀번호 : </label>
						<input type="password" placeholder="비밀전호를 입력하세요">
					</li>
					<li>
						<label>비밀번호 확인 : </label>
						<input type="password" placeholder="성함을 입력하세요.">
					</li>
					<li>
						<label>이메일 : </label>
						<input type="email" placeholder="이메일을 입력하세요.">
					</li>
				</ul>
				<div class="btn" style="margin-top: 200px; text-align: center;">
					<input type="submit" value="가입">
					<input type="reset" value="초기화">
				</div>
			</form>
		</div>
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script src="js/bootstrap.js"></script>
	</body>
	
</html>