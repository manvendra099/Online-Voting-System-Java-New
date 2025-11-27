<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html><head><title>OVMS - Login</title><link rel="stylesheet" href="css/style.css"></head><body>
<div class="card"><h2>Online Vote Management System</h2>
<% if("registered".equals(request.getParameter("msg"))){ %><div class="info">Registration successful. Please login.</div><% } %>
<% if("invalid".equals(request.getParameter("error"))){ %><div class="error">Invalid credentials. Try again.</div><% } %>
<% if("empty".equals(request.getParameter("error"))){ %><div class="error">Please enter email and password.</div><% } %>
<form action="LoginServlet" method="post"><input type="email" name="email" placeholder="Email" required autofocus /><br/>
<input type="password" name="password" placeholder="Password" required /><br/><button type="submit">Login</button></form>
<p>New user? <a href="register.jsp">Register here</a></p></div></body></html>
