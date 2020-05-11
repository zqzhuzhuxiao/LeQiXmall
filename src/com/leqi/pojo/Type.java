package com.leqi.pojo;

public class Type {
	private Integer tid;
	private String ttype;
	private Integer cid;
	
	
	public Integer getTid() {
		return tid;
	}


	public void setTid(Integer tid) {
		this.tid = tid;
	}


	public String getTtype() {
		return ttype;
	}


	public void setTtype(String ttype) {
		this.ttype = ttype;
	}


	public Integer getCid() {
		return cid;
	}


	public void setCid(Integer cid) {
		this.cid = cid;
	}


	public Type(Integer tid, String ttype, Integer cid) {
		super();
		this.tid = tid;
		this.ttype = ttype;
		this.cid = cid;
	}


	public Type() {
		super();
	}


	@Override
	public String toString() {
		return "Type [tid=" + tid + ", ttype=" + ttype + ", cid=" + cid + "]";
	}
	
	
}
