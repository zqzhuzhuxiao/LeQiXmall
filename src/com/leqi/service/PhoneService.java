package com.leqi.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.leqi.dao.PhoneDao;
import com.leqi.dao.impl.PhoneDaoImpl;
import com.leqi.pojo.PageBean;
import com.leqi.pojo.Phone;

import javafx.scene.chart.PieChart.Data;

public class PhoneService extends HttpServlet{
	private PhoneDao pdao=new PhoneDaoImpl();
	
	
	private int rowsPerPage;
//读取rowsPerPage错误  空值
	@Override
	public void init(ServletConfig config) throws ServletException {
		//servletconfig用于读取初始化参数
		rowsPerPage=config.getInitParameter("rowsPerPage")==null?3:Integer.valueOf(config.getInitParameter("rowsPerPage"));
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		String action=req.getParameter("action");
		if("newtj".equals(action)) 
			this.newPhone(req, resp);
		else if ("hotPhone".equals(action)) {
			this.hotPhone(req, resp);
		}
		else if ("rqPhone".equals(action)) {
			this.rqPhone(req, resp);
		}
		else if ("thPhone".equals(action)) {
			this.thPhone(req, resp);
		}
		else if ("one".equals(action)) {
			this.selectOne(req, resp);
		}
		else if("allbypage".equals(action)){
			this.allByPage(req, resp);
		}
		else if("update".equals(action)) {
			this.update(req, resp);
		}
		else if ("updatephone".equals(action)) {
			this.updatePhone(req, resp);
		}
		else if ("delete".equals(action)) {
			this.deletePhone(req, resp);
		}
		else if ("addPhone".equals(action)) {
			this.addPhone(req, resp);
		}
		
		
		/* this.hotPhone(req, resp); */
	}
	
	//后台增加手机
	private void addPhone(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String rulprice=req.getParameter("rulprice");
		String branda=req.getParameter("branda");
		String pic=req.getParameter("pic");
		String version=req.getParameter("version");
	// 	String publishTime=req.getParameter("publishTime");
		String color=req.getParameter("color");
		String sale=req.getParameter("sale");
		String info1=req.getParameter("info1");
		String info2=req.getParameter("info2");
		String info3=req.getParameter("info3");
		String info4=req.getParameter("info4");
		String tid=req.getParameter("id");//aaa
		String pic1=req.getParameter("pic1");
		String pic2=req.getParameter("pic2");
		String pic3=req.getParameter("pic3");
		String pic4=req.getParameter("pic4");
		
		Phone phone=new Phone();
		phone.setBname(name);
		phone.setPrice(Float.valueOf(price));
		phone.setRulprice(rulprice.trim().length()>0?Float.valueOf(rulprice):0);
		phone.setBranda(branda);
		phone.setPic(pic);
		phone.setVersion(version);
	//	phone.setPublishTime(publishTime);
		phone.setColor(color);
		phone.setSale(Integer.valueOf(sale));
		phone.setInfo1(Integer.valueOf(info1));
		phone.setInfo2(Integer.valueOf(info2));
		phone.setInfo3(Integer.valueOf(info3));
		phone.setInfo4(Integer.valueOf(info4));
		phone.setTid(Integer.valueOf(tid));
		phone.setPic1(pic1);
		phone.setPic2(pic2);
		phone.setPic3(pic3);
		phone.setPic4(pic4);
		
		int res=pdao.addPhone(phone);
		if(res==1) {
			this.allByPage(req, resp);
		}
		
	}	
	//后台删除手机
	private void deletePhone(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		String ids=req.getParameter("bid");

		int res=pdao.delete(Integer.valueOf(ids));
		if(res==1) {
			this.allByPage(req, resp);
		}
	}	
	
