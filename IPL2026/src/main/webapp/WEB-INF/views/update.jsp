<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="adminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/updateStyle.css" />
	<title>Update Product | IPL</title>
	
</head>
<body>
	<main>
		<div class="wrapper">
        <div class="form-wrapper sign-in">
            <form action="/update-product" method="post">
                <h2>Update Product</h2>
                <div class="input-group">
                    <input  type="number" name="productId" value="${product.productId}" required readonly>
                    <label for="">Product ID</label>
                </div>
                <div class="input-group">
                    <input type="text" name="productName" value="${product.productName}" required>
                    <label for="">Product Name</label>
                </div>
                <div class="input-group">
                    <input type="number" step="0.01" name="price" value="${product.price}" required>
                    <label for="">(₹)Price</label>
                </div>
                <div class="input-group">
                    <input type="number" name="quantity" value="${product.quantity}" required>
                    <label for="">Quantity</label>
                </div>
                <button class="btn" type="submit">Update Product</button>
            </form>
        </div>
    </div>
	</main>
	
<%@ include file="footer.jsp" %>
</body>
</html>