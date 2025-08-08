<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/resources/css/headerStyle.css" />
</head>
<body>

<header class="main-header">
    <nav class="nav-container">
        <!-- Left Side Links -->
        <div class="nav-left">
            <a href="/">Home</a>
            <a href="/view-bat">Batting Stats</a>
            <a href="/view-bowl">Bowling Stats</a>
            <a href="/points-table">Points Table</a>
        </div>

        <!-- Right Side Links -->
        <div class="nav-right">
            <a href="/get-shop">Shop</a>
            <a href="/view-carts">Carts</a>
            <a href="/view-orders">Orders</a>

            <!-- Show Login if not logged in -->
            <c:if test="${empty sessionScope.loggedInUser}">
                <a href="/get-login" class="login-btn">Login</a>
            </c:if>

            <!-- Show Logout if logged in -->
            <c:if test="${not empty sessionScope.loggedInUser}">
                <a href="/logout" class="logout-btn">Logout</a>
            </c:if>
        </div>
    </nav>
</header>

</body>
</html>
