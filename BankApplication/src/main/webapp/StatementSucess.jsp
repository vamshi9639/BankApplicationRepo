<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Statement Page</title>
</head>
<body>
	<%
		session = request.getSession();
		out.println("Sender's Account Number: "+ session.getAttribute("sal"));
		out.println("<br><br>");
		out.println("Receiver's Account Number: "+ session.getAttribute("ral"));
		out.println("<br><br>");
		out.println("Amount: "+ session.getAttribute("al"));
	
	%>
</body>
</html>