package com.leqi.pojo;

public class Cart {
	private Integer cid;
	private String bname;
	private Integer num;
	private	Float price;
	private Integer uid;
	private Integer bid;
	private String pic;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	public Cart() {
		super();
	}
	public Cart(Integer cid, String bname, Integer num, Float price, Integer uid, Integer bid, String pic) {
		super();
		this.cid = cid;
		this.bname = bname;
		this.num = num;
		this.price = price;
		this.uid = uid;
		this.bid = bid;
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", bname=" + bname + ", num=" + num + ", price=" + price + ", uid=" + uid + ", bid="
				+ bid + ", pic=" + pic + "]";
	}
	
	
	
	
	
}
