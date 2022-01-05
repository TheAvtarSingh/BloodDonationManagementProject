<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<style>
div {
    height: 400px;
    background: linear-gradient(to top right, #ff66cc 1%, #000066 100%)
}
</style>
<body>
<div><center><br><br>
<form method = "post" action = "Viewspecificdonor">
					
					<input type="text" name="bloodgroup" placeholder="Blood Group" required="">
					<input type="text" name="city" placeholder="City" required="">
					<button>See Results</button>
				</form>
				</center></div>
</body>
</html>