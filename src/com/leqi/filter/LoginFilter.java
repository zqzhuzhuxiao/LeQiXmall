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
		//�ж��Ƿ��½
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("user");
		if (obj != null) {
			// �����½���������ִ��
			arg2.doFilter(arg0, arg1);//
		} else {
			// ���û�е�½����ת����½ҳ��
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
