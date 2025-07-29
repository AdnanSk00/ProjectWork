<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/updateStyle.css" />
	<title>Amazon | Product</title>
	
</head>
<body>
	<main>
		<div class="form-box">
		    <h2>Update Product</h2>
		    <form action="/update-product" method="post">
		    
		        <label>Product ID:</label>
		        <input type="number" name="productId" value="${product.productId}" required readonly style="background : lightgrey;" />
	
		        <label>Product Name:</label>
		        <input type="text" name="productName" value="${product.productName}" required />
		
		        <label>Price:</label>
		        <input type="number" step="0.01" name="price" value="${product.price}" required />
		
		        <label>Description:</label>
		        <textarea name="description" rows="3" placeholder="Enter product description">${product.description}</textarea>
		
		        <label>Quantity:</label>
		        <input type="number" name="quantity" value="${product.quantity}" required />
		
		        <input type="submit" value="Update Product" />
		    </form>
		
		</div>
	</main>
	
<%@ include file="footer.jsp" %>
</body>
</html>