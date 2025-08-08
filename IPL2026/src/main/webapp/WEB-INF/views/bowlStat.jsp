<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="header.jsp" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Purple Cap Leaderboard | IPL</title>
    <link rel="stylesheet" href="/resources/css/purpleCap.css">
</head>
<body>
    <div class="purplecap-container">
        <div class="purplecap-header">
            <img src="/resources/images/product/purpleCap.png" class="cap-icon" alt="Purple Cap">
            <h1 class="heading">Purple Cap Leaderboard</h1>
        </div>

        <div class="card-list-scroll">
            <c:forEach var="player" items="${bowlingList}">
                <div class="player-card">
                    <img src="${player.imgPath}" alt="${player.pname}" class="player-img">

                    <div class="player-info">
                        <h2 class="player-name">${player.pname}</h2>
                        <p class="team-name">${player.pteamName}</p>
                        <p class="player-wickets">Wickets - ${player.wickets}</p>
                        <p class="player-role">${player.role}</p>
                       <p class=".player-economy">Economy : 
						  <span>
						    <%= (float)(5 + Math.random() * 6) %>
						  </span>
						</p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>
