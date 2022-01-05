
<!DOCTYPE html>
<html>
<style type="text/css">
	*{
		font-family: sans-serif;
	}
	body{
		background-image: linear-gradient(315deg, #6b0f1a 0%, #b91372 74%);
	}
	#container{
		width: 70vw;
		height: 640px;
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%,-50%);
		border:1px solid grey;
		border-radius: 10px;
		background: white;
	}
	.form-control > label , .form-control > input{
		height: 18px;
		border-radius: 10px;
	}
	.form-control > label{
		width: 200px;
		line-height: 12px;
		position: absolute;
		right: 50%;
		transform: translate(-20px,4px);
	}
	.form-control{
		position: absolute;
		left: 50%;
		transform: translate(-50%,-50%);
	}
	#f1{
		top:30px;
	}
	#f2{
		top:70px;
	}
	#f3{
		top:110px;
	}
	#f4{
		top:185px;
	}
	#f5{
		top:225px;
	}
	#f6{
		top:265px;
	}
	#f7{
		top:330px;
	}
	#f8{
		top:370px;
	}
	#f9{
		top:410px;
	}
	#f10{
		top:440px;
	}
	#f11{
		top:480px;
	}
	#f12{
		top:512px;
	}
	#f13{
		top:570px;
	}
	#btn{
		width:150px;
		height: 30px;
		position: absolute;
		left: 50%;
		top:620px;
		transform: translate(-50%,-50%);
		cursor: pointer;
		background-image: linear-gradient(315deg, #6b0f1a 0%, #b91372 74%);
		border:none;
		border-radius: 15px;
		color: white;
		font-weight: bold;
	}
	#address{
		position: absolute;
		width:180px;
		height:40px;
		line-height: 40px;
		text-align: center;
		top: 130px;
		left:12%;
		background: white;
		border-right:1px solid grey;
		border-left: 1px solid grey;
		transform: translate(-50%,-50%);
		border-radius: 10px;
	}
	#hr1{
		width: 100%;
		height:1px;
		position: absolute;
		left: 0;
		top: 145px;
		transform: translate(0%,-50%);
		background: grey;
		border:none;
	}
	#hr2{
		width: 100%;
		height:1px;
		position: absolute;
		left: 0;
		top: 290px;
		transform: translate(0%,-50%);
		background: grey;
		border:none;
	}
	#bg, #gender{
		width:180px;
		height:25px;
		border-radius: 10px;
		padding-right: 10px;
	}
	#bg > option, #gender > option{
		padding: 10px;
	}
</style>
<body>
<div id="container">

	<form method = "post" action = "bookappointment">
	 
		<div class="form-control" id="f1">
          <label for="fname">First Name</label>
          <input type="text" name="fname" placeholder="First Name" required />
        </div>
		<div class="form-control" id="f2">
          <label for="lname">Last Name</label>
          <input type="text" name="lname" placeholder="Last Name" required />
        </div>
		<div class="form-control" id="f3">
          <label for="email">Email</label>
          <input type="email" name="email" placeholder="Email" required />
        </div>
      
<hr id="hr1">
		<div class="form-control" id="f4">
          <label for="City">City</label>
          <input type="text" name="city" placeholder="Enter Your City" required />
        </div>
       
        <div class="form-control" id="f5">
          <label for="State">State</label>
          <input type="text" name="state" placeholder="Enter Your State" required />
        </div>
         <div class="form-control" id="f6">
          <label for="Country">Country</label>
          <input type="text" name="country" placeholder="Enter Your Country" required />
        </div>

        <hr id="hr2">

        <div class="form-control" id="f7">
          <label for="phone">Phone Number</label>
          <input type="number" name="phone" placeholder="Enter Last 5 digits" required />
        </div>
        <div class="form-control" id="f8">
          <label for="username">Username</label>
          <input type="text" name="uname" placeholder="Username" required />
        </div>
        <div class="form-control" id="f9">
          <label for="password">Password</label>
          <input type="password" name="password" placeholder="Password" required />
        </div>
        <div class="form-control" id="f10">
          <label for="bg">Blood Group</label>
          <select name="bgroup">
          	<option value="A+">A+</option>
          	<option value="A-">A-</option>
          	<option value="B+">B+</option>
          	<option value="B-">B-</option>
          	<option value="O+">O+</option>
          	<option value="O-">O-</option>
          	<option value="AB+">AB+</option>
          	<option value="AB-">AB-</option>
          </select>
        </div>
        <div class="form-control" id="f11">
          <label for="disease">Disease</label>
          <input type="text" name="disease" placeholder="if NO , Please Enter 'NA'"/>
        </div>
        <div class="form-control" id="f12">
          <label for="gender">Gender</label>
          <select name="gender">
          	<option value="male">Male</option>
          	<option value="Female">Female</option>
          	<option value="other">Other</option>
          </select>
        </div>
        <div class="form-control" id="f13">
          <label for="age">Age</label>
          <input type="number" name="age" placeholder="20"/><br><center>
           <button type="submit" value = "submit">SUBMIT</button></center>
           <h3 style="font-size:12px;">
				<a href="index.jsp">Click Here To Go Home </a>
				<a href="UserDashboard.jsp">Click Here for Dashboard </a>
       </h3>
       </div>
        
        
	</form>
</div>
</body>
</html>

