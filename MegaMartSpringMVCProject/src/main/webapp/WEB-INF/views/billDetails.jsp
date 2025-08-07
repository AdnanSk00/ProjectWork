<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Bill | MegaMart</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/billStyle.css">
</head>
<body>

<div class="bill-container">
    <h2>🧾 Order Summary</h2>
	
	<h3>Order ID: ${orderId}</h3>
    
    <c:forEach var="product" items="${billList}">
	    <div class="bill-card">
	        <img src="${product.imgPath}" alt="Product Image">
	        <div class="bill-details">
	            <h3>${product.productName}</h3>
	            <p><strong>Category:</strong> ${product.category}</p>
	            <p><strong>Quantity:</strong> 1</p>
	            <p><strong>Unit Price:</strong> ₹${product.price}</p>
	        </div>
	    </div>
	</c:forEach>
	
	
	<p class="total">
	    <strong>Total Amount:</strong> ₹${totalAmount}
	</p>

	
     <%-- <p class="total"><strong>Total Amount:</strong> ₹${product.price}</p> --%>

    <div class="thank-you">
        ✅ Thank you for your order! Your product will be delivered soon.
    </div>

    <a href="/view-orders" class="view-orders-link">📦 View All Orders</a>
</div>

<%@ include file="footer.jsp" %>
</body>
</html>
