<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User, model.Mutter, java.util.List" %>
<%

User loginUser = (User)session.getAttribute("loginUser");

//アプリケーションに保存されたつぶやきリストを取得
List<Mutter> mutterList = (List<Mutter>)request.getAttribute("mutterList");

//リクエストスコープに保存されたエラーメッセージを取得
String errorMsg = (String)request.getAttribute("errorMsg");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶメイン</h1>
<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="./Logout">ログアウト</a>
</p>

<p><a href="./Main2">更新</a></p>
<form action="./Main2" method="post">
<input type="text" name="text">
<input type="submit" value="つぶやく">
</form>

<% if(errorMsg != null) {%>
<p><%= errorMsg %></p>
<%} %>

<% if(mutterList != null) { // mutterListがnullでない場合のみ処理を実行 %>
    <% for(Mutter mutter : mutterList) { %>
        <p><%= mutter.getUserName() %>: <%= mutter.getText() %></p>
    <% } %>
<% } %>
</body>
</html>