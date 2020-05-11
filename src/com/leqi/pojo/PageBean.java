package com.leqi.pojo;

public class PageBean {
	private int rowsPerPage; //每页显示行数
	private int pages;//当前页
	private int rowsNum; //总行数
	private int pageNum;  //总页数
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
		//计算总页数
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
