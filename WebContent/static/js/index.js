//获取对象
window.onload=function(){
    lbt=document.getElementById("lbt");
    items=document.getElementsByClassName("items");//数组
    circle=document.getElementsByClassName("circle");

    //⭕的相对定位
    // cbl=document.getElementById("cbl_1");
    // r=cbl.getBoundingClientRect();   //就可以获得相对位置的 top/bottom/left/right
    // lbt_circle=document.getElementById("lbt_circle");
    // lbt_circle.style.top=r.top+"px";
    // lbt_circle.style.left=r.left+"px";

    scroll_left=0;  //用来记录lbt对象的滚动距离
    //函数调用：直接调用  事件调用
    // 定时器调用
    A=setInterval("showLBT()",3000);
    
    
    
    
    pic=document.getElementsByClassName("meiri_right_bottom");

    
    
    mrjx=document.getElementById("meiri_right_top");
    tu=document.getElementsByClassName("meiri_right_bottom_tu");
    phone=document.getElementsByClassName("bottom_phone");
    price=document.getElementsByClassName("bottom_price");
    
    //新品推荐
    mrjx.children[0].onmouseover=function (){
    	//发送请求
    	var xhr=new XMLHttpRequest();
    	xhr.open("post","phone");   //打开连接
    	xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
    	xhr.send("action=newtj");  //发送数据，不发送任何参数
    	
    	xhr.onreadystatechange=function(){
    		if(xhr.readyState==4){
    			if(xhr.status==200){
    				var obj=eval("("+xhr.responseText+")");
    				for(var a in obj){
    					tu[a].children[0].src=obj[a].pic;
    					phone[a].innerHTML=obj[a].bname; //children[0].
    					price[a].innerHTML=obj[a].price;  //
    				}
    			}
    		}
    	}
    }
    
    //热卖
    mrjx.children[1].onmouseover=function (){
    	//发送请求
    	var xhr=new XMLHttpRequest();
    	xhr.open("post","phone");   //打开连接
    	xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
    	xhr.send("action=hotPhone");  //发送数据，不发送任何参数
    	
    	xhr.onreadystatechange=function(){
    		if(xhr.readyState==4){
    			if(xhr.status==200){
    				var obj=eval("("+xhr.responseText+")");
    				for(var a in obj){
    					tu[a].children[0].src=obj[a].pic;
    					phone[a].innerHTML=obj[a].bname; //children[0].
    					price[a].innerHTML=obj[a].price;  //
    				}
    			}
    		}
    	}
    }
    
    //人气推荐
    mrjx.children[2].onmouseover=function (){
    	//发送请求
    	var xhr=new XMLHttpRequest();
    	xhr.open("post","phone");   //打开连接
    	xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
    	xhr.send("action=rqPhone");  //发送数据，不发送任何参数
    	
    	xhr.onreadystatechange=function(){
    		if(xhr.readyState==4){
    			if(xhr.status==200){
    				var obj=eval("("+xhr.responseText+")");
    				for(var a in obj){
    					tu[a].children[0].src=obj[a].pic;
    					phone[a].innerHTML=obj[a].bname; //children[0].
    					price[a].innerHTML=obj[a].price;  //
    				}
    			}
    		}
    	}
    }
    
  //人气推荐
    mrjx.children[3].onmouseover=function (){
    	//发送请求
    	var xhr=new XMLHttpRequest();
    	xhr.open("post","phone");   //打开连接
    	xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
    	xhr.send("action=thPhone");  //发送数据，不发送任何参数
    	
    	xhr.onreadystatechange=function(){
    		if(xhr.readyState==4){
    			if(xhr.status==200){
    				var obj=eval("("+xhr.responseText+")");
    				for(var a in obj){
    					tu[a].children[0].src=obj[a].pic;
    					phone[a].innerHTML=obj[a].bname; //children[0].
    					price[a].innerHTML=obj[a].price;  //
    				}
    			}
    		}
    	}
    }
    
    
    
    
    
    
    
    
    
    
    cbl=document.getElementById("cbl_1");
    
    
    tu1=document.getElementsByClassName("tu");
    name=document.getElementsByClassName("name");
  //cbl 侧边蓝
    cbl.children[0].onmouseover=function(){
    	//发送请求
    	var aa=new XMLHttpRequest();
    	aa.open("post","cbl");   //打开连接
    	aa.setRequestHeader("content-type","application/x-www-form-urlencoded");
    	aa.send("action=huawei");  //发送数据，不发送任何参数
    	
    	aa.onreadystatechange=function(){
    		if(aa.readyState==4){
    			if(aa.status==200){
    				var obj=eval("("+aa.responseText+")");
    				for(var a in obj){
    					tu1[a].children[0].src=obj[a].pic;
    					name[a].innerHTML=obj[a].bname; //children[0].
    				}
    			}
    		}
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
}
//打开二级菜单
function showItems(x,y){
    if(x==1)
        items[y].style.display="block";
    else if(x==2)
        items[y].style.display="none";
}
//轮播图
function showLBT() {
    lbt.scrollLeft=scroll_left;
    //修改圆圈的背景色
    //0   1500   3000   4500  6000  7500
    //0    1      2      3      4     5   circle下标
    var xb=parseInt(scroll_left/1500);
    circle[xb].style.backgroundColor="#fbffff";
    //恢复颜色
    for (var i=0;i<circle.length;i++){
        if (i!=xb){
            circle[i].style.backgroundColor="#535757";
        }
    }
    scroll_left+=1500;  //0   1500   3000   4500  6000  7500
    if (scroll_left==9000){
        scroll_left=0;
    }
}

//停止定时器 并且将圆圈的颜色和所显示的图片顺序一致
function stopInLBT(x){
    //停止定时器
    clearInterval(A);
    //圆圈背景色
    circle[x-1].style.backgroundColor="#fbffff";
    for (var i=0; i<circle.length;i++){
        if (i!=x-1){
            circle[i].style.backgroundColor="#535757";
        }
    }
    //将滚动动条的值改为与圆圈顺序一致
    //0   1500   3000   4500  6000  7500
    //1      2      3      4     5
    scroll_left = (x-1) * 1500;
    showLBT();
}

