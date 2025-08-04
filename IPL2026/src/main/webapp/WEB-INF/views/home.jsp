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
			<a href="/csk-home"><img src="/resources/images/teamLogo/csk.svg" alt="CSK"></a>
			<a href="/mi-home"><img src="/resources/images/teamLogo/mi.svg" alt="MI"></a>
			<a href="/rcb-home"><img src="/resources/images/teamLogo/rcb.svg" alt="RCB"></a>
			<a href="/pbks-home"><img src="/resources/images/teamLogo/pbks.svg" alt="PBKS" class="pbks"></a>
			<a href="/r-home"><img src="/resources/images/teamLogo/rr.png" alt="RR"></a>
		</div>
		<div class="team-row">
			<a href="/dc-home"><img src="/resources/images/teamLogo/dc.svg" alt="DC"></a>
			<a href="/gt-home"><img src="/resources/images/teamLogo/gt.svg" alt="GT"></a>
			<a href="/kkr-home"><img src="/resources/images/teamLogo/kkr.svg" alt="KKR"></a>
			<a href="/srh-home"><img src="/resources/images/teamLogo/srh.svg" alt="SRH"></a>
			<a href="/lsg-home"><img src="/resources/images/teamLogo/lsg.svg" alt="LSG"></a>
		</div>
	</div>

	<%@ include file="footer.jsp" %>
</body>
</html>
