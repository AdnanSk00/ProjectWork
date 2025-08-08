<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="adminHeader.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/css/allProductStyle.css" />
	<title>Players | IPL</title>
	
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
			<caption> <h1> Player Details </h1></caption>
			<thead>
				<tr class="header">
					<th>No</th>
					<th>Team</th>
					<th>Vs Team</th>
					<th>Location</th>
					<th><i>Date</i></th>
					<th><i>Time</i></th>
					<th><i>Update</i></th>
					<th><i>Delete</i></th>
				</tr>
			</thead>
			</tbody>
				<c:forEach var="match" items="${matchList}">
					<tr>
						<td>${match.matchNo}</td>
						<td>${match.team}</td>
						<td>${match.vsTeam}</td>
						<td>${match.location}</td>
						<td>${match.date}</td>
						<td>${match.time}</td>
						<td><a class="btn btn-update" href="/get-updateMatch/${match.matchNo}">Update</a></td>
						<td><a class="btn btn-delete" href="/deleteMatch/${match.matchNo}" onclick="return confirm('Are you sure you want to delete?')">Delete</a></td>
					</tr>
				</c:forEach>
			<tbody>
		</table>
		
	</main>
	
<%@ include file="footer.jsp" %>

	<script type="text/javascript">
	</script>
</body>

</html>