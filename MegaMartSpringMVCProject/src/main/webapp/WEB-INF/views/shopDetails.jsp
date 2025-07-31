<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/shopStyle.css" />
	<title>Shop | Amazon</title>

</head>
<body>
	<div id="product-section" class="product-section">
		<h2>Featured Products</h2>
		<div class="products">
		
			<c:forEach var="product" items="${productList}">
				<div class="product-card">
					<img src="${product.imgPath}" alt="${product.productName}" />
					<div class="product-info">
						<h4>${product.productName}</h4>
						<p>Category: ${product.category}</p>
						<p>Quantity: ${product.quantity}</p>
						<p>₹${product.price}</p>
					</div>
					<div class="product-buttons">
						<a class="btn-cart" href="/add-to-cart/${product.productId}">Add to Cart</a>
						<a class="btn-buy" href="/buy-product/${product.productId}">Buy Now</a>				
					</div>
				</div>
	
			</c:forEach>
		</div>
	</div>

<%@ include file="footer.jsp" %>
	<script type="text/javascript">
	</script>
	
</body>
</html>