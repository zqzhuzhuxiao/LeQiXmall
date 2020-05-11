<%@page import="java.util.List"%>
<%@page import="com.leqi.pojo.Cart"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>购物车</title>
<link type="text/css" rel="stylesheet" href="static/css/index.css">
<link type="text/css" rel="stylesheet" href="static/css/show.css">
<style type="text/css">
#xiangqing{
	height: 1000px;
}
.kuang{
	width: 1200px;
	height: 40px;
	margin: auto;
	background-color: white;
	
	margin-top: 20px;
}

.bt{
	width: 200px;
	height: 40px;
	/* background-color: blue; */
	float:left;
	
	line-height: 40px;
	font-size:13px;
	color: #868686;
}
.bt input{
	margin-left: 35px;
}
.shangp{
	width: 500px;
	height: 40px;
	/* background-color: purple; */
	float:left;
	
	line-height: 40px;
	font-size:13px;
	color: #868686;
}
.xx{
	width: 125px;
	height: 40px;
/* 	background-color: purple; */
	float:left;
	
	line-height: 40px;
	font-size:13px;
	color: #868686;
	text-align: center;
}
.xinxi{
	width: 1200px;
	height: 200px;
	margin: auto;
	background-color: white;
	
	margin-top: 20px;
}
.sp{
	width: 1200px;
	height: 150px;
	margin: auto;
/* 	background-color: red; */
}
.xuan{
	width:50px;
	height: 150px;
	/* background-color: black; */
	
	float:left;
	margin-top: 25px;
}
.xuan input {
	margin-top: 65px;
	margin-left: 35px;
}
.pictu{
	width:150px;
	height: 150px;
/* 	background-color: purple; */
	float:left;
	margin-top: 25px;
}
.pictu img {
	width:150px;
	height: 150px;
}
.mingc{
	width: 500px;
	height: 150px;
	/* background-color: purple; */
	float:left;
	
	font-size:16px;
	margin-top: 25px;
}
.ab{
	width: 125px;
	height: 150px;
/* 	background-color: purple;  */
	float:left;
	
	margin-top: 25px; 
	text-align: center;
}


.kuangb{
	width: 1200px;
	height: 60px;
	margin: auto;
	background-color: white;
	
	margin-top: 20px;
}

.btb{
	width: 200px;
	height: 60px;
	/* background-color: blue; */
	float:left;
	
	line-height: 60px;
	font-size:13px;
	color: #868686;
}
.btb input{
	margin-left: 35px;
}
.jies{
	width: 200px;
	height: 60px;
	/* background-color: blue; */
	float:right;
	
} 
.jies button{
	width: 200px;
	height: 60px;
	background-color: red;
	
	line-height: 60px;
	font-size:20px;
	border:none;
}
.xqx{
	width: 200px;
	height: 60px;
	float:right;
	/* background-color: blue; */
}
.sum{
	width: 200px;
	height: 40px;
	float:top;
	margin-left: 70px;
}
.sum span{
	/* float: right; */
	font-size: 20px;
	line-height: 40px;
	
}
.sumsp{
	width: 200px;
	height: 20px;
	float:top;
	margin-left: 70px;
}
.sumsp span {
	font-size: 13px;
	/* float: right; */
	line-height: 20px;
	
}
</style>
</head>
<body>
	<div id="xiangqing">
 	<%@include file="header.jsp" %>
 		<!-- //表头 -->
 		<div class="kuang">
 			<div class="bt"><input type="checkbox" id="theadInp" /><span>全选</span></div>
 			<div class="shangp">商品</div>
 			<div class="xx">单价</div>
 			<div class="xx">数量</div>
 			<div class="xx">小计</div>
 			<div class="xx">操作</div>
 		</div>
 			<%
 			List<Cart> clist=(List)session.getAttribute("clist");
			for (Cart cart : clist) {
 			%>
 		<div class="xinxi">
	 			<div class="xuan"><input type="checkbox" id="theadInp" /></div>
	 			<div class="pictu"><img src="<%=cart.getPic() %>"></div>
	 			<div class="mingc"><span><%=cart.getBname() %></span></div>
	 			<div class="ab"><span>&yen:<%=cart.getPrice() %>元</span></div>
	 			<div class="ab"><span><%=cart.getNum() %></span></div>
	 			<div class="ab"><span>&yen:<%=(cart.getNum()*cart.getPrice()) %></span></div>
	 			<div class="ab"><span>删除</span></div>
 		</div>
 			<%
				}
 			%>
 		<div class="kuangb">
 			<div class="btb"><input type="checkbox" id="theadInp" /><span>全选 </span><span> 删除</span></div>
 			<div class="jies"><button>立即结算</button></div>
 			<div class="xqx">
 				<div class="sum"><span>总计：<span style="color: red"> ¥  0.00</span></span></div>
 				<div class="sumsp"><span>已选择 <span style="color: red">0</span> 件商品</span></div>
 			</div>
 		</div>
 	</div>
</body>
	<%@include file="foot.jsp" %>
</html>