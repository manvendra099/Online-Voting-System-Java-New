<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html><html><head><title>OVMS - Register</title><link rel="stylesheet" href="css/style.css"></head><body>
<div class="card"><h2>User Registration</h2>
<% if("already".equals(request.getParameter("error"))){ %><div class="error">Email already registered.</div><% } %>
<% if("empty".equals(request.getParameter("error"))){ %><div class="error">Please fill all fields.</div><% } %>
<form action="RegisterServlet" method="post"><input type="text" name="name" placeholder="Full name" required /><br/>
<input type="email" name="email" placeholder="Email address" required /><br/>
<input type="password" name="password" placeholder="Password" required /><br/><button type="submit">Register</button></form>
<p>Already registered? <a href="index.jsp">Login here</a></p></div></body></html>
