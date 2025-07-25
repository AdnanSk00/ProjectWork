<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/homeStyle.css" />
	<title>Amazon | Home</title>
	
</head>
<body class="home-body">
	
	<c:if test="${not empty msgKeyLogin}">
		<div class="msg" id="LoginMsg">${msgKeyLogin}</div>
		<div class="msg" id="UserInsertMsg">${msgKeyUserInsert}</div>
		<div class="msg" id="RegisterMsg">${msgKeyRegister}</div>
		<div class="msg" id="CustInsertMsg">${msgKeyCustInsert}</div>
	
		<script>
			setTimeout(function() {
				const msgDiv = document.getElementById("LoginMsg");
				if (msgDiv) {
					msgDiv.style.display = "none";
				}
			}, 2000);
			setTimeout(function() {
				const msgDiv = document.getElementById("UserInsertMsg");
				if (msgDiv) {
					msgDiv.style.display = "none";
				}
			}, 2000);
			setTimeout(function() {
				const msgDiv = document.getElementById("RegisterMsg");
				if (msgDiv) {
					msgDiv.style.display = "none";
				}
			}, 2000);
			setTimeout(function() {
				const msgDiv = document.getElementById("CustInsertMsg");
				if (msgDiv) {
					msgDiv.style.display = "none";
				}
			}, 2000);
		</script>
	</c:if>
	
	<div class="overlay">
		<h1>Welcome to Our Shopping Website!</h1>
		<p>Exclusive deals, fast checkout, and a world of products waiting just for you.</p>

		<div class="feature-cards">
			<div class="card">
				<h3>🛍️ Explore Products</h3>
				<p>Discover items across fashion, tech, and lifestyle.</p>
			</div>
			<div class="card">
				<h3>🛒 Your Cart</h3>
				<p>View and manage items you want to buy.</p>
			</div>
			<div class="card">
				<h3>💳 Secure Checkout</h3>
				<p>Multiple payment options with quick confirmation.</p>
			</div>
			<div class="card">
				<h3>📦 Order History</h3>
				<p>Keep track of purchases and download invoices.</p>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp" %>
</body>
</html>
