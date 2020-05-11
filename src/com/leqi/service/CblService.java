package com.leqi.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.leqi.dao.PhoneDao;
import com.leqi.dao.impl.PhoneDaoImpl;
import com.leqi.pojo.Phone;

public class CblService extends HttpServlet{
	private PhoneDao pdao=new PhoneDaoImpl();
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		String action=req.getParameter("action");
		
		if ("huawei".equals(action)) {
			this.huawei(req, resp);
		}
	}
	
	
	 //侧边栏弹出框
	  //华为
	  private void huawei(HttpServletRequest req,HttpServletResponse resp) throws IOException{ 
		//业务 
		  List<Phone> list=pdao.sltAllNewPhone("select * from phone where branda='华为' limit 0,16"); 
		  Gson g=new Gson(); 
		  String res=g.toJson(list); 
		  PrintWriter ps=resp.getWriter();
		  ps.write(res);
		  ps.flush();
		  
	  }
	  
	
	
	
	
	
	
	
	
	
	
}
