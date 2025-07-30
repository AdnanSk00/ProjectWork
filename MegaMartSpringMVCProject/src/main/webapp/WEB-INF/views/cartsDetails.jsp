<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/cartsStyle.css" />
	<title>Carts | Amazon</title>

</head>
<body>
	<div id="product-section" class="product-section">
		<h2>Saved Products</h2>
		<div class="products">
		
		<c:forEach var="cart" items="${cartList}">
			<div class="product-card">
			<img src="${cart.imgPath}" alt="${cart.productName}" />
				<div class="product-info">
					<h4>${cart.productName}</h4>
					<p>${cart.category}</p>
					<p>Quantity: ${cart.quantity}</p>
					<p>₹${cart.price}</p>
				</div>
				<div class="product-buttons">
					<a class="btn-remove" href="/remove-cart/${cart.productId}">Remove</a>
					<button class="btn-buy">Buy Now</button>
				</div>
			</div>

		</c:forEach>
		</div>
	</div>

<%@ include file="footer.jsp" %>

</body>
</html>