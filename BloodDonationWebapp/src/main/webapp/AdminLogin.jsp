<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin login</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
      *{
        margin: 0;
        padding: 0;
      }
      #main{
        width: 100%;
        height: 100vh;
        box-sizing: border-box;
        background: linear-gradient(135deg,#085467,#afa7bb,#f4c0b3)
      }
      #container{
        width: 70%;
        height: 70vh;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%,-50%);
        font-family: Arial, Helvetica, sans-serif;
        background: white;
        border-radius: 10px;
        overflow: hidden;
      }
      #limg{
        position: absolute;
        top: 40%;
        left: 50%;
        transform: translate(-50%,-50%);
      }
      #left, #right{
        width: 50%;
        height: 100%;
        position: absolute;
        top: 10%;
      }
      #right{
        left: 50%;
      }
      #lform{
        width: 100%;
        height: 100%;
        text-align: center;
      }
      #lform > h1{
        position: absolute;
        top: 10%;
        left:50%;
        transform: translate(-50%,-50%);
        font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
      }
      #lform > input{
        display: block;
        width: 70%;
        height: 40px;
        line-height: 40px;
        position: absolute;
        left: 50%;
        transform: translate(-50%,-50%);
        border-radius: 25px;
        padding-left: 50px;
        box-sizing: border-box;
        background: rgb(231, 226, 226);
        border: none;
      }
      #u{
        top:30%;
      }
      #uimg{
        position: absolute;
        width: 30px;
        height: 30px;
        top:32%;
        left:20%;
        transform: translate(-50%,-50%) scale(1.4);
        color: rgb(100, 96, 96);
      }
      #p{
        top:43%;
      }
      #pimg{
        position: absolute;
        width: 30px;
        height: 30px;
        top:45%;
        left:20%;
        color: rgb(100, 96, 96);
        transform: translate(-50%,-50%) scale(1.4);
      }
      #sbtn{
        width: 70%;
        height: 40px;
        line-height: 40px;
        background: rgba(132, 182, 82, 0.952);
        color: white;
        position: absolute;
        top: 60%;
        left: 50%;
        transform: translate(-50%,-50%);
        border-radius: 25px;
        border: none;
        cursor: pointer;
      }
    </style>
</head>
<body>
  <div id="main">
  <div id="container">
    <div id="left">
      <img id="limg" src="https://www.pngkit.com/png/detail/263-2636288_admin-premiumcare-female-administrator-icon.png">
    </div>
    <div id="right">
    <form method = "post" action="ValidateAdmin">
      <from id="lform">
        <h1>ADMIN LOGIN</h1>
        
        <input id="u" type="text" placeholder="Username" name = "uname">
        <i class="fa fa-user-circle" id="uimg"></i>
        <input id="p" type="password" placeholder="Password" name = "password">
        <i class="fa fa-lock" id="pimg"></i>
        <button id="sbtn">LOGIN</button>
        </form>
      </from>
    </div>
  </div>
</div>
</body>
</html>