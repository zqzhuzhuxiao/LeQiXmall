
window.onload = function(){
	btn1=document.getElementById("btn1");//加入购物车
	btn2=document.getElementById("btn2");//立即购买
	cartnum=document.getElementById("cartnum");//立即购买
	
	phone=document.getElementsByClassName("phonea");
	pic=document.getElementById("img01");
	
	//点击加入购物车
	btn1.onclick=function(){
		var xhr=new XMLHttpRequest();
		xhr.open("post","cart"); // cart?action=add&id=12&name=zkjbdjha&price=20
		xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
		var params="action=add&id="+phone[0].innerHTML+"&name="+phone[1].innerHTML+"&price="+phone[2].innerHTML+"&pic="+pic.src;
		xhr.send(params);
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4){
				if(xhr.status==200){
					alert(xhr.responseText);
					var obj=eval("("+xhr.responseText+")");
					if(obj.data=="success"){
						//数量加1
						cartnum.innerHTML=obj.num;
						alert("加入购物车成功");
					}else {
						alert("加入失败！！！");
						location.href="login.jsp";
					}
				}
			}
		}
	}
}
