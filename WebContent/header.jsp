<%@page import="com.leqi.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

	<!--首栏-->
        <div id="shoulan">
            <div id="BDS" class="font_bds">
                <div id="BDS_1"><a href="catalog"><span >乐奇首页</span></a> </div>
                <div id="BDS_2"><span > 陕西</span></div>
                <div id="BDS_r"></div>
            </div>
            <div id="BDS_right">
               <div class="BDS_right_1 font_bds"><span ><a href="login.jsp" id="font_BDS">请登录</a> </span><span ><a href="regist.jsp" > 免费注册</a></span></div>
               <div class="BDS_right_1 font_bds"><span><a href="user?action=logout" >注销</a></span><span> 我的订单</span></div>
               <div class="BDS_right_1 font_bds"><span>我的乐奇</span></div>
               <div class="BDS_right_1 font_bds"><span>乐奇会员</span></div>
               <div class="BDS_right_1 font_bds"><span>企业采购</span></div>
               <div class="BDS_right_1 font_bds"><span>客户服务</span></div>
               <div class="BDS_right_1 font_bds"><span>网站导航</span></div>
              
               <div class="BDS_right_1 font_bds"><span><a id="gwc" href="">购物车<span id="cartnum"><%=session.getAttribute("num")==null?0:session.getAttribute("num") %></span>件商品</a></span></div>
               <script type="text/javascript">
               		gwc=document.getElementById("gwc");
               		gwc.onclick=function(){
               			//action=show&uid=
               			var xhr=new XMLHttpRequest();
               			xhr.open("post","cart");
               			xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
               			xhr.send("action=show");
               			xhr.onreadystatechange=function(){
               				if(xhr.readyState==4){
               					if(xhr.status==200){
               						alert(xhr.responseText)
               						var obj=eval("("+xhr.responseText+")");
               						if(obj.data=="faild"){
               							location.href="login.jsp";
               						}else{
               							location.href="cart.jsp";
               						}
               					}
               				}
               			}
               			return false;
               		}
               </script>
            </div>
        </div>
        <!--logo,关键词以及搜索框-->
        <div id="line2">
            <div id="line2 a">
                <div id="logo"><a href="catalog"><img class="logo" src="static/img/logo.jpg" height="40" width="200"/></a></div>
                <div id="keyword">
                    <div class="squ"><span class="squ_font">华为专区</span></div>
                    <div class="squ squ1"><span class="squ_font">小米专区</span></div>
                    <div class="squ squ2"><span class="squ_font">苹果专区</span></div>
                    <div class="squ squ3"><span class="squ_font">三星专区</span></div>
                    <div class="squ squ4"><span class="squ_font">vivo专区</span></div>
                </div>
                
               <!--  <div class="items">2</div>
                <div class="items">3</div>
                <div class="items">4</div>
                <div class="items">5</div>
                <div class="items">6</div> -->
                <!--搜索框-->
                <div id="ss">
                    <div class="ss">
                        <input type="text">
                        <button id="logos"><img src="static/img/sslogo.jpg"/></button>
                    </div>
                </div>
            </div>
        </div>
        
        
        