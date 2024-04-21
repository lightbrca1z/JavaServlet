<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>アカウント登録</title>
</head>
<body>
    <h1>アカウント登録</h1>
    <form action="../accountRegist" method="post">
        <label for="username">ユーザー名:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">パスワード:</label>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="登録">
    </form>
</body>
</html>