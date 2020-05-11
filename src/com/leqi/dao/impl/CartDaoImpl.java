package com.leqi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.leeqi.utils.DButils;
import com.leqi.dao.CartDao;
import com.leqi.pojo.Cart;

public class CartDaoImpl implements CartDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public int addCart(Cart cart) {
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("insert into cart values(null,?,1,?,?,?,?)");
			ps.setString(1, cart.getBname());
			ps.setFloat(2, cart.getPrice());
			ps.setInt(3, cart.getUid()); 
			ps.setInt(4, cart.getBid());
			ps.setString(5, cart.getPic());
			
			return ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return 0;
		
	}

	@Override
	public int selectNum(int uid) {
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select sum(num) from cart where uid=?");
			ps.setInt(1, uid);
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

	@Override
	public List<Cart> showCartByUid(int uid) {
		List<Cart> list=new ArrayList<Cart>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from cart where uid=?");
			ps.setInt(1, uid);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				list.add(new Cart(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getFloat(4), rs.getInt(5), 
						rs.getInt(6),rs.getString(7)));
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return null;
	}

}
