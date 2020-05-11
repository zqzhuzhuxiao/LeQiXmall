package com.leqi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.leeqi.utils.DButils;
import com.leqi.dao.TypeDao;
import com.leqi.pojo.Type;

public class TypeDaoImpl implements TypeDao {
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	
	@Override
	public List<Type> selectAlType() {
			List<Type> list=new ArrayList<Type>();
			try {
				conn=DButils.getConn();
				ps=conn.prepareStatement("select * from type");
				rs=ps.executeQuery();
				while (rs.next()) {
					Type ty=new Type(rs.getInt(1),rs.getString(2),rs.getInt(3));
					list.add(ty);
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
