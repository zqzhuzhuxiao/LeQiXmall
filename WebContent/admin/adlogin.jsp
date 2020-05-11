<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
.zt{height: 700px;width: 1520px;}
.zt img{height: 700px;width: 1520px;}

</style>
</head>
<body>
<body>
	<style type="text/css">
.zt {
	height: 700px;
	width: 1520px;
}

.zt img {
	height: 700px;
	width: 1520px;
}

.login {
	height: 500px;
	width: 600px;
	/* background-color: rgba(0,0,0,0.0); */
	display: block;
	position: absolute;
	top:110px;
	left:440px;
	 border-radius: 13px;
	 
}
.i{
	width:400px;
	height:100px;
	margin-left:100px;
	margin-top:50px;
	font-size: 45px;
	color: white;
	line-height: 100px;
	text-align: center;
}
.love{
	width:400px;
	height:50px;
  	margin-left:100px;
	font-size: 25px;
	color: white;
	text-align: center;
}
.you{
	width: 450px;
	height: 50px;
	/* background-color: red; */
	margin: auto;
	margin-top: 20px;
}
.pass{
	width: 450px;
	height: 50px;
	/* background-color: red; */
	margin: auto;
	margin-top: 15px;
}
.you input{
	width: 448px;
	height: 50px;

}
.pass input{
	width: 448px;
	height: 50px;
}
.loginb{
	width: 450px;
	height: 30px;
/* 	background-color: #ff8000; */
	margin: auto;
	margin-top: 2px;
}
.loginb_left{
	width: 200px;
	height: 30px;
	float: left;
	/* background-color:red; */
	
	line-height: 30px;
	color: #ff8000 ;
}
.loginb_right{
	width: 150px;
	height: 30px;
	float: right;
	/* background-color:red; */
	
	line-height: 30px;
	color: #9e9e9e;
}
.logina{
	width: 450px;
	height: 48px;
	background-color: rgba(11,208,255,0.3);
	margin-left:75px;
	margin-top: 15px;
	
	text-align: center;
	font-size: 20px;	
	line-height: 50px;
	color: white;
}
</style>
</head>
<body>
	<form action="adlogin.jsp" method="post">
	<div class="zt">
		<img src="../static/admin/backgroud.jpg">
		<div class="login">
			<div class="i">欢迎使用乐奇服务</div>
			<div class="love">把你放在心中</div>
			<div class="you"><input style="background-color: transparent;border-radius: 20px;outline:none;" name="usrname" type="text" placeholder="邮箱/手机号码"><span class="erro"></span></div>
			<div class="pass"><input style="background-color: transparent;border-radius: 20px;outline:none;" name="usrpass" type="password" placeholder="密码"><span class="erro"></span></div>
			
			<div ><input  class="logina" type="submit" value="登陆"></div>
			<div class="loginb">
					<div class="loginb_left"><span>手机短信登陆</span><span>/注册</span></div>
					<div class="loginb_right"><span>立即注册 </span> | <span> 忘记密码</span></div>
			</div>
		</div>
	</div>
	</form>
</body>
</body>
</html>