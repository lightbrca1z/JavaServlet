<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CheckBox</title>
</head>
<body>
<p>お買い得情報を受け取るジャンルをお選びください。</p>
<form action="../checkbox" method="post">
<p><input type="checkbox" name="genre" value="家電">家電</p>
<p><input type="checkbox" name="genre" value="玩具(がんぐ)">玩具(がんぐ)</p>
<p><input type="checkbox" name="genre" value="時計">時計</p>
<p><input type="checkbox" name="genre" value="書籍">書籍</p>
<p><input type="checkbox" name="genre" value="ゲーム">ゲーム</p>
<p><input type="checkbox" name="genre" value="文房具">文房具</p>
<p><input type="checkbox" name="genre" value="食品">食品</p>
<p><input type="submit" value="確定"></p>
</form>
</body>
</html>