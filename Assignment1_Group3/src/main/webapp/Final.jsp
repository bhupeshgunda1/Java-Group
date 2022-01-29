<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Page</title>
<link rel="stylesheet" href="css/Final.css">
</head>

<body id="final">
	<img src="logo.jpg"> Result:
	<br> Average score :
	<%=request.getParameter("average")%><br> Minimum score :
	<%=request.getParameter("min")%><br> Maximum score :
	<%=request.getParameter("max")%>
	<br> Grade:
	<%=request.getParameter("grade")%>

	<div id="team">
		By
		<ul>
			<li>Avinash Kour</li>
			<li>Ayesha Abdul Basith</li>
			<li>Bhupesh Gunda</li>
			<li>Manvir Singh Sodhi</li>
			<li>Sathish Thimma Reddy</li>
		</ul>
	</div>

</body>
</html>