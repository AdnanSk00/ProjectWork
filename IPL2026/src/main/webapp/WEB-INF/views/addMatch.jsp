<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="adminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/addPlayerStyle.css" />
	<title>New Match | IPL</title>
	
</head>
<body>
	<main>
	   <div class="wrapper">
	        <div class="form-wrapper sign-in">
	            <form action="/add-match" method="post">
	                <h2>Add New Match</h2>
	                <div class="input-group">
					    <label for="">Match No</label>
					    <input type="number" name="matchNo" required>
					</div>
					
					<div class="input-group">
					    <label for="">Match Team</label>
					    <input type="text" name="team" required>
					</div>
					
					<div class="input-group">
					    <label for="">Match vsTeam</label>
					    <input type="text" name="vsTeam" required>
					</div>
					
					<div class="input-group">
					    <label for="">Location</label>
					    <input type="text" name="location" required>
					</div>
					
					<div class="input-group">
					    <label for="">Date</label>
					    <input type="date" name="date" required>
					</div>
					
					<div class="input-group">
					    <label for="">Time</label>
					    <input type="time" name="time" required>
					</div>
					
					<div class="input-group">
					    <label for="">Status</label>
					    <input type="text" name="status" required>
					</div>
	                <button class="btn" type="submit">Add Match</button>
	            </form>
	        </div>
	    </div>
	
	</main>
	

<%@ include file="footer.jsp" %>
</body>
</html>