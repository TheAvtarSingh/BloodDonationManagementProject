<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<style>
div {
    height: 1000px;
    background: linear-gradient(to top right, #ff66cc 1%, #000066 100%)
}
</style>
<body>

<div><center><h3 style="color:white ;font-size:52px;">Welcome to Portal</h3><br><br>
<form method = "post" action = "OnlyUserSee">

<h3 style="color:white ;font-size:45px;">Enter User Username : </h3>
<input type ="text" name = "id" placeholder = " Enter ID : "/>

  <br><br><br><br>
					<button>See Records</button>
				</form>
				<br> <h3 style="color:white ;font-size:45px;">
				<a href="index.jsp">Click Here To Go Home </a></h3>
				<h3 style="color:white ;font-size:45px;">
				<a href="UserDashboard.jsp">Click Here To Go Dashboard </a></h3>
				</center>
				
</div>
</body>
</html>