	private void updatePhone(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		//修改手机
		//update books set bname=?,price=?,
		//rulprice=?,branda=?,pic=?,versiona=?,
		//publishTime=?,color=?,sale=?,info1=?,
		//info2=?,info3=?,info4=?
		String ids=req.getParameter("id");
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String rulprice=req.getParameter("rulprice");
		String branda=req.getParameter("branda");
		String pic=req.getParameter("pic");
		String version=req.getParameter("version");
	//	String publishTime=req.getParameter("publishTime");
		String color=req.getParameter("color");
		String sale=req.getParameter("sale");
		String info1=req.getParameter("info1");
		String info2=req.getParameter("info2");
		String info3=req.getParameter("info3");
		String info4=req.getParameter("info4");
		
		Phone phone=new Phone();
		phone.setBid(Integer.valueOf(ids));
		phone.setBname(name);
		phone.setPrice(Float.valueOf(price));
		phone.setRulprice(Float.valueOf(rulprice));
		phone.setBranda(branda);
		phone.setPic(pic);
		phone.setVersion(version);
	//	phone.setPublishTime(publishTime);
		phone.setColor(color);
		phone.setSale(Integer.valueOf(sale));
		phone.setInfo1(Integer.valueOf(info1));
		phone.setInfo2(Integer.valueOf(info2));
		phone.setInfo3(Integer.valueOf(info3));
		phone.setInfo4(Integer.valueOf(info4));
		
		
		int res=pdao.update(phone);
		if(res==1) {
			this.allByPage(req, resp);
		}
		
		
	}	
	
	//获取到需要修改的一个手机的id
	private void update(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		String bids=req.getParameter("bid");
		Phone phone = pdao.selectOnePhone(Integer.valueOf(bids));
		req.setAttribute("phone",phone);
		req.getRequestDispatcher("admin/phone_update.jsp").forward(req, resp);
	}

	//新品推荐
	private void newPhone(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		//业务
		List<Phone> list=pdao.sltAllNewPhone("select * from phone order by publishTime desc limit 0,5");
		Gson g=new Gson();
		String res=g.toJson(list);
		PrintWriter ps=resp.getWriter();
		ps.write(res);
		ps.flush();
	}
	
	//热卖推荐
	
	  private void hotPhone(HttpServletRequest req,HttpServletResponse resp) throws IOException{ 
		  //业务 
		  List<Phone> list=pdao.sltAllNewPhone("select * from phone order by sale desc  limit 0,5"); 
		  Gson g=new Gson(); 
		  String res=g.toJson(list); 
		  PrintWriter ps=resp.getWriter();
		  ps.write(res);
		  ps.flush();
	  
	  }
	 
	//人气推荐
		
	  private void rqPhone(HttpServletRequest req,HttpServletResponse resp) throws IOException{ 
		  //业务 
		  List<Phone> list=pdao.sltAllNewPhone("select * from phone order by info2  desc  limit 0,5"); 
		  Gson g=new Gson(); 
		  String res=g.toJson(list); 
		  PrintWriter ps=resp.getWriter();
		  ps.write(res);
		  ps.flush();
	  
	  }  
	
	//限时特惠
		
	  private void thPhone(HttpServletRequest req,HttpServletResponse resp) throws IOException{ 
		  //业务 
		  List<Phone> list=pdao.sltAllNewPhone("select * from phone where info4=1 order by bid limit 0,5"); 
		  Gson g=new Gson(); 
		  String res=g.toJson(list); 
		  PrintWriter ps=resp.getWriter();
		  ps.write(res);
		  ps.flush();
	  
	  }  
	  
	  
	  
	  	//查询一个手机
		private void selectOne(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
			//查询一个手机的方法，，去接口创
			String bid=req.getParameter("bid");
			Phone phone=pdao.selectOnePhone(Integer.valueOf(bid));
			req.setAttribute("phone", phone);
			req.getRequestDispatcher("show.jsp").forward(req, resp);
		}
		
		//分页查询
		private void allByPage(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException, ServletException {
			//limit (当前页-1)*首页行数。首页行数
			//当前页，这个参数应该从页面传递过来（如果没有带参，则默认是第一页，否则按带的参数进行）
			String pages=arg0.getParameter("page");
			int page=pages!=null?Integer.valueOf(pages):1;
			//取数据，通过dao层中方法获得数据
			List<Phone> list=pdao.selectByPage(page, rowsPerPage);
			//将上步的数据存放在域对象request
			arg0.setAttribute("list",list);
			//分页请求参数
			//当前页/总页数/总行数/每页行数
			PageBean pb=new PageBean();
			pb.setPages(page);
			pb.setRowsPerPage(rowsPerPage);
			pb.setRowsNum(pdao.getAllRows());
			arg0.setAttribute("pb", pb);
			//请求转发到页面
			arg0.getRequestDispatcher("admin/Phone_admin.jsp").forward(arg0, arg1);;
		}		

}
