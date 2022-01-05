<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subscribe</title>
<style>
@import url('https://fonts.googleapis.com/css2?family=Mulish:wght@300;400;500;600;700&display=swap');

body {
	background: linear-gradient(to left, #33ccff 0%, #ff99cc 100%);
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	font-family: 'Mulish', sans-serif;
}


.subscribe {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	background: white;
	width: 945px;
	height: 474px;
	border-radius: 10px;
	box-shadow: 0 4px 20px rgba(61, 159, 255, 0.2)
}


.subscribe__title {
	font-weight: bold;
	font-size: 26px;
	margin-bottom: 18px;
}

.subscribe__copy {
	max-width: 450px;
	text-align: center;
	margin-bottom: 53px;
	line-height: 1.5;
}

.form {
	margin-bottom: 25px;
}

.form__email {
	padding: 20px 25px;
	border-radius: 5px;
 	border: 1px solid #CAD3DB;
	width: 431px;
	font-size: 18px;
	color: #0F121F;
}

.form__email:focus {
	outline: 1px solid #3D9FFF;
}

.form__button {
	background: #3D9FFF;
	padding: 10px;
	border: none;
	width: 244px;
	height: 65px;
	border-radius: 5px;
	font-size: 18px;
	color: white;
	box-shadow: 0 4px 20px rgba(61, 159, 255, 0.7);
	
}

.form__button:hover {
	box-shadow: 0 10px 20px rgba(61, 159, 255, 0.7);
}

.notice {
	width: 345px;
}
</style>
</head>
<body>
<form method = "post" action ="MailApp" onsubmit="if(document.getElementById('agree').checked) { return true; } else { alert('Please Tick the CheckBox to Continue'); return false; }">
<div class="subscribe">
	<h2 class="subscribe__title">Let's keep in touch</h2>
	<p class="subscribe__copy">Subscribe to keep up with fresh news and exciting updates. We promise not to spam you!</p>
	<div class="form">
	
		<input type="email" class="form__email" placeholder="Enter your email address" name = "toemail"/>
		<button class="form__button">Send</button>
		
	</div>
	<div class="notice">
		<input type="checkbox" name="checkbox" value="check" id="agree" />I agree to my email address being stored and uses to recieve monthly newsletter.
		<span class="notice__copy"></span>
	</div>
</div>
</form>
<a href="index.jsp">
         <img alt="Back Button" src="https://key0.cc/images/preview/61345_68efbf823f581ee5c8134a131f0e43d0.png"
          width=40" height="40"></a>
</body>
</html>