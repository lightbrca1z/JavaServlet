<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../control" method="post">
<p>レストランをご予約ください。</p>

<p>
人数
<select name="count">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
</select>
</p>

<p>
座席
<input type="radio" name="seat" value="禁煙" checked>禁煙
<input type="radio" name="seat" value="喫煙">喫煙
</p>

<p>オプション
<input type="checkbox" name="option" value="ケーキ">ケーキ
<input type="checkbox" name="option" value="花束">花束
</p>

<p><input type="submit" value="予約"</p>
</form>
</body>
</html>