<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select/JSP Samples</title>
</head>
<body>
<form action="../select" method="post">
<p>購入数を選択してください。</p>
<select name = "count">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
</select>
<p>購入方法を選択してください。</p>
<input type="radio" name="payment" value="カード" checked>カード
<input type="radio" name="payment" value="代金引換" checked>代金引換
<input type="radio" name="payment" value="銀行振込" checked>銀行振込
<input type="radio" name="payment" value="コンビニ" checked>コンビニ

<p>商品のご感想をお寄せください。</p>
<p><textarea name="review" cols="30" rows="5"></textarea></p>

<p>お知らせメールの受信を希望されますか？</p>
<p><input type="checkbox" name="mail">おすすめ商品のメールを受け取る</p>

<p><input type="submit" value="確定"></p>
</form>

</body>
</html>