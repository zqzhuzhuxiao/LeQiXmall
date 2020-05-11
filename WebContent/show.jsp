
<%@page import="com.leqi.pojo.Phone"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品详情</title>
<link type="text/css" rel="stylesheet" href="static/css/index.css">
<link type="text/css" rel="stylesheet" href="static/css/show.css">
</head>
<body>
	<script type="text/javascript" src="static/js/show.js"></script>
	
	<div id="xiangqing">
	 <%@include file="header.jsp" %>
	<div id="xq">
		<%
	  Phone phone = (Phone) request.getAttribute("phone");
	%>		
		<div id="xiangq">
				
			<div class="tuzhan">
			 	<!--大图-->
			    <div id="top"><img id="img01" src="<%=phone.getPic() %>" /></div>
			    <!--小图-->
			    <div id="foot">
			        <div class="foot1"><img src="<%=phone.getPic1() %>" /></div>
			        <div class="foot1"><img src="<%=phone.getPic2() %>" /></div>
			        <div class="foot1"><img src="<%=phone.getPic3() %>" /></div>
			        <div class="foota"><img src="<%=phone.getPic4() %>" /></div>
			    </div>
			</div>
			<div class="data">
				<span style="display: none" class="phonea"><%=phone.getBid() %></span>
				<div class="name1"  ><span class="phonea"><%=phone.getBname() %></span></div>
				<div class="jieshao1"><span class="jieshao1_font">①赠价值99元精美专属保护壳（颜色可选） ② 晒单赢耳唛礼包。 即日起，乐奇购物商城购买可享尊享金卡专属服务权益</span> <span>金卡专属服务权益包含：①保修期内（不含延保）可享2次免费保养②1小时快修服务③金卡专属热线服务</span></div>
				<div class="price1"><span class="price1_a" >价格: </span><span class="price1_b" > &yen;<span  class="phonea"><%=phone.getPrice() %></span></span></div>
				<div class="color1">
					<span class="color1_a">颜色</span>
					<div id="color1">
						<img class="phonea" src="<%=phone.getPic() %>" />
						<div id="fonta">
						<span class="color1_font"><%=phone.getColor() %></span>
						</div>
					</div>
				</div>
				<div class="versiona">
					<span class="font_a">版本</span>
					<div id="fonta_b"><span class="font_a"><%=phone.getVersion() %></span></div>
				</div>
				<div class="versiona">
					<span class="font_a">上市时间</span>
					<div id="fonta_b"><span class="font_a"><%=phone.getPublishTime() %></span></div>
				</div>
				<div class="versiona">
					<span class="font_a">累计销量</span>
					<div id="fonta_b"><span class="font_a"><%=phone.getSale() %></span></div>
				</div>
				<div class="versiona">
					<span class="font_a">评分</span>
					<div id="fonta_b"><span class="font_a"><%=phone.getInfo3() %>(按千分算)</span></div>
				</div>
				
				<div class="gouwc">
					<div class="jiajian"></div>
					<div ><button id="btn1" class="addgwc" style="border: none;"><span class="addgwc_font">加入购物车</span></button></div>
					<div ><button id="btn2" class="addgwc a" style="border: none;"><span class="addgwc_font">立即购买</span></button></div>
				</div>
			</div>
			
		</div>
	</div>
		 
</div>
</body>
	<%@include file="foot.jsp" %>
</html>