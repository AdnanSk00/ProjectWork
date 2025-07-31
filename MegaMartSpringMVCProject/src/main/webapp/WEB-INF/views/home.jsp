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
	
	<c:if test="${not empty msgKeyLogin || not empty msgKeyRegister || not empty msgKey}">
		<div class="msg" id="LoginMsg">${msgKeyLogin}</div>
		<div class="msg" id="UserInsertMsg">${msgKeyUserInsert}</div>
		<div class="msg" id="RegisterMsg">${msgKeyRegister}</div>
		<div class="msg" id="CustInsertMsg">${msgKeyCustInsert}</div>
		<div class="msg" id="addProduct">${msgKey}</div>
	
		<script>
			setTimeout(function() {
					document.getElementById("LoginMsg").style.display = "none";
					document.getElementById("UserInsertMsg").style.display = "none";
					document.getElementById("RegisterMsg").style.display = "none";
					document.getElementById("CustInsertMsg").style.display = "none";
					document.getElementById("addProduct").style.display = "none";
			}, 2000);
		</script>
	</c:if>
	
	<div class="overlay">
		<h1>Welcome to Our Shopping Website!</h1>
		<p>Exclusive deals, fast checkout, and a world of products waiting just for you.</p>

		<div class="feature-cards">
			<div class="card" onclick="showProducts()">
				<h3>🛍️ Explore Products</h3>
				<p>Discover items across fashion, tech, and lifestyle.</p>
			</div>
			<div class="card" onclick="showCarts()">
				<h3>🛒 Your Cart</h3>
				<p>View and manage items you want to buy.</p>
			</div>
			<div class="card" onclick="showPayment()">
				<h3>💳 Secure Checkout</h3>
				<p>Multiple payment options with quick confirmation.</p>
			</div>
			<div class="card" onclick="showOrders()">
				<h3>📦 Order History</h3>
				<p>Keep track of purchases and download invoices.</p>
			</div>
		</div>
	</div>
	<!-- Product Section (initially hidden) -->
	<div id="product-section" style="display: none;" class="product-section">
		<h2>Featured Products</h2>
		<div class="products">
		
			<c:forEach var="product" items="${productList}">
				<div class="product-card">
					<img src="${product.imgPath}" alt="${product.productName}" />
					<div class="product-info">
						<h4>${product.productName}</h4>
						<p>${product.category}</p>
						<p>Quantity: ${product.quantity}</p>
						<p>₹${product.price}</p>
						<a class="btn-cart" href="/add-to-cart/${product.productId}">Add to Cart</a>
						
					</div>
				</div>
			</c:forEach>
	
		</div>
	</div>
	

	<%@ include file="footer.jsp" %>
	<script>
		function showProducts() {
			const productSection = document.getElementById("product-section");
			if (productSection) {
				productSection.style.display = "block";
				productSection.scrollIntoView({ behavior: "smooth" });
			}
		}
		function showCarts(){
			alert("building...");
			window.location.href = "/view-carts";
		}
		function showPayment(){
			alert("building...");
		}
		function showOrders(){
			alert("building...");
			window.location.href = "/view-orders";
		}
	</script>

	
</body>
</html>
