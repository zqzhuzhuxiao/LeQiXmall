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
	<form action="phone" method="post">
		<input type="hidden" name="action" value="updatephone">
		商品编号；<input name="id" type="text" readonly="readonly" value="<%=phone.getBid() %>"><br>
		商品名称：<input name="name" type="text" value="<%=phone.getBname() %>"><br>
		单价：<input name="price" type="text" value="<%=phone.getPrice() %>"><br>
		优惠价：<input name="rulprice" type="text" value="<%=phone.getRulprice() %>"><br>
		品牌：<input name="branda" type="text" readonly="readonly" value="<%=phone.getBranda() %>"><br>
		手机图片：<input name="pic" type="text" value="<%=phone.getPic() %>"><br>
		版本：<input name="versiona" type="text" value="<%=phone.getVersion() %>"><br>
		上市时间：<input name="publishTime" type="text" value="<%=phone.getPublishTime() %>"><br>
		颜色：<input name="color" type="text" value="<%=phone.getColor() %>"><br>
		销量：<input name="sale" type="text" value="<%=phone.getSale() %>"><br>
		是否推荐0/1：<input name="info1" type="text" value="<%=phone.getInfo1() %>"><br>
		人气：<input name="info2" type="text" value="<%=phone.getInfo2() %>"><br>
		评分：<input name="info3" type="text" value="<%=phone.getInfo3() %>"><br>
		是否限时特惠0/1：<input name="info4" type="text" value="<%=phone.getInfo4() %>"><br>
		
		<input type="submit" value="确认修改">
	</form>
</body>
</html>