<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="css/Login.css">
</head>
<body>
	<div id="bg"></div>
	<form action="LoginUserValidation" method="post">  
		<input type="text" class="Fname" name="username" placeholder="Username" /><br/>
		<input type="password" class="Pass" name="userpass" placeholder="Password"/><br/>
		<input type="submit" class="Btn" value="Submit" /> 
	</form>
</body>
</html>