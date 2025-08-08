<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="adminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/allProductStyle.css" />
	<title>Products | MegaMart</title>
	
</head>
<body>
   <c:if test="${not empty delMsg || not empty updMsg}">
		<h3 class="msg" id="UpdMsg" style="color:green;">${updMsg}</h3>
		<h3 class="msg" id="DelMsg" style="color:green;">${delMsg}</h3>
		<script>
			setTimeout(function () {
				document.getElementById("UpdMsg").style.display = "none";
				document.getElementById("DelMsg").style.display = "none";
			}, 2000);
		</script>
	</c:if>
	<main class="main">
		<table class="table" border="1" cellpadding="6" cellspacing="1">
			<caption> <h1> Product Details </h1></caption>
			<thead>
				<tr class="header">
					<th>ID</th>
					<th>Product Name</th>
					<th>Price</th>
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
						<td>${product.quantity}</td>
						<td><a class="btn btn-update" href="/get-updateProduct/${product.productId}">Update</a></td>
						<td><a class="btn btn-delete" href="/deleteProduct/${product.productId}" onclick="return confirm('Are you sure you want to delete?');">Delete</a></td>
					</tr>
				</c:forEach>
			<tbody>
		</table>
		
	</main>
	
<%@ include file="footer.jsp" %>
	<script type="text/javascript">
		/* setTimeout(() => {
			let msg = document.getElementsByClassName("msg");
			if (msg) {
				msg.style.display = "none";
			}
		}, 2000); */
	</script>
</body>

</html>