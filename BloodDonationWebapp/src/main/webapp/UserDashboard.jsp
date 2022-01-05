<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Dashboard</title>
</head>
<style>div {
    height: 400px;
   background: linear-gradient(to top, #ff0066 12%, #6600ff 87%);
}

    .container {
  position: relative;
  font-family: Arial;
}
.text-block {
  position: absolute;
  bottom: 20px;
  right: 20px;
  background-color: black;
  color: white;
  padding-left: 20px;
  padding-right: 20px;
}

</style>

<body>
<div><h1 style="color:white ;text-align:center;  font-size:300%;">Welcome Sir </h1>
<hr>
 <br>

 
<div class="container">
 <a href="ViewMyDetails.jsp">
         <img alt="Click here to View Complete List" src="https://cdn.pixabay.com/photo/2017/06/10/07/18/list-2389219_1280.png"
         width=300" height="300">
          <div class="text-block">
 <h4 style="font-size:30px;">Click On Image to <br>View Your<br> Information <br>
 <span>&#8592;</span></h4>
    <p style="font-size:30px">*Can also click on text</p>
   
  </div>
</div>



<br>
<hr>
 
<div class="container">
 <a href="UpdateByUser.jsp">
         <img alt="Click here to Update Status" src="https://www.kindpng.com/picc/m/283-2834264_updates-icon-hd-png-download.png"
         width=300" height="300">
          <div class="text-block">
 <h4 style="font-size:30px;">Click On Image to <br>Update Your Details<br>
 <span>&#8592;</span></h4>
    <p style="font-size:30px">*Can also click on text</p>
   
  </div>
  <h1 style="color:white ;text-align:center;  font-size:100%;">
  <a href="index.jsp">Click Here To LogOut</a></h1>
</div>

</div>

</body>
</html>