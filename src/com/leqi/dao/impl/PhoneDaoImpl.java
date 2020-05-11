package com.leqi.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.leeqi.utils.DButils;
import com.leqi.dao.PhoneDao;
import com.leqi.pojo.Phone;

public class PhoneDaoImpl implements PhoneDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	//新品推荐  "select * from phone order by publishTime desc limit 0,5"  (rs.getString("bname"),rs.getFloat("price"),rs.getString("pic"));
	@Override 
	public List<Phone> sltAllNewPhone(String sql) {
		List<Phone> list = new ArrayList<Phone>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while (rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
									  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
									  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"), rs.getInt("info4"),rs.getInt("tid"));
				list.add(phone);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 *首页面华为展示 
	 */
	@Override
	public List<Phone> sltAllNexHuaWei() {
		List<Phone> list = new ArrayList<Phone>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from phone where branda='华为' limit 0,8");
			rs=ps.executeQuery();
			while (rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
						  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
						  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"), rs.getInt("info4"),rs.getInt("tid"));
				list.add(phone);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return list;
	}
	
	/*
	 *首页面小米展示 
	 */
	@Override
	public List<Phone> sltAllNexXiaoMi() {
		List<Phone> list = new ArrayList<Phone>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from phone where branda='小米' limit 0,8");
			rs=ps.executeQuery();
			while (rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
						  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
						  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"),
						  rs.getInt("info4"),rs.getInt("tid"), rs.getString("pic1"), rs.getString("pic2"), rs.getString("pic3"), rs.getString("pic4"));
				list.add(phone);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return list;
	}
	
	
	/*
	 *首页面苹果展示 
	 */
	@Override
	public List<Phone> sltAllNexApple() {
		List<Phone> list=new ArrayList<Phone>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from phone where branda='苹果'  limit 0,8");
			rs=ps.executeQuery();
			while (rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
						  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
						  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"),
						  rs.getInt("info4"),rs.getInt("tid"), rs.getString("pic1"), rs.getString("pic2"), rs.getString("pic3"), rs.getString("pic4"));
				list.add(phone);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return list;
	}
   
	/*
	 *首页面sanxing展示 
	 */
	@Override
	public List<Phone> sltAllNexsanxing() {
		List<Phone> list=new ArrayList<Phone>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from phone where branda='三星'  limit 0,8");
			rs=ps.executeQuery();
			while (rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
						  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
						  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"),
						  rs.getInt("info4"),rs.getInt("tid"), rs.getString("pic1"), rs.getString("pic2"), rs.getString("pic3"), rs.getString("pic4"));
				list.add(phone);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return list;
	}
	
	
	/*
	 *首页面vivo展示 
	 */
	@Override
	public List<Phone> sltAllNexvivo() {
		List<Phone> list=new ArrayList<Phone>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from phone where branda='vivo' limit 0,8");
			rs=ps.executeQuery();
			while (rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
						  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
						  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"),
						  rs.getInt("info4"),rs.getInt("tid"), rs.getString("pic1"), rs.getString("pic2"), rs.getString("pic3"), rs.getString("pic4"));
				list.add(phone);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return list;
	}
	
	
	/*
	 *首页面其他展示 
	 */
	@Override
	public List<Phone> sltAllNexqita() {
		List<Phone> list=new ArrayList<Phone>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from phone where branda='其他' limit 0,8");
			rs=ps.executeQuery();
			while (rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
						  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
						  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"),
						  rs.getInt("info4"),rs.getInt("tid"), rs.getString("pic1"), rs.getString("pic2"), rs.getString("pic3"), rs.getString("pic4"));
				list.add(phone);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return list;
	}
















	//查询一个手机
	@Override
	public Phone selectOnePhone(int bid) {
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from phone where bid=?");
			ps.setInt(1, bid);
			rs=ps.executeQuery();
			while (rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
									  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
									  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"),
									  rs.getInt("info4"),rs.getInt("tid"), rs.getString("pic1"), rs.getString("pic2"), rs.getString("pic3"), rs.getString("pic4"));
				return phone;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return null;
		
	}

	//查询所有手机
	@Override
	public List<Phone> selectByPage(int page, int rowsPerPage) {
		List<Phone> list = new ArrayList<Phone>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from phone limit ?,?");
			ps.setInt(1, (page-1)*rowsPerPage);
			ps.setInt(2, rowsPerPage);
			rs=ps.executeQuery();
			while(rs.next()) {
				Phone phone=new Phone(rs.getInt("bid"), rs.getString("bname"), rs.getFloat("price"), rs.getFloat("rulprice"), 
						  rs.getString("branda"), rs.getString("pic"), rs.getString("versiona"), rs.getDate("publishTime"), 
						  rs.getString("color"), rs.getInt("sale"), rs.getInt("info1"), rs.getInt("info2"), rs.getInt("info3"),
						  rs.getInt("info4"),rs.getInt("tid"), rs.getString("pic1"), rs.getString("pic2"), rs.getString("pic3"), rs.getString("pic4"));
				list.add(phone);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return null;
	}








	@Override
	public int getAllRows() {
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select count(*) from phone");
			rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return 0;
	}



	//修改手机
	//update books set bname=?,price=?,
	//rulprice=?,branda=?,pic=?,versiona=?,
	//publishTime=?,color=?,sale=?,info1=?,
	//info2=?,info3=?,info4=?
	@Override
	public int update(Phone phone) {
		java.util.Date d=new java.util.Date();
		java.sql.Date d2=new java.sql.Date(d.getTime());
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("update phone set bname=?,price=?,rulprice=?,branda=?,pic=?,versiona=?,color=?,sale=?,info1=?,info2=?,info3=?,info4=? where bid=? ");
			ps.setString(1, phone.getBname());
			ps.setFloat(2, phone.getPrice());
			ps.setFloat(3, phone.getRulprice());
			ps.setString(4, phone.getBranda());
			ps.setString(5, phone.getPic());
			ps.setString(6, phone.getVersion());
	//		ps.setDate(7, (Date) phone.getPublishTime());
			ps.setString(7, phone.getColor());
			ps.setInt(8, phone.getSale());
			ps.setInt(9,phone.getInfo1());
			ps.setInt(10, phone.getInfo2());
			ps.setInt(11, phone.getInfo3());
			ps.setInt(12, phone.getInfo4());
			
			ps.setInt(13, phone.getBid() );
			
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return 0;
	}
	
	//后台删除一个手机
	@Override
	public int delete(int bid) {
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("delete from phone where bid=? ");
			ps.setInt(1, bid);
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return 0;
	}
	//后台添加一个商品
	//修改手机
		//update books set bname=?,price=?,
		//rulprice=?,branda=?,pic=?,versiona=?,
		//publishTime=?,color=?,sale=?,info1=?,
		//info2=?,info3=?,info4=?
	@Override
	public int addPhone(Phone phone) {
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("insert into phone values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, phone.getBname());
			ps.setFloat(2, phone.getPrice());
			ps.setFloat(3, phone.getRulprice());
			ps.setString(4, phone.getBranda());
			ps.setString(5, phone.getPic());
			ps.setString(6, phone.getVersion());
			ps.setDate(7, (Date) phone.getPublishTime());
			ps.setString(8, phone.getColor());
			ps.setInt(9, phone.getSale());
			ps.setInt(10, phone.getInfo1());
			ps.setInt(11, phone.getInfo2());
			ps.setInt(12, phone.getInfo3());
			ps.setInt(13, phone.getInfo4());
			ps.setInt(14, phone.getTid());
			ps.setString(15, phone.getPic1());
			ps.setString(16, phone.getPic2());
			ps.setString(17, phone.getPic3());
			ps.setString(18, phone.getPic4());
			
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return 0;
	}


}
