<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="adminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/updateProductStyle.css" />
	<title>Update Product | IPL</title>
	
</head>
<body>
	<main>
		<div class="wrapper">
        <div class="form-wrapper sign-in">
            <form action="/update-product" method="post">
                <h2>Update Product</h2>
                <div class="input-group">
                    <label for="">Product ID</label>
                    <input  type="number" name="productId" value="${product.productId}" required readonly>
                </div>
                <div class="input-group">
                    <label for="">Product Name</label>
                    <input type="text" name="productName" value="${product.productName}" required>
                </div>
                <div class="input-group">
                    <label for="">(₹)Price</label>
                    <input type="number" step="0.01" name="price" value="${product.price}" required>
                </div>
                <div class="input-group">
                    <label for="">Quantity</label>
                    <input type="number" name="quantity" value="${product.quantity}" required>
                </div>
                <button class="btn" type="submit">Update Product</button>
            </form>
        </div>
    </div>
	</main>
	
<%@ include file="footer.jsp" %>
</body>
</html>