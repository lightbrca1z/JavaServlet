<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Product p=(Product)request.getAttribute("product"); %>
<%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %><br>
</body>
</html>