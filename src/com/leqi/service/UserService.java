package com.leqi.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.leqi.dao.CartDao;
import com.leqi.dao.UserDao;
import com.leqi.dao.impl.CartDaoImpl;
import com.leqi.dao.impl.UserDaoImpl;
import com.leqi.pojo.User;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class UserService extends HttpServlet {
	private UserDao udao = new UserDaoImpl();
	private CartDao cdao = new CartDaoImpl();
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String action = arg0.getParameter("action");

		if ("login".equals(action)) {
			this.login(arg0, arg1);
		} else if ("logout".equals(action)) {
			this.logout(arg0, arg1);
		} else if ("reg".equals(action)) {
			this.regist(arg0, arg1);
		}else if("name".equals(action)){
			this.selectPassByname(arg0, arg1);
		}else if("remenberme".equals(action)) {
			this.remPass(arg0, arg1);
		}
	}
	private void selectPassByname(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter("name");
		String pass = udao.selectPass(name);
		
		PrintWriter ps=resp.getWriter();
		ps.write(pass);
		ps.flush();
		
		
	}
	
	private void login(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException, ServletException {
		HttpSession session=arg0.getSession();
		String name=arg0.getParameter("usrname");
		String pass=arg0.getParameter("usrpass");
		String code=arg0.getParameter("usrcode");
		String rememberme=arg0.getParameter("rememberme");
		
		User user=udao.checkUser(name, pass);
		if(user!=null) {
			//用户名和密码成功
			//验证码
			String session_code=(String)session.getAttribute("code");
				if(code.equals(session_code)) {
					arg0.getSession().setAttribute("num", cdao.selectNum(user.getUid()));
					//记录用户信息session
					session.setAttribute("user",user);
					if(rememberme!=null) {
					//记住密码
					Cookie cks=new Cookie(name, pass); //创建cookie对象
					cks.setMaxAge(30*24*60*60);//设置生命周期
					arg1.addCookie(cks);  //添加到客户端
					}
					//取出购物车所有数量，并且存入到域对象中
					
					//跳转到catalog
					arg0.getRequestDispatcher("catalog").forward(arg0, arg1);
				}else {
					arg0.setAttribute("err", "验证码有误");
					arg0.getRequestDispatcher("login.jsp").forward(arg0, arg1);
				}
		}else {
			//回到登陆界面
			arg0.setAttribute("err", "用户名和密码有错");
			arg0.getRequestDispatcher("login.jsp").forward(arg0, arg1);
			
		}
	}
	
	private void remPass(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException {
		String name = arg0.getParameter("usrname");
		PrintWriter pw= arg1.getWriter();
		Cookie[] cks=arg0.getCookies();
		for(Cookie cookie:cks) {
			if(name.equals(cookie.getName())) {
				pw.write(cookie.getValue());
				pw.flush();
				return;
			}
			
		}
		
	}
	

	private void logout(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException {
		HttpSession session = arg0.getSession();
		session.invalidate();
		arg1.sendRedirect("catalog");
	}

	private void regist(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException, ServletException {
		arg0.setCharacterEncoding("utf-8");
		String name = arg0.getParameter("usrname");
		String pass = arg0.getParameter("usrpass");
		User user = new User();
		user.setUanme(name);
		user.setUpass(pass);

		if (udao.addUser(user) == 1) {
			arg0.getRequestDispatcher("login.jsp").forward(arg0, arg1);
		} else {
			arg1.sendRedirect("regist.jsp");
		}
	}

}
