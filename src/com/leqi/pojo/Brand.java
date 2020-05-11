package com.leqi.pojo;

public class Brand {
	private Integer cid;  //null---int ª· «0
	private String cname;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Brand(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Brand() {
		super();
	}
	@Override
	public String toString() {
		return "Brand [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
}
