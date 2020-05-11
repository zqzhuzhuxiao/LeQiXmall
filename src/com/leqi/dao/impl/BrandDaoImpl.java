package com.leqi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.leeqi.utils.DButils;
import com.leqi.dao.BrandDao;
import com.leqi.pojo.Brand;

public class BrandDaoImpl implements BrandDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public List<Brand> selectAllBrand() {
		List<Brand> list = new ArrayList<Brand>();
		try {
			conn=DButils.getConn();
			ps=conn.prepareStatement("select * from brand order by cid");
			rs=ps.executeQuery();
			while (rs.next()) {
				Brand br=new Brand(rs.getInt(1), rs.getString(2));
				list.add(br);
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
