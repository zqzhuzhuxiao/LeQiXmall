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
	
	
	//��method="get"
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget----");
	}
	
	
	//��method="post"
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost------");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//��servlet��ʼ
		List<Brand> blist=bdao.selectAllBrand();		//һ���˵�
		List<Type> tlist=tdao.selectAlType();			//�����˵�
		
		List<Phone> plist=pdao.sltAllNexHuaWei();    	//ҳ�滪Ϊ����չʾ8����ѯ
		List<Phone> xmlist=pdao.sltAllNexXiaoMi();    	//ҳ��С�׷���չʾ8����ѯ
		List<Phone> aplist=pdao.sltAllNexApple();    	//ҳ��ƻ������չʾ8����ѯ
		List<Phone> sxlist=pdao.sltAllNexsanxing();    	//ҳ�����Ƿ���չʾ8����ѯ
		List<Phone> vvlist=pdao.sltAllNexvivo();    	//ҳ��vivo����չʾ8����ѯ
		List<Phone> qtlist=pdao.sltAllNexqita();    	//ҳ��vivo����չʾ8����ѯ
		//index.jsp����
		//HttpServletRequest---request   |   HttpServletResponse ---  response 
		//request  /   response
		  //request.getParameter
		  //request.sendRedirevt

		//�����request������
		 req.setAttribute("blist",blist);
		 req.setAttribute("tlist",tlist);
		 req.setAttribute("plist",plist);
		 req.setAttribute("xmlist",xmlist); 	//ҳ��С�׷���չʾ8����ѯ
		 req.setAttribute("aplist",aplist); 	//ƻ��apple����չʾ8����ѯ
		 req.setAttribute("sxlist",sxlist); 	//ƻ�����Ƿ���չʾ8����ѯ
		 req.setAttribute("vvlist",vvlist); 	//ƻ��vivo����չʾ8����ѯ
		 req.setAttribute("qtlist",qtlist); 	//ƻ��vivo����չʾ8����ѯ
		 
		 req.getRequestDispatcher("index.jsp").forward(req, resp);
		 
	}
		
}
