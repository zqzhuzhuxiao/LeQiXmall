<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册</title>
<link type="text/css" rel="stylesheet" href="static/css/index.css">
<link type="text/css" rel="stylesheet" href="static/css/regist.css">
</head>
<body>
<script type="text/javascript" src="static/js/regist.js"></script>
	<div id="alla">
		<div class="login">
				<div class="logo"><img src="static/img/logo.jpg" ></div>
				<div class="logoa">注册乐奇账号</div>
		   	<form onsubmit="return ff();" action="user" method="post" >
		   	<input type="hidden" name="action" value="reg"/>
				<div class="user"><input class="line1" name="usrname" type="text" placeholder="用户名"></div ><div class="erro_font"><span class="erro"></span></div>
				<div class="pass"><input class="line1" name="usrpass" type="password" placeholder="密码"></div><div class="erro_font"><span class="erro"></span></div>
				<div class="pass"><input class="line1" name="usrpassb" type="password" placeholder="确认密码"></div><div class="erro_font"><span class="erro"></span></div>
				<div ><input class="logina" id="but" type="submit" value="立即注册"></div>
			</form>
		</div>
	</div>
</body>
<%@include file="foot.jsp" %>
</html>