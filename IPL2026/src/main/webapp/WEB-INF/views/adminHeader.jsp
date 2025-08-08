<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/resources/css/adminHeaderStyle.css" />
</head>
<body>
    <header class="admin-header">
        <div class="nav-left">
            <a href="/">🏠 Dashboard</a>

            <div class="dropdown">
                <button class="dropbtn">📦 Products</button>
                <div class="dropdown-content">
                    <a href="/get-product">Add Product</a>
                    <a href="/view-products">View Products</a>
                </div>
            </div>

            <div class="dropdown">
                <button class="dropbtn">🏏 Players</button>
                <div class="dropdown-content">
                    <a href="/get-player">Add Player</a>
                    <a href="/view-players">View Players</a>
                </div>
            </div>

            <div class="dropdown">
                <button class="dropbtn">📅 Matches</button>
                <div class="dropdown-content">
                    <a href="/get-match">Add Match</a>
                    <a href="/view-matches">View Matches</a>
                </div>
            </div>

            <a href="/view-user">👤 Customers</a>
        </div>

        <div class="nav-right">
        	<div class="dropdown">
                <button class="dropbtn">🛍️ Shopping</button>
                <div class="dropdown-content">
                    <a href="/get-shop">Shop</a>
            		<a href="/view-carts">Carts</a>
           	 		<a href="/view-orders">Orders</a>
                </div>
            </div>
            <a href="/logout" class="logout-btn">🔒 Logout</a>
        </div>
    </header>
</body>
</html>
