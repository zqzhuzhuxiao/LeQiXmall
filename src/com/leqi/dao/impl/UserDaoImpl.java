package com.leqi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.leeqi.utils.DButils;
import com.leqi.dao.UserDao;
import com.leqi.pojo.User;

public class UserDaoImpl implements UserDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public User checkUser(String name, String pass) {
		try {
			conn = DButils.getConn();
			ps = conn.prepareStatement("select * from users where uname=? and upass=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			if (rs.next()) {
				User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButils.close(conn, ps, rs);
		}

		return null;
	}
	
	//ÃÌº””√ªß
	@Override
	public int addUser(User user) {
		try {
			conn = DButils.getConn();
			ps = conn.prepareStatement("insert into users values(null,?,null,?,null,null,null,null)");
			ps.setString(1, user.getUanme());
			ps.setString(2, user.getUpass());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return 0;
	}

	@Override
	public String selectPass(String name) {
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select upass from users where uname=?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButils.close(conn, ps, rs);
		}
		return null;
	}

}
