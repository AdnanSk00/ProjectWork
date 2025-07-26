<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.tka.p5UserJSPtoDB.*, java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>All User Data</title>
	<style type="text/css">
		form {
			display: flex;
			justify-content: space-around;
			align-items: center;
		}
/*		.reg-form {
			text-align: center;
			margin-bottom: 20px;
		}*/
		p.message {
			font-weight: bold;
			margin: 10px 0;
		} 
	</style>
</head>
<body>

	<!-- Form -->
	<form method="post">
		<div class="reg-form">
			<h2>User Registration Form :</h2>
			
			Enter name : <input type="text" name="userName"> <br><br>
			Enter password : <input type="password" name="password"> <br><br>

			<!-- Buttons with different endpoint using formaction -->
			<button type="submit" formaction="/insert-user" style="background: green; color: white;">Insert</button>
			<button type="submit" formaction="/update-user" style="background: blue; color: white;">Update</button>
			<button type="submit" formaction="/delete-user" style="background: red; color: white;">Delete</button>
			<button type="reset" style="background: gray; color: white;">Clear</button>
			
			
			<!-- ✅ Success or Acknowledgement Messages -->
			<c:if test="${not empty updateMsg}">
				<p class="message" style="color: blue;">${updateMsg}</p>
			</c:if>
			<c:if test="${not empty insertMsg}">
				<p class="message" style="color: green;">${insertMsg}</p>
			</c:if>
			<c:if test="${not empty deleteMsg}">
				<p class="message" style="color: red;">${deleteMsg}</p>
			</c:if>
			
		</div>

		<!-- All Users Table -->
		<table border="1" cellpadding="8" cellspacing="0">
			<caption><h3>All User Details :</h3></caption>	
			<tr>
				<th>User Name</th>
				<th>Password</th>
			</tr>
			<c:forEach var="user" items="${userList}">
				<tr>
					<td>${user.userName}</td>
					<td>${user.password}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
	
	
	
	<script>
		setTimeout(() => {
			document.querySelectorAll("p.message").forEach(p => p.style.display = "none");
		}, 3000);
	</script>
</body>
</html>
