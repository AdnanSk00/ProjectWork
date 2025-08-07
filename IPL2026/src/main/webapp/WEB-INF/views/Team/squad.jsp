<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>${teamName} Squad | IPL</title>
  <link rel="stylesheet" type="text/css" href="/resources/css/Team/squadStyle.css">


</head>
<body class="${shortName}">
  <div class="container">
    <%@ include file="sidebar.jsp" %>
    <div class="main-content">
      <h1>${teamName} Squad</h1>
      <p class="desc">Meet the warriors of ${teamName} for IPL 2026. Get to know your squad!</p>

      <div class="squad-grid">
        <c:forEach var="player" items="${playerList}">
          <div class="player-card">
            <img src="${player.imgPath}" alt="${player.pname}">
            <h3>${player.pname}</h3>
            <p>${player.role}</p>
          </div>
        </c:forEach>
      </div>
    </div>
  </div>
</body>

</html>
