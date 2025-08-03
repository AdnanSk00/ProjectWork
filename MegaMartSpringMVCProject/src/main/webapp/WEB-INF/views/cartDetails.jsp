<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/cartsStyle.css" />
	<title>Carts | MegaMart</title>

</head>
<body>
	<div id="product-section" class="product-section">
		<h2>Saved Products</h2>
		<form method="post" action="/buy-product">
	    	<div class="products">
				<c:forEach var="product" items="${cartList}">
					<div class="product-card">
						<img src="${product.imgPath}" alt="${product.productName}" />
						<div class="product-info">
							<h4>${product.productName}</h4>
							<p>${product.category}</p>
							<p>Quantity: ${product.quantity}</p>
							<p>₹${product.price}</p>
						</div>
						<div class="product-buttons">
							<a class="btn-remove" href="/remove-cart/${product.productId}">Remove</a>
							<label class="checkbox-label">
								<input type="checkbox" name="selectedIds" value="${product.productId}">
								Select
							</label>
						</div>
					</div>
				</c:forEach>
			</div>
    		<button type="submit" class="btn-buy">Buy Now</button>
		</form>
	</div>

<%@ include file="footer.jsp" %>
<script type="text/javascript">
	function(){
		
	}
</script>
</body>
</html>