<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/allProductStyle.css" />
	<title>Amazon | Product</title>
	
</head>
<body>
	<main class="main">
		<table class="table" border="1" cellpadding="8" cellspacing="0">
			<caption> <h1> Product Details </h1></caption>
			<thead>
				<tr class="header">
					<th>ID</th>
					<th>Product Name</th>
					<th>Price</th>
					<th>Description</th>
					<th>Quantity</th>
				</tr>
			</thead>
			</tbody>
				<c:forEach var="product" items="${productList}">
					<tr>
						<td>${product.productId}</td>
						<td>${product.productName}</td>
						<td>${product.price}</td>
						<td>${product.description}</td>
						<td>${product.quantity}</td>
					</tr>
				</c:forEach>
			<tbody>
		</table>
	</main>
	
<%@ include file="footer.jsp" %>
</body>
</html>