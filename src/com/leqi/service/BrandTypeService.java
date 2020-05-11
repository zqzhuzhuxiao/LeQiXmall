package com.leqi.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leqi.dao.BrandDao;
import com.leqi.dao.PhoneDao;
import com.leqi.dao.TypeDao;
import com.leqi.dao.impl.BrandDaoImpl;
import com.leqi.dao.impl.PhoneDaoImpl;
import com.leqi.dao.impl.TypeDaoImpl;
import com.leqi.pojo.Brand;
import com.leqi.pojo.Phone;
import com.leqi.pojo.Type;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class BrandTypeService extends HttpServlet{
	private BrandDao bdao=new BrandDaoImpl();
	private TypeDao tdao=new TypeDaoImpl();
	private PhoneDao pdao=new PhoneDaoImpl();
	
	
	//表单method="get"
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget----");
	}
	
	
	//表单method="post"
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost------");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//从servlet开始
		List<Brand> blist=bdao.selectAllBrand();		//一级菜单
		List<Type> tlist=tdao.selectAlType();			//二级菜单
		
		List<Phone> plist=pdao.sltAllNexHuaWei();    	//页面华为分类展示8个查询
		List<Phone> xmlist=pdao.sltAllNexXiaoMi();    	//页面小米分类展示8个查询
		List<Phone> aplist=pdao.sltAllNexApple();    	//页面苹果分类展示8个查询
		List<Phone> sxlist=pdao.sltAllNexsanxing();    	//页面三星分类展示8个查询
		List<Phone> vvlist=pdao.sltAllNexvivo();    	//页面vivo分类展示8个查询
		List<Phone> qtlist=pdao.sltAllNexqita();    	//页面vivo分类展示8个查询
		//index.jsp出口
		//HttpServletRequest---request   |   HttpServletResponse ---  response 
		//request  /   response
		  //request.getParameter
		  //request.sendRedirevt

		//域对象。request请求域
		 req.setAttribute("blist",blist);
		 req.setAttribute("tlist",tlist);
		 req.setAttribute("plist",plist);
		 req.setAttribute("xmlist",xmlist); 	//页面小米分类展示8个查询
		 req.setAttribute("aplist",aplist); 	//苹果apple分类展示8个查询
		 req.setAttribute("sxlist",sxlist); 	//苹果三星分类展示8个查询
		 req.setAttribute("vvlist",vvlist); 	//苹果vivo分类展示8个查询
		 req.setAttribute("qtlist",qtlist); 	//苹果vivo分类展示8个查询
		 
		 req.getRequestDispatcher("index.jsp").forward(req, resp);
		 
	}
		
}
