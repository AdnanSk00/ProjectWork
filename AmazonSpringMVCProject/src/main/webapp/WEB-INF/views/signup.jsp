<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/signUpStyle.css" />
	<title>Sign Up | Amazon</title>
	
</head>
<body>

<main>
	<div class="signup-box">
		<h2>Sign Up</h2>

		<form action="/register-user" method="post">
			<input type="text" name="cid" placeholder="ID" required />
			<input type="text" name="userName" placeholder="Username" required />
			<input type="email" name="email" placeholder="Email" required />
			<input type="tel" name="mob" placeholder="Mobile Number" required pattern="[0-9]{10}" />
			<input type="password" name="pass" placeholder="Password" required />
			<input type="submit" value="Register" />
		</form>

		<div class="button-group">
			<a href="/">Home</a>
			<a href="/get-login">Login</a>
		</div>
	</div>
</main>

<%@ include file="footer.jsp" %>
</body>
</html>
