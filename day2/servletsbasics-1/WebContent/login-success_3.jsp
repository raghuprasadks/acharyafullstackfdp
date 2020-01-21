<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login-Success</title>
</head>
<body>
<h1>Login Result</h1>
<h2>Status : </h2>
<%
String status = (String)request.getAttribute("status");
out.print(status);
%>

</body>
</html>