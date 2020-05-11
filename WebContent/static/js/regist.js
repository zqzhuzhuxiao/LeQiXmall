window.onload=function(){
	ip=document.getElementsByClassName("line1");
	erro=document.getElementsByClassName("erro");
	bt=document.getElementById("but");
	
}

function ff(){
	//正则表达式
	var reg = /^[a-zA-Z]{6,20}$/;
	if(!reg.test(ip[0].value)){
		erro[0].innerHTML="用户名输入有误，需由6-20个字母组成"
			return false;
	}
	reg = /^\d{6}$/;
	if(!reg.test(ip[1].value)){
		erro[1].innerHTML="密码输入有误，需由6个数字组成"
			return false;
	}
	if((ip[2].value)!=(ip[1].value)){
		erro[2].innerHTML="两次密码输入不一致！"
			return false;
	}
	return true;
}