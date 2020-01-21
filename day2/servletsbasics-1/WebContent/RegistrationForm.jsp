<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form action="RegistrationServlet">
Name : <input type="text" name="name"><br>
Email : <input type="text" name="email"><br>
Mobile : <input type="text" name="mobile"><br>
Sex : <input type="radio" name="sex" value="male"> Male <input type="radio" name="sex" value="female"> Female <br>
Qualification : UG <input type="checkbox" name="qualification" value="ug">  PG <input type="checkbox" name="qualification" value="pg"> Doctorate <input type="checkbox" name="qualification" value="doc"> Other <input type="checkbox" name="qualification" value="oth"> <br>
City : <input type="text" name="city"> <br>
State :<select name="state">
<option value="kar">Karnataka</option>
<option value="ker">Kerala</option>
<option value="tn">Tamil Nadu</option>
<option value="ap">Andhra Pradesh</option>
<option value="te">Telangana</option>
</select><br>
<input type="submit" value="Submit">
</form>
</body>
</html>