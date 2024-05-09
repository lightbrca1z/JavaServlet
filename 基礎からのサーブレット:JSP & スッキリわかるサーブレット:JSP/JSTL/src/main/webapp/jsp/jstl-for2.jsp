<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="" method="post">
<select name="count">

<c:forEach var="i" begin="1" end="9">
    <option value="${i}">${i}</option>
</c:forEach>

</select>
<p><input type="submit" value="確定"></p>
</form>

</body>
</html>