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
		<%-- <div class="form-box">
		    <h2></h2>
		    <form action="/add-product" method="post">
		    
		        <label>Product ID:</label>
		        <input type="number" name="productId" required />
	
		        <label>Product Name:</label>
		        <input type="text" name="productName" required />
		
		        <label>(₹)Price:</label>
		        <input type="number" step="0.01" name="price" required />
		
		        <label>Category:</label>
		        <input type="text" name="category" required />
		
		        <label>Quantity:</label>
		        <input type="number" name="quantity" required />
		
		        <input type="submit" value="Add Product" />
		    </form>
		
		    <c:if test="${not empty msgKey}">
		        <p style="color: green;">${msgKey}</p>
		    </c:if>
		</div> --%>
	
   <div class="wrapper">
        <div class="form-wrapper sign-in">
            <form action="/add-product" method="post">
                <h2>Add New Product</h2>
                <div class="input-group">
                    <input  type="number" name="productId" required>
                    <label for="">Product ID</label>
                </div>
                <div class="input-group">
                    <input type="text" name="productName" required>
                    <label for="">Product Name</label>
                </div>
                <div class="input-group">
                    <input type="number" step="0.01" name="price" required>
                    <label for="">(₹)Price</label>
                </div>
                <div class="input-group">
                    <input type="number" name="quantity" required>
                    <label for="">Quantity</label>
                </div>
                <div class="remember">
                    <label><input type="checkbox"> Remember me</label>
                </div>
                <button class="btn" type="submit">Add Product</button>
            </form>
        </div>
    </div>
	
	
	</main>
	
	
	


<%@ include file="footer.jsp" %>
</body>
</html>