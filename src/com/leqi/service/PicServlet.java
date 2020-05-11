package com.leqi.service;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;


public class PicServlet extends HttpServlet{
	private String source="abcdefghijklmnopqrstuvwxyz0123456789";
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("image/jpeg");
		
		BufferedImage buffer=new BufferedImage(90, 50, BufferedImage.TYPE_INT_RGB); //����
		
		Graphics g=buffer.getGraphics();//����
		g.setColor(Color.blue);//ѡɫ
		g.fillRect(0, 0, 90, 50); //��ɫ
		
		g.setColor(Color.white);
		g.setFont(new Font("����",Font.BOLD,30));
		
		String checkcode=getCode(4);
		HttpSession session=req.getSession();
		session.setAttribute("code", checkcode);
		g.drawString(checkcode, 10, 40);
		Random r=new Random();
		for (int i = 1; i <=20; i++) {
			g.setColor(new Color(r.nextInt(245), r.nextInt(220),r.nextInt(145)));
			g.drawLine(r.nextInt(90), r.nextInt(50), r.nextInt(90),r.nextInt(50));
		}
		g.dispose();//���»���
		JPEGImageEncoder en=JPEGCodec.createJPEGEncoder(resp.getOutputStream());
		en.encode(buffer);
	}
	
	//���ȡ��
	private String getCode(int len) {
		Random r=new Random();
		char[] cc=new char[len];
		for(int i =1;i<=len;i++) {
			// char c=source.charAt(r.nextInt(source.length()));  //���ַ������ȡ
			cc[i-1]=source.charAt(r.nextInt(source.length()));
		}
		
		return new String(cc,0,len);
	}
}
