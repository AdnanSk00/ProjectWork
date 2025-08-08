<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${teamName} Matches</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/Team/matchStyle.css">
</head>
<body class="${shortName}">
<div class="container">
    <%@ include file="sidebar.jsp" %>

    <div class="main-content">
        <h1>${teamName} Matches - IPL 2026</h1>
        <p class="desc">Follow ${teamName}'s IPL 2026 journey — from thrilling encounters to victorious moments!</p>

        <div class="match-grid">
            <c:forEach var="match" items="${matchList}">
                <div class="match-card">
                    <div class="match-header">
                        <h3>Match ${match.matchNo}</h3>
                        <span class="status ${match.status}">${match.status}</span>
                    </div>

                    <div class="teams-row">
                        <div class="team">
                            <img src="/resources/images/teamLogo/${fn:toLowerCase(match.team)}.svg" alt="${match.vsTeam}" />
                            <h4>${match.team}</h4>
                        </div>
                        <span class="vs-text">VS</span>
                        <div class="team">
                            <img src="/resources/images/teamLogo/${fn:toLowerCase(match.vsTeam)}.svg" alt="${match.vsTeam}" />
                            <h4>${match.vsTeam}</h4>
                        </div>
                    </div>

                    <div class="match-info">
                        <p><strong>Location:</strong> ${match.location}</p>
                        <p><strong>Date:</strong> ${match.date}</p>
                        <p><strong>Time:</strong> ${match.time} PM</p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</body>
</html>
