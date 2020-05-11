<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
<link type="text/css" rel="stylesheet" href="static/css/index.css">
<link type="text/css" rel="stylesheet" href="static/css/login.css">
</head>
<body >
	<div id="alla">
		<div class="login">
		   	<form action="user" method="post">
		   	<input type="hidden" name="action" value="login"/>
				<div class="logo"><img src="static/img/logo.jpg" ></div>
				<div class="logoa">乐奇账号登陆</div>
				<div class="user"><input class="ip" name="usrname" type="text" placeholder="邮箱/手机号码"><span class="erro"></span></div>
				<div class="pass"><input class="ip" name="usrpass" type="password" placeholder="密码"><span class="erro"></span></div>
				<div class="passa"><input name="usrcode" type="text" placeholder="验证码"><span class="erro"></span><a href="" onclick="return f()"><button class="shuaxin">刷新</button></a><img class="passa_right" src="pic" id="pic"></div>
				<div ><input class="logina" type="submit" value="登陆"></div>
				<input type="checkbox" name="rememberme" class="remb" value="yes">记住密码
				<span class="err_msg"><%=request.getAttribute("err")!=null?request.getAttribute("err"):""%></span>
			</form>
			<script type="text/javascript">
					pic=document.getElementById("pic");
					ip=document.getElementsByClassName("ip");
					//根据IP[0]的内容改变事件发起异步请求，根据ip[0]的内容在cookie中查找它对应的密码值
					//并且将这个找到的密码填入到ip[1]的内容中
					 ip[0].onchange=function(){
						var xhr=new XMLHttpRequest();
						xhr.open("post","user");
						xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
						xhr.send("action=remenberme&usrname="+ip[0].value);
						
						xhr.onreadystatechange=function(){
							if(xhr.readyState==4){
								if(xhr.status==200){
									ip[1].value=xhr.responseText;
								}
							}
						}
						
					} 
				function f(){
					pic.src="pic?m=1"+Math.random();  //产生0--1之间的数
					return false;
				}
			</script>
				<div class="loginb">
					<div class="loginb_left"><span>手机短信登陆</span><span>/注册</span></div>
					<div class="loginb_right"><span><a href="regist.jsp" >立即注册 </a></span> | <span> 忘记密码</span></div>
				</div>
				<div class="qita">——————————其他方式登陆——————————</div>
				<div class="qitaimg"><img src="static/img/login/qita.png"></div>
		</div>
	</div>
</body>
 	<%@include file="foot.jsp" %>
</html>