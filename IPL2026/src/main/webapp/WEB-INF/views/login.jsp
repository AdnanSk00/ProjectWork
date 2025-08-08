<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
	<link rel="stylesheet" type="text/css" href="/resources/css/loginStyle.css" />
	<title>Login | IPL</title>
</head>
	<body class="home-body">
		<main>
			<div class="wrapper">
		        <span class="bg-animate"></span>
		        <span class="bg-animate2"></span>
		        
		        <div class="form-box login">
		            <h2 class="animation" style="--i:0; --j:21;">Login</h2>
		            <form action="/verify-login" method="post">
		                <div class="input-box animation long" style="--i:1; --j:22;">
						    <input type="text" name="userName" required>
						    <label class="place-label">Username</label>
						    <p class="error-label">${worngUserNameOrPass}</p>
						    <i class='bx bxs-user'></i>
		                    <!-- <img src="/resources/images/loginImg/bxs-user.svg" alt=""> -->
						</div>
		               	<div class="input-box animation long" style="--i:2; --j:23;">
						    <input type="password" name="pass" required>
						    <label class="place-label">Password</label>
						    <p class="error-label">${wrongPass}</p>
						    <i class='bx bxs-lock-alt'></i>
		                    <!-- <img src="/resources/images/loginImg/bxs-lock-alt.svg" alt=""> -->
						</div>
		                <button type="submit" class="btn animation" style="--i:3; --j:24;">Login</button>	                
				        <div class="logreg-link animation" style="--i:4; --j:25;">
	                    	<p>Don't have an account? <a href="#" class="register-link">Sign Up</a></p>
	                	</div>
				       	<p class="loginMsg">${msgKeyLogin}</p>
		                
		            </form>
		        </div>
		        
		        <div class="info-text login">
		            <h2 class="animation" style="--i:0; --j:20;">Welcome Back!</h2>
		            <p class="animation"  style="--i:1; --j:21;">World's biggest premier league.</p>
		        </div>
		
		        <div class="form-box register">
		            <h2 class="animation" style="--i:17; --j:0">Sign Up</h2>
		            <form action="/register-user" method="post">
		                <div class="input-box animation short" style="--i:18; --j:1;">
		                    <input type="text" name="uid" required>
		                    <label>ID</label>
		                    <i class='bx bxs-id-card'></i>
		                    <!-- <img src="/resources/images/loginImg/bxs-id-card.svg" alt=""> -->
		                </div>
		                <div class="input-box animation short" style="--i:19; --j:2;">
		                    <input type="text" name="userName" required>
		                    <label>Username</label>
		                    <i class='bx bxs-user'></i>
		                    
		                   <!--  <img src="/resources/images/loginImg/bxs-user.svg" alt=""> -->
		                </div>
		                <div class="input-box animation short" style="--i:20; --j:3;">
		                    <input type="email" name="email" required>
		                    <label>Email</label>
		                    <i class='bx bxs-envelope'></i>
		                    <!-- <img src="/resources/images/loginImg/bxs-envelope.svg" alt=""> -->
		                </div>
		                <div class="input-box animation short" style="--i:21; --j:4;">
		                    <input type="tel" name="mob" required>
		                    <label>Phone</label>
		                    <i class='bx bxs-phone'></i>
		                    <!-- <img src="/resources/images/loginImg/bxs-phone.svg" alt=""> -->
		                </div>
		                <div class="input-box animation short" style="--i:22; --j:5;">
		                    <input type="password" name="pass" required>
		                    <label>Password</label>
		                    <i class='bx bxs-lock-alt'></i>
		                    <!--  <img src="/resources/images/loginImg/bxs-lock-alt.svg" alt=""> -->
		                </div>
		                <button type="submit" class="btn animation" onclick="hideMsg()" style="--i:21; --j:4;">Sign Up</button>
		                <div class="logreg-link animation" style="--i:22; --j:5;">
		                    <p>Already have an account? <a href="#" class="login-link">Login</a></p>
		                </div>

		            </form>
		        </div>
		        <div class="info-text register">
		            <h2 class="animation" style="--i:17; --j:0;">Welcome Back!</h2>
		            <p class="animation" style="--i:18; --j:1;">World's biggest premier league.</p>
		        </div>
			</div>
		</main>
		<c:if test="${not empty redirectAfterDelay1}">
		    <script>
		        setTimeout(function() {
		            window.location.href = "/";
		        }, 2500); // 3000 ms = 3 seconds
		    </script>
		</c:if>
		<c:if test="${not empty redirectAfterDelay1}">
		    <script>
		        setTimeout(function() {
		            window.location.href = "/";
		        }, 2500); // 3000 ms = 3 seconds
		    </script>
		</c:if>

		<script type="text/javascript">
			const wrapper = document.querySelector(".wrapper")
			const registeLink = document.querySelector(".register-link")
			const loginLink = document.querySelector(".login-link")
			
			registeLink.onclick = () => {
			  wrapper.classList.add('active');
			}
			
			loginLink.onclick = () => {
			  wrapper.classList.remove('active');
			}
						
		</script>
		
		<%@ include file="footer.jsp" %>
	</body>
</html>

