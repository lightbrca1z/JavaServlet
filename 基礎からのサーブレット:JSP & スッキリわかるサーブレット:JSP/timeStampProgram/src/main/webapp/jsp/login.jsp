<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h1>ログイン</h1>
　　 <%-- 登録完了メッセージがセットされている場合は表示 --%>
    <% String message = (String) request.getAttribute("message"); %>
    <% if (message != null && !message.isEmpty()) { %>
        <p><%= message %></p>
    <% } %>
<form action="../login" method="post">
ID:<input type="text" name="username"><br>
PASS:<input type="password" name="password"><br>
<input type="submit" value="ログイン"><br>
</form>
<form action="./accountRegist.jsp" method="post">
<input type="submit" value="アカウント登録">
</form>
</body>
</html>