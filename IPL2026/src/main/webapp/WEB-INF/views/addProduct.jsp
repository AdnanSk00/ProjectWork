<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="adminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/insertProductStyle.css" />
	<title>New Product | IPL</title>
	
</head>
<body>
	<main>
	
	   <div class="wrapper">
	        <div class="form-wrapper sign-in">
	            <form action="/add-product" method="post">
	                <h2>Add New Product</h2>
	                <div class="input-group">
	                    <label for="">Product ID</label>
	                    <input  type="number" name="productId" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Product Name</label>
	                    <input type="text" name="productName" required>
	                </div>
	                <div class="input-group">
	                    <label for="">(₹)Price</label>
	                    <input type="number" step="0.01" name="price" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Quantity</label>
	                    <input type="number" name="quantity" required>
	                </div>
	                <button class="btn" type="submit">Add Product</button>
	            </form>
	        </div>
	    </div>
	
	</main>

<%@ include file="footer.jsp" %>
</body>
</html>