<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/allCustomerStyle.css" />
	<title>Amazon | Customer</title>
</head>
<body>
	<main class="main">
		<table class="table" border="1" cellpadding="8" cellspacing="0">
			<caption> <h1> Customer Details </h1></caption>
			<thead>
				<tr class="header">
					<th>ID</th>
					<th>UserName</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Password</th>
				</tr>
			</thead>
			</tbody>
				<c:forEach var="customer" items="${customerList}">
					<tr>
						<td>${customer.cid}</td>
						<td>${customer.userName}</td>
						<td>${customer.email}</td>
						<td>${customer.mob}</td>
						<td>${customer.pass}</td>
					</tr>
				</c:forEach>
			<tbody>
		</table>
	</main>
	
<%@ include file="footer.jsp" %>
</body>
</html>