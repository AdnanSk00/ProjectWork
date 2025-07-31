<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/insertProductStyle.css" />
	<title>Amazon | Product</title>
	
</head>
<body>
	<main>
		<div class="form-box">
		    <h2>Add New Product</h2>
		    <form action="/add-product" method="post">
		    
		        <label>Product ID:</label>
		        <input type="number" name="productId" required />
	
		        <label>Product Name:</label>
		        <input type="text" name="productName" required />
		
		        <label>(₹)Price:</label>
		        <input type="number" step="0.01" name="price" required />
		
		        <label>Category:</label>
		        <input type="text" name="category" required />
		
		        <label>Quantity:</label>
		        <input type="number" name="quantity" required />
		
		        <input type="submit" value="Add Product" />
		    </form>
		
		    <c:if test="${not empty msgKey}">
		        <p style="color: green;">${msgKey}</p>
		    </c:if>
		</div>
	</main>
	
<%@ include file="footer.jsp" %>
</body>
</html>