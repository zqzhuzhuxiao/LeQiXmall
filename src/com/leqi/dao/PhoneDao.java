package com.leqi.dao;

import java.util.List;

import com.leqi.pojo.Phone;

public interface PhoneDao {
	/*
	 * 推荐
	 */
	public List<Phone> sltAllNewPhone(String sql);
	
	/*
	 *首页面华为展示 
	 */
	public List<Phone> sltAllNexHuaWei();
	/*
	 *首页面小米展示 
	 */
	public List<Phone> sltAllNexXiaoMi();
	/*
	 *首页面苹果展示 
	 */
	public List<Phone> sltAllNexApple();
	/*
	 *首页面三星展示 
	 */
	public List<Phone> sltAllNexsanxing();
	/*
	 *首页面vivo展示 
	 */
	public List<Phone> sltAllNexvivo();
	/*
	 *首页面其他展示 
	 */
	public List<Phone> sltAllNexqita();
	
	
	
	/*
	 *根据bid查询一个手机 
	 *前台：商品详情页
	 *后台：修改信息
	 */
	public Phone selectOnePhone(int bid);
	
	/*
	 *分页查询所有书籍 
	 */
	public List<Phone> selectByPage(int page,int rowsPerPage);
	
	/*
	 *查询总行数 
	 */
	public int getAllRows();
	
	/*
	 *根据id修改phone表中的数据 
	 */
	public int update(Phone phone);
	
	
	/*
	 *根据id修改phone表中的数据 
	 */
	public int delete(int bid);
	
	
	/*
	 *后台添加手机 
	 */
	public int addPhone(Phone phone);
	
}
