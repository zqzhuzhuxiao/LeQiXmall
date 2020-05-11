package com.leqi.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.leqi.dao.CartDao;
import com.leqi.dao.impl.CartDaoImpl;
import com.leqi.pojo.Cart;
import com.leqi.pojo.User;

public class CartService extends HttpServlet{
	private CartDao cdao = new CartDaoImpl();
	
			
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String action = req.getParameter("action");
		if("add".equals(action))
			this.addCart(req,resp);
		else if("show".equals(action))
			this.showCart(req, resp);
	}
	
	
	private void showCart(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		HttpSession session=req.getSession();
		User u=(User)session.getAttribute("user");
		List<Cart> list=cdao.showCartByUid(u.getUid());
		session.setAttribute("clist", list);
//		Gson gson=new Gson();
//		String res=gson.toJson();
		PrintWriter pw=resp.getWriter();
		String ss="{\"data\":\"success\"}";
		pw.write(ss);
		pw.flush();
	}	
	
	
	private void addCart(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		HttpSession session=req.getSession();
		Integer num=(Integer)session.getAttribute("num");
		
		session.setAttribute("num", num==null?0:++num);
		
		String ids=req.getParameter("id");
		String name=req.getParameter("name");
		String prices=req.getParameter("price");
		String pic=req.getParameter("pic");
		System.out.println(pic);
		
		int id=0;
		if(ids!=null) {
			id=Integer.valueOf(ids);
		}
		Cart cart=new Cart();
		cart.setBname(name);
		cart.setBid(id);
		cart.setPrice(Float.valueOf(prices)); ///*/*/
		cart.setPic(pic);
		
 		cart.setUid(((User)(session.getAttribute("user"))).getUid());
		int res=cdao.addCart(cart);
		String ss="";
		if(res!=0) {
			//json格式
				//sucess
			ss="{\"data\":\"success\",\"num\":\""+(num)+"\"}";
		}else {
			//faild
			ss="{\"data\":\"faild\"}";
		}
		//文本格式
		PrintWriter pw=resp.getWriter(); 
		pw.write(ss);
		pw.flush();
	}
	
}
