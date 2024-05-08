<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CartAdd</title>
</head>
<body>
<p>カートに追加する商品を入力してください。</p>
<form action="../CartAdd" method="post">
商品名 : <input type="text" name="name">
価格 : <input type="text" name="price">
<input type="submit" value="追加">
</form>
</body>
</html>