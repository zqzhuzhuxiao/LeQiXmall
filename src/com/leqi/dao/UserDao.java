package com.leqi.dao;

import com.leqi.pojo.User;

public interface UserDao {
	/*
	 *�����û����������ѯһ���û� 
	 */
	public User checkUser(String name,String pass);
	
	
	/*
	 *����д���û������������һ���û� 
	 */
	public int addUser(User user);

	/*
	 *�����ǳƲ�ѯ����
	 */
	public String selectPass(String name );
	
	/*
	 * 
	 */
}
