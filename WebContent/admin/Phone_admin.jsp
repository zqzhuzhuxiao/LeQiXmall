<%@page import="com.leqi.pojo.PageBean"%>
<%@page import="com.leqi.pojo.Phone"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
#table {
	display: table;
	width: 1520px;
	border: 1px solid red;
}

.row {
	display: table-row;
	height: 50px;
	line-height: 50px;
	background-color: #FFD0B3;
}

.id {
	width: 40px;
	display: table-cell;
	border: 1px solid red;
	text-align: center;
}

.cols {
	display: table-cell;
	width: 100px;
	border: 1px solid red;
	text-align: center;
}
.name {
	display: table-cell;
	width: 100px;
	border: 1px solid red;
	
	font-size: 11px;
	text-align: center;
	
	
	word-wrap:break-word;
}

.rowa {
	display: table-row;
	height: 50px;
    
}

.ida {
	width: 40px;
	display: table-cell;
	border: 1px solid red;
	font-size: 11px;
	text-align: center;
	
	line-height: 20px; 
}

.colsa {
	display: table-cell;
	width: 100px;
	border: 1px solid red;
	font-size: 11px;
	text-align: center;
	
	line-height: 20px; 
}
.page{
	width: 1520px;
	height: 20px;
	text-align: center;
}
</style>
</head>
<body>
	<div id="table">
		<div class="row">
			<div class="id">编号</div>
			<div class="cols">手机名</div>
			<div class="cols">价格</div>
			<div class="cols">限时优惠</div>
			<div class="cols">品牌</div>
			<div class="cols">手机海报</div>
			<div class="cols">手机版本</div>
			<div class="cols">上市时间</div>
			<div class="cols">手机颜色</div>
			<div class="cols">销量</div>
			<div class="cols">是否推荐 1/0</div>
			<div class="cols">人气(千分制)</div>
			<div class="cols">评分(千分制)</div>
			<div class="cols">是否限时优惠</div>
			<div class="cols">操作</div>
		</div>
			
		<%
			PageBean pb=(PageBean) request.getAttribute("pb");
			List<Phone> list =(List<Phone>)request.getAttribute("list");
			for(Phone phone:list){
		%>
		<div class="rowa">
			<div class="ida"><%=phone.getBid() %></div>
			<div class="name"><%=phone.getBname() %></div>
			<div class="colsa"><%=phone.getPrice() %></div>
			<div class="colsa"><%=phone.getRulprice() %></div>
			<div class="colsa"><%=phone.getBranda() %></div>
			<div class="colsa"><img style="width: 150px;height: 150px;" src="<%=phone.getPic() %>"></div>
			<div class="colsa"><%=phone.getVersion() %></div>
			<div class="colsa"><%=phone.getPublishTime() %></div>
			<div class="colsa"><%=phone.getColor() %></div>
			<div class="colsa"><%=phone.getSale() %></div>
			<div class="colsa"><%=phone.getInfo1() %></div>
			<div class="colsa"><%=phone.getInfo2() %></div>
			<div class="colsa"><%=phone.getInfo3() %></div>
			<div class="colsa"><%=phone.getInfo4() %></div>
			<div class="colsa"> <a href="phone?action=delete&bid=<%=phone.getBid() %>"> 删除 </a> |  <a href="phone?action=update&bid=<%=phone.getBid() %>"> 修改 </a></div>
		</div>
		<%
			}
		%>
		</div>
			<div class="page"> 首页 上一页 <a href="http://localhost:8080/LeQiXmall/phone?action=allbypage&page=<%=pb.getPages()==pb.getPageNum()?pb.getPageNum():pb.getPages()+1 %>">下一页</a> 末页 当前页 / 共 页</div>
</body>
</html>