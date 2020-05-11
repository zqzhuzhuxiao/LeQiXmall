package com.leeqi.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;



public class DButils {
	 private static String driver;
	 private static String url;
	 private static String user;
	 private static String pass;
	 
	 
	 //加载驱动	
	static {
		Properties prop=new Properties();
		try {
			prop.load(DButils.class.getClassLoader().getResourceAsStream("db.properties"));
			
			driver=prop.getProperty("driver");
			url=prop.getProperty("url");
			user=prop.getProperty("user");
			pass=prop.getProperty("pass");
			
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		} 	
	}
	
	
	//创建连接
	public static Connection getConn() {
		try {
			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//关闭连接
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		
			try {
				if(rs!=null) 
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(ps!=null)
						ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(conn!=null)
							conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
		
	}
	
	
}
