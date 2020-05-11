<%@page import="com.leqi.pojo.Phone"%>
<%@page import="com.leqi.pojo.Type"%>
<%@page import="com.leqi.pojo.Brand"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
<link type="text/css" rel="stylesheet" href="static/css/index.css">
</head>
<body>
	<script type="text/javascript" src="static/js/index.js"></script>
	<!--整体-->
	<div id="whole">
		<%@include file="header.jsp"%>
		<!--二级子菜单-->

		<div class="items" onmouseover="showItems(1,0)"
						onmouseout="showItems(2,0)">
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="" /></div>
				<div class="name"></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="" /></div>
				<div class="name"></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="" /></div>
				<div class="name"></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
			<div class="items_a">
				<div class="tu"><img src="static/img/neirongzhanshi/xioami/xiaomi/HngmiNote7_2.jpg" /></div>
				<div class="name"><span class="">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB
							梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
			</div>
		</div>
		<div class="lbt" id="lbt">
			<div id="inner">
				<img src="static/img/lbt/dalbt_1.jpg" height="550" width="1500" /><img
					src="static/img/lbt/dalbt_2.jpg" height="550" width="1500" /><img
					src="static/img/lbt/dalbt_3.jpg" height="550" width="1500" /><img
					src="static/img/lbt/dalbt_4.jpg" height="550" width="1500" /><img
					src="static/img/lbt/dalbt_5.jpg" height="550" width="1500" /><img
					src="static/img/lbt/dalbt_6.jpg" height="550" width="1500" />
			</div>
			<div id="inner1">
				<img src="static/img/lbt/bg-slide.png" width="1500px" height="80px" />
			</div>
			<!--用户登陆-->
			<div id="inner1_down">
				<div id="user">
					<div id="userlogo">
						<img src="static/img/userlogo.jpg" height="54" width="54" />
					</div>
					<div id="userlogo_right">
						<div class="userlogo_right_top">
							<span class="font1">您好！请 </span><span class="font2"><a href="login.jsp" >登陆 </a></span><span
								class="font1">/</span><span class="font2"> <a href="regist.jsp" >注册</a><span> / <a href="user?action=logout" >注销</a></span> </span>
						</div>
						<div id="down_left">
							<span class="userlogo_font">新人福利</span>
						</div>
						<div id="down_right">
							<span class="userlogo_font usfont">会员频道</span>
						</div>
					</div>
				</div>
				<div id="huishou">
					<div class="huishou_1">
						<div class="huishou_1_top">
							<img src="static/img/tb/tubiao1.jpg" height="40" width="40" />
						</div>
						<div class="huishou_1_down">
							<span class="">企业购特惠</span>
						</div>
					</div>
					<div class="huishou_1">
						<div class="huishou_1_top">
							<img src="static/img/tb/tubiao2.jpg" height="40" width="40" />
						</div>
						<div class="huishou_1_down">会员领券</div>
					</div>
					<div class="huishou_1">
						<div class="huishou_1_top">
							<img src="static/img/tb/tubiao3.jpg" height="40" width="40" />
						</div>
						<div class="huishou_1_down">以旧换新</div>
					</div>
					<div class="huishou_1">
						<div class="huishou_1_top">
							<img src="static/img/tb/tubiao4.jpg" height="40" width="40" />
						</div>
						<div class="huishou_1_down">新品</div>
					</div>
					<div class="huishou_1">
						<div class="huishou_1_top">
							<img src="static/img/tb/tubiao5.jpg" height="40" width="40" />
						</div>
						<div class="huishou_1_down">乐奇数码</div>
					</div>
					<div class="huishou_1">
						<div class="huishou_1_top">
							<img src="static/img/tb/tubiao6.jpg" height="40" width="40" />
						</div>
						<div class="huishou_1_down">数码</div>
					</div>
				</div>
				<div id="shuxian"></div>
				<div id="userleft">
					<div class="gongao">
						<span>公告</span>
					</div>
					<div class="gongao_right">
						<br>
						<span>乐奇购物商城双十一营业额突破1亿</span><br>

					</div>
				</div>
			</div>
			<!--侧边栏二级侧边栏-->
			<div id="cbl">
				<%
					List<Brand> blist = (List<Brand>) request.getAttribute("blist");
					List<Type> tlist = (List<Type>) request.getAttribute("tlist");
					for (Brand b : blist) {
				%>
				<div id="cbl_1">
					<div class="menu" onmouseover="showItems(1,0)"
						onmouseout="showItems(2,0)">
						<span class="cbl_font"><%=b.getCname()%></span><br>
						<%
							for (Type t : tlist) {
									if (b.getCid() == t.getCid()) {
						%>
						<span class="cbl_down_font"><%=t.getTtype()%></span>
						<%
							}
								}
						%>
					</div>
				</div>
				<%
					}
				%>
			</div>
			<div id="lbt_circle">
				<div class="circle" onmouseover="stopInLBT(1)"
					onmouseout="A=setInterval('showLBT()',3000)"></div>
				<div class="circle" onmouseover="stopInLBT(2)"
					onmouseout="A=setInterval('showLBT()',3000)"></div>
				<div class="circle" onmouseover="stopInLBT(3)"
					onmouseout="A=setInterval('showLBT()',3000)"></div>
				<div class="circle" onmouseover="stopInLBT(4)"
					onmouseout="A=setInterval('showLBT()',3000)"></div>
				<div class="circle" onmouseover="stopInLBT(5)"
					onmouseout="A=setInterval('showLBT()',3000)"></div>
				<div class="circle" onmouseover="stopInLBT(6)"
					onmouseout="A=setInterval('showLBT()',3000)"></div>
			</div>
		</div>
		<div id="meiri">
			<div id="meiri_logo">
				<img src="static/img/meirijingxuan.jpg" height="230" width="200" />
			</div>
			<div id="meiri_right">
				<div id="meiri_right_top">
					<div class="meiri_right_t">
						<span>新品推荐</span>
					</div>
					<div class="meiri_right_t">
						<span>热卖推荐</span>
					</div>
					<div class="meiri_right_t">
						<span>人气推荐</span>
					</div>
					<div class="meiri_right_t">
						<span>限时特惠</span>
					</div>
					<div class="meiri_right_t t5">
						<span>移动电源</span>
					</div>
				</div>
				<div class="meiri_right_bottom">
					<a href="show.jsp"><div class="meiri_right_bottom_tu"><img src="static/img/meirijingxuan/xiaomi hongmi Redmi Note7 huancaijianbian.jpg" /></div>
					<div class="bottom_phone"><span class="meiri_font">小米 红米Redmi Note7 幻彩渐变AI双摄 4GB+64GB 梦幻蓝 全网通4G 双卡双待 水滴全面屏拍照游戏智能手机</span></div>
					<div class="bottom_price"><span class="price_font">&yen;1199.00</span></div></a>
				</div>
				<div class="meiri_right_bottom">
					<div class="meiri_right_bottom_tu"><img src="static/img/neirongzhanshi/huawei/rongyao/rongyaoV20_1.png"></div>
					<div class="bottom_phone"> 荣耀V20 麒麟980 魅眼全视屏 4800万AI超清摄影 标配版</div>
					<div class="bottom_price">&yen;2099.00</div>
				</div>
				<div class="meiri_right_bottom">
					<div class="meiri_right_bottom_tu"><img src="static/img/neirongzhanshi/qita/Reno_1.jpg"></div>
					<div class="bottom_phone">Reno 6G+256G 珊瑚橙 【直降200 | 到手2799 | 限时12期免息 | 赠屏碎保】全景屏，4800万超清像素、支持NFC、VOOC 3.0。</div>
					<div class="bottom_price">&yen;2799.00</div>
				</div>
				<div class="meiri_right_bottom">
					<div class="meiri_right_bottom_tu"><img src="static/img/neirongzhanshi/qita/jianguoR1_1.jpg"></div>
					<div class="bottom_phone">锤子（smartisan） 坚果 R1 6G+128GB 碳黑色 全面屏双摄 全网通4G手机 双卡双待 游戏手机</div>
					<div class="bottom_price">&yen;2599.00</div>
				</div>
				<div class="meiri_right_bottom">
					<div class="meiri_right_bottom_tu"><img src="static/img/neirongzhanshi/apple/MacbookAir13.3_1.jpg"></div>
					<div class="bottom_phone"> Apple Macbook Air 13.3 | Core i5 8G 128G SSD 苹果笔记本电脑 轻薄本 银色 MQD32CH/A </div>
					<div class="bottom_price">&yen;5799.00</div>
				</div>
			</div>
		</div>
		<!--秒杀-->
		<div id="miaosha">
			<div id="miaosha_lieft">
				<img src="static/img/miaoshao/miaoshalogo.jpg" />
			</div>
			<div id="miaosha_right">
				<img src="static/img/miaoshao/test.jpg" />
			</div>
		</div>
		<!--=======================================================================-->
		<div class="phone">

			<!--========================华为=================================-->
			<div class="jiange">
				<img src="static/img/shoujijiange/huaweigeli.jpg" />
			</div>
			<div class="brand">
				<div class="brand_top">
					<div class="top_left_font">
						<span>华为</span>
					</div>
					<div class="top_right_font">
						<span>查看更多</span>
					</div>
				</div>
				<div class="brand_bottom">
					<div class="bottom_left">
						<img src="static/img/neirongzhanshi/huawei/left.jpg" />
					</div>
					<div class="bottom_right">
						<!--  <div class="bottom_right_top"> -->
						<%
							List<Phone> plist = (List<Phone>) request.getAttribute("plist"); //list
							for (Phone phone : plist) {
						%>
						<div class="bottom_right_phone">
							<a href="phone?action=one&bid=<%=phone.getBid() %>"><div class="phone_img">
								<img src="<%=phone.getPic()%>" />
							</div>
							<div class="phone_version">
								<span><%=phone.getVersion()%></span>
							</div>
							<div class="phone_name">
								<span class="meiri_font"><%=phone.getBname()%></span>
							</div>
							<div class="phone_price">
								<span class="price_font">&yen;<%=phone.getPrice()%></span>
							</div></a>
						</div>
						<%
							}
						%>
					</div>
				</div>
			</div>

			<!--========================小米=================================-->
			<div class="jiange">
				<img src="static/img/shoujijiange/xiaomi.jpg" />
			</div>
			<div class="brand">
				<div class="brand_top">
					<div class="top_left_font">
						<span>小米</span>
					</div>
					<div class="top_right_font">
						<span>查看更多</span>
					</div>
				</div>
				<div class="brand_bottom">
					<div class="bottom_left">
						<img src="static/img/neirongzhanshi/xioami/left.jpg" />
					</div>
					<div class="bottom_right">
						<%
							List<Phone> xmlist = (List<Phone>) request.getAttribute("xmlist"); //list
							for (Phone phone : xmlist) {
						%>
						<div class="bottom_right_phone">
							<a href="phone?action=one&bid=<%=phone.getBid() %>"><div class="phone_img">
								<img src="<%=phone.getPic()%>" />
							</div>
							<div class="phone_version">
								<span><%=phone.getVersion()%></span>
							</div>
							<div class="phone_name">
								<span class="meiri_font"><%=phone.getBname()%></span>
							</div>
							<div class="phone_price">
								<span class="price_font">&yen;<%=phone.getPrice()%></span>
							</div></a>
						</div>
						<%
							}
						%>
					</div>
				</div>
			</div>


			<!--========================苹果=================================-->
			<div class="jiange">
				<img src="static/img/shoujijiange/pingguo.jpg" />
			</div>
			<div class="brand">
				<div class="brand_top">
					<div class="top_left_font">
						<span>苹果</span>
					</div>
					<div class="top_right_font">
						<span>查看更多</span>
					</div>
				</div>
				<div class="brand_bottom">
					<div class="bottom_left">
						<img src="static/img/neirongzhanshi/appleleft.jpg" />
					</div>
					<div class="bottom_right">
						<%
							List<Phone> aplist = (List<Phone>) request.getAttribute("aplist"); //list
							for (Phone phone : aplist) {
						%>
						<div class="bottom_right_phone">
							<a href="phone?action=one&bid=<%=phone.getBid() %>"><div class="phone_img">
								<img src="<%=phone.getPic()%>" />
							</div>
							<div class="phone_version">
								<span><%=phone.getVersion()%></span>
							</div>
							<div class="phone_name">
								<span class="meiri_font"><%=phone.getBname()%></span>
							</div>
							<div class="phone_price">
								<span class="price_font">&yen;<%=phone.getPrice()%></span>
							</div></a>
						</div>
						<%
							}
						%>
					</div>
				</div>
			</div>


			<!--========================三星=================================-->
			<div class="jiange">
				<img src="static/img/shoujijiange/sanxing.jpg" />
			</div>
			<div class="brand">
				<div class="brand_top">
					<div class="top_left_font">
						<span>三星</span>
					</div>
					<div class="top_right_font">
						<span>查看更多</span>
					</div>
				</div>
				<div class="brand_bottom">
					<div class="bottom_left">
						<img src="static/img/neirongzhanshi/sanxingleft.jpg" />
					</div>
					<div class="bottom_right">
						<%
							List<Phone> sxlist = (List<Phone>) request.getAttribute("sxlist"); //list
							for (Phone phone : sxlist) {
						%>
						<div class="bottom_right_phone">
							<a href="phone?action=one&bid=<%=phone.getBid() %>"><div class="phone_img">
								<img src="<%=phone.getPic()%>" />
							</div>
							<div class="phone_version">
								<span><%=phone.getVersion()%></span>
							</div>
							<div class="phone_name">
								<span class="meiri_font"><%=phone.getBname()%></span>
							</div>
							<div class="phone_price">
								<span class="price_font">&yen;<%=phone.getPrice()%></span>
							</div></a>
						</div>
						<%
							}
						%>
					</div>
				</div>
			</div>



			<!--========================vivo=================================-->
			<div class="jiange">
				<img src="static/img/shoujijiange/vivo.jpg" />
			</div>
			<div class="brand">
				<div class="brand_top">
					<div class="top_left_font">
						<span>vivo</span>
					</div>
					<div class="top_right_font">
						<span>查看更多</span>
					</div>
				</div>
				<div class="brand_bottom">
					<div class="bottom_left">
						<img src="static/img/neirongzhanshi/vivoleft.jpg" />
					</div>
					<div class="bottom_right">
						<%
							List<Phone> vvlist = (List<Phone>) request.getAttribute("vvlist"); //list
							for (Phone phone : vvlist) {
						%>
						<div class="bottom_right_phone">
							<a href="phone?action=one&bid=<%=phone.getBid() %>"><div class="phone_img">
								<img src="<%=phone.getPic()%>" />
							</div>
							<div class="phone_version">
								<span><%=phone.getVersion()%></span>
							</div>
							<div class="phone_name">
								<span class="meiri_font"><%=phone.getBname()%></span>
							</div>
							<div class="phone_price">
								<span class="price_font">&yen;<%=phone.getPrice()%></span>
							</div></a>
						</div>
						<%
							}
						%>
					</div>
				</div>
			</div>


			<!--========================其他=================================-->
			<div class="jiange">
				<img src="static/img/shoujijiange/oppo.jpg" />
			</div>
			<div class="brand">
				<div class="brand_top">
					<div class="top_left_font">
						<span>其他</span>
					</div>
					<div class="top_right_font">
						<span>查看更多</span>
					</div>
				</div>
				<div class="brand_bottom">
					<div class="bottom_left">
						<img src="static/img/neirongzhanshi/oppoleft.jpg" />
					</div>
					<div class="bottom_right">
						<%
							List<Phone> qtlist = (List<Phone>) request.getAttribute("qtlist"); //list
							for (Phone phone : qtlist) {
						%>
						<div class="bottom_right_phone">
							<a href="phone?action=one&bid=<%=phone.getBid() %>"><div class="phone_img">
								<img src="<%=phone.getPic()%>" />
							</div>
							<div class="phone_version">
								<span><%=phone.getVersion()%></span>
							</div>
							<div class="phone_name">
								<span class="meiri_font"><%=phone.getBname()%></span>
							</div>
							<div class="phone_price">
								<span class="price_font">&yen;<%=phone.getPrice()%></span>
							</div></a>
						</div>
						<%
							}
						%>
					</div>
				</div>
			</div>




		</div>
</body>
<%@include file="foot.jsp" %>
</html>