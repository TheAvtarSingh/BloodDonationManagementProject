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

<div><center><h3 style="color:white ;font-size:52px;">Welcome to Center Verification Wizard</h3><br><br>
<form method = "post" action = "verificationfromcenter">

<h3 style="color:white ;font-size:45px;">Enter Unique Id Provided : </h3>
<input type ="number" name = "id" placeholder = " Enter ID : "/>




  <h3 style="color:white ;font-size:45px;">Enter Donation Status</h3>
					<br><br>
					  <select id="don" name="donationstatus">
    <option value="Pending">Pending</option>
    <option value="Done">Done</option>

  </select>
  <br><br><br><br>
					<button>Update Records</button>
				</form>
				<br> <h3 style="color:white ;font-size:45px;">
				<a href="CenterDashboard.jsp">Click Here To Go Home </a></h3>
				</center>
				
</div>
</body>
</html>