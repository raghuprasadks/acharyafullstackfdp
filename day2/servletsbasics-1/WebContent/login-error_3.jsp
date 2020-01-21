<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String status = (String)request.getAttribute("status");
out.print("Sorry! username or password error");
%>
 
<%@ include file="login_3.jsp" %> 

</body>
</html>