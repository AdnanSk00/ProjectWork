<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="adminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/updatePlayerStyle.css" />
	<title>Update Player | IPL</title>
	
</head>
<body>
	<main>
	   <div class="wrapper">
	        <div class="form-wrapper sign-in">
	            <form action="/update-player" method="post">
	                <h2>Update Player</h2>
	                <div class="input-group">
	                    <label for="">Player ID</label>
	                    <input  type="number" name="pid" value="${player.pid}" required readonly>
	                </div>
	                <div class="input-group">
	                    <label for="">Player Name</label>
	                    <input type="text" name="pname" value="${player.pname}" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Role</label>
	                    <input type="text" name="role" value="${player.role}" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Runs</label>
	                    <input type="number" name="runs" value="${player.runs}" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Wickets</label>
	                    <input type="number" name="wickets" value="${player.wickets}" required>
	                </div>
	                <div class="input-group">
	                    <label for="">Team Name</label>
	                    <input type="text" name="pteamName" value="${player.pteamName}" required>
	                </div>
	                <button class="btn" type="submit">Update Player</button>
	            </form>
	        </div>
	    </div>
	
	</main>
	

<%@ include file="footer.jsp" %>
</body>
</html>