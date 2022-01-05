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

<div><center><h3 style="color:white ;font-size:52px;">Welcome to Updation Wizard</h3><br><br>
<form method = "post" action = "updatedonorstatus">

<h3 style="color:white ;font-size:45px;">Enter Unique Id Provided : </h3>
<input type ="number" name = "id" placeholder = " Enter ID : "/>




					<h3 style="color:white ;font-size:45px;">Enter Blood Group</h3>
					
					
					  <select id="bgroup" name="bloodgroup">
    <option value="A+">A+</option>
    <option value="B+">B+</option>
    <option value="AB+">AB+</option>
    <option value="O+">O+</option>
  </select>
  <h3 style="color:white ;font-size:45px;">Enter Donation Status</h3>
					<br><br>
					  <select id="don" name="donationstatus">
    <option value="Pending">Pending</option>
    <option value="Done">Done</option>

  </select>
   <h3 style="color:white ;font-size:45px;">Enter Blood Use Status</h3>
				<br>
										  <select id="use" name="usedstatus" placeholder="Sample Used Current Condition" required="">
    <option value="Pending">Pending</option>
    <option value="Done">Done</option>

  </select><br><br><br><br>
					<button>Update Records</button>
					<br> <h3 style="color:white ;font-size:45px;">
				<a href="index.jsp">Click Here To Go Home </a></h3>
				</center>
				</form>
				
				
</div>
</body>
</html>