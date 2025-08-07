<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="adminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/addPlayerStyle.css" />
	<title>New Player | IPL</title>
	
</head>
<body>
	<main>
	   <div class="wrapper">
	        <div class="form-wrapper sign-in">
	            <form action="/add-player" method="post">
	                <h2>Add New Player</h2>
	                <div class="input-group">
	                    <label for="">Player ID</label>
	                    <input  type="number" name="pid" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Player Name</label>
	                    <input type="text" name="pname" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Role</label>
	                    <input type="text" name="role" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Runs</label>
	                    <input type="number" name="runs" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Wickets</label>
	                    <input type="number" name="wickets" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Team Name</label>
	                    <input type="text" name="pteamName" required>
	                </div>
	                <button class="btn" type="submit">Add Player</button>
	            </form>
	        </div>
	    </div>
	
	</main>
	

<%@ include file="footer.jsp" %>
</body>
</html>