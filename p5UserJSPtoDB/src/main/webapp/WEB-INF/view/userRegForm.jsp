<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<h1>User Registration Form</h1>
	<form action="/insert-user" method="post">
	
	Enter Name : <input type="text" id="userName" name="userName"> <br><br>
	
	Enter password : <input type="password" id="password" name="password"> <br><br>
	
	<input type="submit"> <br><br>
	
	<button type="reset">Clear</button>
	
	</form>
</body>
</html>