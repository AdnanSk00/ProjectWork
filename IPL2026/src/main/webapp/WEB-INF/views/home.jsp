<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<c:choose>
   <c:when test="${admin eq 'Ok'}">
      <jsp:include page="adminHeader.jsp" />
   </c:when>
   <c:otherwise>
      <jsp:include page="header.jsp" />
   </c:otherwise>
</c:choose>

	

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home | IPL</title>
	<link rel="stylesheet" href="/resources/css/homeStyle.css">
</head>

<body class="home-body">
	<c:if test="${not empty msgKeyLogin || not empty msgKeyRegister || not empty msgKey}">
		<div class="msg" id="LoginMsg">${msgKeyLogin}</div>
		<div class="msg" id="RegisterMsg">${msgKeyRegister}</div>
		<div class="msg" id="UserInsertMsg">${msgKeyUserInsert}</div>
		<div class="msg" id="addProduct">${msgKey}</div>

		<script>
			setTimeout(function () {
				document.getElementById("LoginMsg").style.display = "none";
				document.getElementById("RegisterMsg").style.display = "none";
				document.getElementById("UserInsertMsg").style.display = "none";
				document.getElementById("addProduct").style.display = "none";
			}, 2000);
		</script>
	</c:if>

	<div class="ipl-logo-section">
		<img src="/resources/images/iplLogo.svg" alt="IPL Logo" class="ipl-main-logo">
	</div>

	<div class="team-logo-section">
		<div class="team-row">
			<img src="/resources/images/teamLogo/csk.svg" alt="CSK">
			<img src="/resources/images/teamLogo/mi.svg" alt="MI">
			<!-- <img src="/resources/images/teamLogo/rcb.svg" alt="RCB"> -->
		<a href="/rcb-home"><img src="/resources/images/teamLogo/rcb.svg" alt="RCB"></a>
			<img src="/resources/images/teamLogo/pbks.svg" alt="PBKS" class="pbks">
			<img src="/resources/images/teamLogo/rr.png" alt="RR">
		</div>
		<div class="team-row">
			<img src="/resources/images/teamLogo/dd.svg" alt="DC">
			<img src="/resources/images/teamLogo/gt.svg" alt="GT">
			<img src="/resources/images/teamLogo/kkr.svg" alt="KKR">
			<img src="/resources/images/teamLogo/srh.svg" alt="SRH">
			<img src="/resources/images/teamLogo/lsg.svg" alt="LSG">
		</div>
	</div>

	<%@ include file="footer.jsp" %>
</body>
</html>
