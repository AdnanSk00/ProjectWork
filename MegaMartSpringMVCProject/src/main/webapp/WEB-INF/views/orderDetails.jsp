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
    
    <div class="bill-section">	
	    <c:forEach var="bill" items="${bills}">	
	    	<h3>Order ID: ${bill.billId}</h3>
	    	<p>Total: ₹${bill.totalAmount}</p>
		   	<c:forEach var="product" items="${bill.products}">
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
		    <hr>
		</c:forEach>
	</div>
	
</div>

<%@ include file="footer.jsp" %>
</body>
</html>