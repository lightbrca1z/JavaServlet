<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet/JSP Sample</title>
</head>
<body>
<p>追加する商品を入力してください。</p>
<form action="../Insert2" method="post">
商品名<input type="text" name="name">
価格<input type="text" name="price">
<input type="submit" value="追加">
</form>
</body>
</html>