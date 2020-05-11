package com.leqi.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements  Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		//判断是否登陆
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("user");
		if (obj != null) {
			// 如果登陆，继续向后执行
			arg2.doFilter(arg0, arg1);//
		} else {
			// 如果没有登陆，跳转刀登陆页面
			/* ((HttpServletResponse)arg1).sendRedirect("login.jsp"); */
			HttpServletResponse resp=(HttpServletResponse)arg1;
			PrintWriter pw =resp.getWriter();
			pw.write("{\"data\":\"faild\"}");
			pw.flush();
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}
