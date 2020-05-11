<%@page import="com.leqi.pojo.Phone"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
		<%
		Phone phone=(Phone) request.getAttribute("phone");
	    %>
	<form action="../phone?action=addPhone" method="post">
		<input type="hidden" name="action" value="addPhone">
		商品名称：<input name="name" type="text" value=""><br>
		单价：<input name="price" type="text" value=""><br>
		优惠价：<input name="rulprice" type="text" value=" "><br>
		品牌：<input name="branda" type="text" value=" "><br>
		手机图片：<input name="pic" type="text" value=""><br>
		版本：<input name="versiona" type="text" value=""><br>
		上市时间：<input name="publishTime" type="text" value=""><br>
		颜色：<input name="color" type="text" value=""><br>
		销量：<input name="sale" type="text" value=""><br>
		是否推荐0/1：<input name="info1" type="text" value=""><br>
		人气：<input name="info2" type="text" value=""><br>
		评分：<input name="info3" type="text" value=""><br>
		是否限时特惠0/1：<input name="info4" type="text" value=""><br>
		商品分类： <input name="id" type="text" value=""><br>
		
		详情小图1：<input name="pic1" type="text" value=""><br>
		详情小图2：<input name="pic2" type="text" value=""><br>
		详情小图3：<input name="pic3" type="text" value=""><br>
		详情小图4：<input name="pic4" type="text" value=""><br>
		<input type="submit" value="确认添加">
	</form>
</body>
</html>