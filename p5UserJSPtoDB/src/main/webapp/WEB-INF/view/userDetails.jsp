<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.tka.p5UserJSPtoDB.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Data</title>
</head>
<body>
	<%
		String msgData = (String) request.getAttribute("pgm");
		out.println("msgData > " + msgData.toUpperCase());
		out.println("<br><br>");
		
		User user = (User) request.getAttribute("userObj");
		out.println("user > " + user);
		out.println("<br><br>");
		
		//out.println("userName > " + user.userName);
	%>
	
	<form>
		<h3>User Details :</h3>	
		
		Name : <input type="text" value="${userObj.userName}"> <br><br>
		
		Password : <input type="text" value="${userObj.password}"> <br><br>
	
	</form>
	
</body>
</html>