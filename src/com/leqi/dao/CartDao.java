package com.leqi.dao;

import java.util.List;

import com.leqi.pojo.Cart;

public interface CartDao {
	
	/*
	 *加入购物车 
	 */
	public int addCart(Cart cart);
	
	
	/*
	 *查询用户的购物车数量
	 */
	public int selectNum(int uid);
	
	/*
	 *查看当前购物车商品信息
	 */
	public List<Cart> showCartByUid(int uid);
}
