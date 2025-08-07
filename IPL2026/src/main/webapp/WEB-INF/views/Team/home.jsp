<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>${teamName} | IPL</title>
  <link rel="stylesheet" href="/resources/css/Team/homeStyle.css">
</head>
<body class="${shortName}">
  <div class="container">
  
    <!-- Sidebar -->
    <%@ include file="sidebar.jsp" %>

    <!-- Main Content -->
    <div class="main-content">
      <h1>Welcome to <span>${teamFullName}</span></h1>
      <p class="desc">
        ${teamFullName} is one of the most thrilling franchises in the IPL. Explore the squad, track live matches, and show your support in fan polls.
      </p>
      <img src="${logoPath}" alt="${teamName} Logo" class="team-logo-large team-logo">
    </div>
  </div>
</body>
</html>
