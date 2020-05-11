package com.leqi.pojo;

public class PageBean {
	private int rowsPerPage; //ÿҳ��ʾ����
	private int pages;//��ǰҳ
	private int rowsNum; //������
	private int pageNum;  //��ҳ��
	public int getRowsPerPage() {
		return rowsPerPage;
	}
	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getRowsNum() {
		return rowsNum;
	}
	public void setRowsNum(int rowsNum) {
		this.rowsNum = rowsNum;
		//������ҳ��
		this.pageNum=rowsNum/rowsPerPage;
		if(this.rowsNum%rowsPerPage!=0) {
			pageNum++;
		}
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	
	
}
