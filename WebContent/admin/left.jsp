<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background-color: #534D53;
}
.all a{
	text-decoration:none;
	color: white;
}
.all{
	width: 100px;
	height: 30px;
	background-color: #534D53;
	margin-top: 10px;
	overflow: hidden;
	transition:height 1s ease;
	
	margin-left: 20px;
	color: white;
}

.a {
	width: 100px;
	height: 30px;
}

/* .all:hover {
	height: 90px;
} */

.all .b {
	margin-left: 10px;
	font-size: 12px;
}

</style>
</head>
<script type="text/javascript">
window.onload = function(){
a=document.getElementsByClassName("all");
	/* alert(a[0].children.length); */
	a[0].onclick=function(){
		a[0].style.height=5*30+"px";
	}
	a[1].onclick=function(){
		a[1].style.height=5*30+"px";
	}
	a[2].onclick=function(){
		a[2].style.height=3*30+"px";
	}
	a[3].onclick=function(){
		a[3].style.height=3*30+"px";
	}
}


</script>
<h2 style="color: white;">欢迎，XX 管理员</h2>


<div class="all">
	<div class="a">网站常规管理</div>
	<div class="a b">* 基本设置</div>
	<div class="a b">* 广告设置</div>
	<div class="a b">* 联系方式</div>
	<div class="a b">* 汇款方式</div>
</div>
<div class="all">
	<div class="a">用户管理</div>
	<div class="a b">* 会员管理</div>
	<div class="a b">* 留言管理</div>
	<div class="a b">* 订单管理</div>
	<div class="a b">* 评论管理</div>
</div>
<div class="all">
	<div class="a">商品数据管理</div>
	<div class="a b">* <a href="../admin/addphone.jsp" target="show">添加商品</a></div>
	<div class="a b">* <a href="../phone?action=allbypage" target="show">查看商品</a></div>
</div>
<div class="all">
	<div class="a">栏目分类管理</div>
	<div class="a b">* 商品分类</div>
	<div class="a b">* 商品类型</div>
</div>

</html>