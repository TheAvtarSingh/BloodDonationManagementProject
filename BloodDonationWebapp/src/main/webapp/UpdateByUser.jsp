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
    height: 5000px;
    background: linear-gradient(to top right, #ff66cc 1%, #000066 100%)
}
</style>
<body>

<div><center><h3 style="color:white ;font-size:52px;">Welcome to User Upgradation Wizard</h3><br><br>
<form method = "post" action = "UpdateUserOwn">

<h3 style="color:white ;font-size:45px;">Enter Unique Id Provided : </h3>
<input type ="number" name = "id" placeholder = " Enter ID : "/>
<h3 style="color:white ;font-size:45px;">Enter Your First Name : </h3>
<input type ="text" name = "fname" placeholder = " Enter First Name : "/>
<h3 style="color:white ;font-size:45px;">Enter Your Last Name : </h3>
<input type ="text" name = "lname" placeholder = " Enter Last Name : "/>
<h3 style="color:white ;font-size:45px;">Enter Your Email Address : </h3>
<input type ="text" name = "email" placeholder = " Enter Email Address : "/>
<h3 style="color:white ;font-size:45px;">Enter Your City : </h3>
<input type ="text" name = "city" placeholder = " Enter City : "/>
<h3 style="color:white ;font-size:45px;">Enter Your State : </h3>
<input type ="text" name = "state" placeholder = " Enter State : "/>
<h3 style="color:white ;font-size:45px;">Enter Your Phone Numer(last 5 Digits) : </h3>
<input type ="number" name = "phnumber" placeholder = " Enter Phone Number : "/>
<h3 style="color:white ;font-size:45px;">Enter Your User Name : </h3>
<input type ="text" name = "uname" placeholder = " Enter Username : "/>
<h3 style="color:white ;font-size:45px;">Enter Your Password : </h3>
<input type ="text" name = "password" placeholder = " Enter Password : "/>
<h3 style="color:white ;font-size:45px;">Enter Your Blood Group : </h3>
<input type ="text" name = "bgroup" placeholder = " Enter Blood Group : "/>
<h3 style="color:white ;font-size:45px;">Enter Disease : </h3>
<input type ="text" name = "disease" placeholder = " if not enter - NA : "/>
<h3 style="color:white ;font-size:45px;">Enter Your Gender : </h3>
<input type ="text" name = "gender" placeholder = " Enter Gender : "/>

<h3 style="color:white ;font-size:45px;">Enter Your Age : </h3>
<input type ="text" name = "age" placeholder = " Enter Age : "/>

  <br><br><br><br>
					<button>Update Records</button>
				</form>
				<br> <h3 style="color:white ;font-size:45px;">
				<a href="UserDashboard.jsp">Click Here To Go Home </a></h3>
				</center>
				
</div>
</body>
</html>