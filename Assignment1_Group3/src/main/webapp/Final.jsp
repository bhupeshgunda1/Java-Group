<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Page</title>
<style>
body {
	background-image: url('./css/background.jpg');
	font-family: 'Lato', sans-serif;
	display: flex;
  	justify-content: center;
  	align-items: center;
  	min-height: 100vh;
  	font-size:xx-large;
  	color:White;
	}

</style>
</head>
<body>
<div id="bg"></div>
	
	Average score : <%= request.getParameter("average")%><br>
	Minimum score : <%= request.getParameter("min") %><br>
	Maximum score : <%= request.getParameter("max") %> <br>
	Grade: <%= request.getParameter("grade") %>
</body>
</html>