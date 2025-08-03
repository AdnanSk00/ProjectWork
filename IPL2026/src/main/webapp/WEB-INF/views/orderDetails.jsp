<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Orders | MegaMart</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/orderStyle.css">
</head>
<body>



<div class="bill-container">
    <h2>🧾 Orders</h2>
    
   	<c:forEach var="order" items="${orderList}">
	    <div class="bill-card">
	        <img src="${order.imgPath}" alt="Product Image">
	
	        <div class="bill-details">
	        	<h3>Order ID: ${randomId}</h3>
	            <h3>${order.productName}</h3>
	            <p><strong>Quantity:</strong> 1</p>
	            <p><strong>Unit Price:</strong> ₹${order.price}</p>
	            <hr>
	            <p class="total"><strong>Total Amount:</strong> ₹${order.price}</p>
	        </div>
	    </div>
    </c:forEach>

</div>

<%@ include file="footer.jsp" %>
</body>
</html>