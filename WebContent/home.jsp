<%@ page import="model.User" %><%@ page session="true" %><%
User u = (User) session.getAttribute("user"); if (u == null) { response.sendRedirect("index.jsp"); return; }
%><!DOCTYPE html><html><head><title>OVMS - Home</title><link rel="stylesheet" href="css/style.css"></head><body>
<div class="card"><h2>Welcome, <%=u.getName()%></h2><p>You are logged in as <strong><%=u.getEmail()%></strong></p>
<form action="LogoutServlet" method="post"><button type="submit">Logout</button></form><hr/><h3>Review-1 Complete</h3></div></body></html>
