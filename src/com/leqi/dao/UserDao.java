package com.leqi.dao;

import com.leqi.pojo.User;

public interface UserDao {
	/*
	 *根据用户名和密码查询一个用户 
	 */
	public User checkUser(String name,String pass);
	
	
	/*
	 *根据写的用户名和密码添加一个用户 
	 */
	public int addUser(User user);

	/*
	 *根据昵称查询密码
	 */
	public String selectPass(String name );
	
	/*
	 * 
	 */
}
