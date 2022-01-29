<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scores Page</title>
<link rel="stylesheet" href="css/Final.css">
</head>
<body>
<div id="bg"></div>
	<form action="Compute" method="post">  
		<h1> Enter The Student Details</h1>
		<input type="text" class="sub" name="StuName" placeholder="Student name"/><br/>
		<input type="text" class="sub" name="sub1" placeholder="Subject 1"/><br/>
		<input type="text" class="sub" name="sub2" placeholder="Subject 2"/><br/>
		<input type="text" class="sub" name="sub3" placeholder="Subject 3"/><br/>
		<input type="text" class="sub" name="sub4" placeholder="Subject 4"/><br/>
		<input type="text" class="sub" name="sub5" placeholder="Subject 5"/><br/>
		<input type="submit" class="Btn" value="Submit"/> 
	</form>
</body>
</html>