package com.leqi.dao;

import java.util.List;

import com.leqi.pojo.Cart;

public interface CartDao {
	
	/*
	 *���빺�ﳵ 
	 */
	public int addCart(Cart cart);
	
	
	/*
	 *��ѯ�û��Ĺ��ﳵ����
	 */
	public int selectNum(int uid);
	
	/*
	 *�鿴��ǰ���ﳵ��Ʒ��Ϣ
	 */
	public List<Cart> showCartByUid(int uid);
}
