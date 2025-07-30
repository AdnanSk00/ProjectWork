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
		<h3 class="msg" style="color:green;">${updMsg}</h3>
		<table class="table" border="1" cellpadding="6" cellspacing="1">
			<caption> <h1> Product Details </h1></caption>
			<thead>
				<tr class="header">
					<th>ID</th>
					<th>Product Name</th>
					<th>Price</th>
					<th>Category</th>
					<th>Quantity</th>
					<th><i>Update</i></th>
					<th><i>Delete</i></th>
				</tr>
			</thead>
			</tbody>
				<c:forEach var="product" items="${productList}">
					<tr>
						<td>${product.productId}</td>
						<td>${product.productName}</td>
						<td>${product.price}</td>
						<td>${product.category}</td>
						<td>${product.quantity}</td>
						<td><a class="btn btn-update" href="/get-updateProduct/${product.productId}">Update</a></td>
						<td><a class="btn btn-delete" href="/deleteProduct/${product.productId}" onclick="return confirm('Are you sure')">Delete</a></td>
					</tr>
				</c:forEach>
			<tbody>
		</table>
		
	</main>
	
<%@ include file="footer.jsp" %>
	<script type="text/javascript">
		setTimeout(() => {
			let msg = document.getElementsByClassName("msg")[0];
			if (msg) {
				msg.style.display = "none";
			}
		}, 2000);
	</script>
</body>

</html>