package com.leqi.dao;

import java.util.List;

import com.leqi.pojo.Phone;

public interface PhoneDao {
	/*
	 * �Ƽ�
	 */
	public List<Phone> sltAllNewPhone(String sql);
	
	/*
	 *��ҳ�滪Ϊչʾ 
	 */
	public List<Phone> sltAllNexHuaWei();
	/*
	 *��ҳ��С��չʾ 
	 */
	public List<Phone> sltAllNexXiaoMi();
	/*
	 *��ҳ��ƻ��չʾ 
	 */
	public List<Phone> sltAllNexApple();
	/*
	 *��ҳ������չʾ 
	 */
	public List<Phone> sltAllNexsanxing();
	/*
	 *��ҳ��vivoչʾ 
	 */
	public List<Phone> sltAllNexvivo();
	/*
	 *��ҳ������չʾ 
	 */
	public List<Phone> sltAllNexqita();
	
	
	
	/*
	 *����bid��ѯһ���ֻ� 
	 *ǰ̨����Ʒ����ҳ
	 *��̨���޸���Ϣ
	 */
	public Phone selectOnePhone(int bid);
	
	/*
	 *��ҳ��ѯ�����鼮 
	 */
	public List<Phone> selectByPage(int page,int rowsPerPage);
	
	/*
	 *��ѯ������ 
	 */
	public int getAllRows();
	
	/*
	 *����id�޸�phone���е����� 
	 */
	public int update(Phone phone);
	
	
	/*
	 *����id�޸�phone���е����� 
	 */
	public int delete(int bid);
	
	
	/*
	 *��̨����ֻ� 
	 */
	public int addPhone(Phone phone);
	
}
