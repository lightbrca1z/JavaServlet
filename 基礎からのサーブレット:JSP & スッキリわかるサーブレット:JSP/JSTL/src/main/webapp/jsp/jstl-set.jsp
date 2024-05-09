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
<c:set var="message" value="Hello"></c:set>
<p>mesasge : ${message}</p>


<c:set var="message2">Welcome</c:set>
<p>message2 : ${message2}</p>

<c:set var="result" value="${1+2}"></c:set>
<p>result : ${result}</p>

<jsp:useBean id="product" class="bean.Product" />
<c:set target="${product}" property="name" value="さんま" />
<p>product.name : ${product.name}</p>

<jsp:useBean id="map" class="java.util.HashMap" />
<c:set target="${map}" property="apple" value="りんご" />
<p>map.apple : ${map.apple}</p>
 </body>
</html>