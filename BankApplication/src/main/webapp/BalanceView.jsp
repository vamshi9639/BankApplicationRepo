<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Balance View</title>
</head>
<body>
	<% 
	session = request.getSession();
	out.println(session.getAttribute("cust_bank_bal"));
	%>
	<br><br>
	<a href="Home.html">Goto Home</a>
</body>
</html>