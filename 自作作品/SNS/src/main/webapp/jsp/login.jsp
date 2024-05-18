<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
    if (session != null && session.getAttribute("user_id") != null) {
        response.sendRedirect("login.jsp"); // ここはlogin.jspではなくindex.jspにリダイレクト
        return;
    }
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form action="../login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <br/>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br/>
        <button type="submit">Login</button>
    </form>
    <p>Don't have an account? <a href="register.jsp">Register here</a></p>
</body>
</html>
