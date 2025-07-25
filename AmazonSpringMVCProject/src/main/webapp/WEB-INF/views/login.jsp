<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/loginStyle.css" />
	<title>Login | Amazon</title>

</head>
<body>

<main>
	<div class="login-box">
		<h2>Login</h2>
		
		<form action="/verify-login" method="post">
			<input type="text" name="userName" placeholder="Username" required />
			<input type="password" name="pass" placeholder="Password" required />
			<input type="submit" value="Login" />
		</form>
		<!-- ✅ Show this only if loginError equals 'not_found' -->
	    <c:if test="${loginError eq 'not_found'}">
	        <p style="color: #bf6f1d;">
	        	<span style="">User does not exist, </span><a href="/get-signup">create an account</a>.
	        </p>
	    </c:if>
		<div class="button-group">
			<a href="/">Home</a>
			<a href="/get-signup">Sign Up</a>
		</div>
	</div>
</main>

<%@ include file="footer.jsp" %>
</body>
</html>
