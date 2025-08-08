<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="header.jsp" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Orange Cap Leaderboard | IPL</title>
    <link rel="stylesheet" href="/resources/css/orangeCap.css">
</head>
<body>
    <div class="orangecap-container">
        <div class="orangecap-header">
            <img src="/resources/images/product/orangeCap.png" class="cap-icon" alt="Orange Cap">
            <h1 class="heading">Orange Cap Leaderboard</h1>
        </div>

        <div class="card-list-scroll">
            <c:forEach var="player" items="${battingList}">
                <div class="player-card">
                    <img src="${player.imgPath}" alt="${player.pname}" class="player-img">

                    <div class="player-info">
                        <h2 class="player-name">${player.pname}</h2>
                        <p class="team-name">${player.pteamName}</p>
                        <p class="player-runs">${player.runs}</p>
                        <p class="player-role">${player.role}</p>
                       <p class="strike-rate">Strike Rate: 
						  <span>
						    <%= (int)(100 + Math.random() * 50) %>
						  </span>
						</p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>
