package com.leqi.pojo;

import java.util.Date;

public class Phone {
	private Integer bid;
	private String bname;
	private Float price;
	private Float rulprice;	
	private String branda;
	private String pic;
	private String version;
	private Date publishTime;
	private String color;
	private Integer sale;
	private Integer info1;
	private Integer info2;
	private Integer info3;
	private Integer info4;
	private Integer tid;
	private String pic1;
	private String pic2;
	private String pic3;
	private String pic4;
	
	public String getPic1() {
		return pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}
	public String getPic2() {
		return pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	public String getPic3() {
		return pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}
	public String getPic4() {
		return pic4;
	}
	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getRulprice() {
		return rulprice;
	}
	public void setRulprice(Float rulprice) {
		this.rulprice = rulprice;
	}
	public String getBranda() {
		return branda;
	}
	public void setBranda(String branda) {
		this.branda = branda;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getSale() {
		return sale;
	}
	public void setSale(Integer sale) {
		this.sale = sale;
	}
	public Integer getInfo1() {
		return info1;
	}
	public void setInfo1(Integer info1) {
		this.info1 = info1;
	}
	public Integer getInfo2() {
		return info2;
	}
	public void setInfo2(Integer info2) {
		this.info2 = info2;
	}
	public Integer getInfo3() {
		return info3;
	}
	public void setInfo3(Integer info3) {
		this.info3 = info3;
	}
	public Integer getInfo4() {
		return info4;
	}
	public void setInfo4(Integer info4) {
		this.info4 = info4;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Phone [bid=" + bid + ", bname=" + bname + ", price=" + price + ", rulprice=" + rulprice + ", branda="
				+ branda + ", pic=" + pic + ", version=" + version + ", publishTime=" + publishTime + ", color=" + color
				+ ", sale=" + sale + ", info1=" + info1 + ", info2=" + info2 + ", info3=" + info3 + ", info4=" + info4
				+ ", tid=" + tid + ", pic1=" + pic1 + ", pic2=" + pic2 + ", pic3=" + pic3 + ", pic4=" + pic4 + "]";
	}
	public Phone() {
		super();
	}
	
	
	public Phone(Integer bid, String bname, Float price, Float rulprice, String branda, String pic, String version,
			Date publishTime, String color, Integer sale, Integer info1, Integer info2, Integer info3, Integer info4,
			Integer tid) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.rulprice = rulprice;
		this.branda = branda;
		this.pic = pic;
		this.version = version;
		this.publishTime = publishTime;
		this.color = color;
		this.sale = sale;
		this.info1 = info1;
		this.info2 = info2;
		this.info3 = info3;
		this.info4 = info4;
		this.tid = tid;
	}
	
	
	//展示页面8个
	public Phone(String bname, Float price, String branda, String pic, String version) {
		super();
		this.bname = bname;
		this.price = price;
		this.branda = branda;
		this.pic = pic;
		this.version = version;
	}
	//新机
	public Phone(String bname, Float price,  String pic) {
		super();
		this.bname = bname;
		this.price = price;
		this.pic = pic;
	}
	public Phone(Integer bid, String bname, Float price, Float rulprice, String branda, String pic, String version,
			Date publishTime, String color, Integer sale, Integer info1, Integer info2, Integer info3, Integer info4,
			Integer tid, String pic1, String pic2, String pic3, String pic4) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.rulprice = rulprice;
		this.branda = branda;
		this.pic = pic;
		this.version = version;
		this.publishTime = publishTime;
		this.color = color;
		this.sale = sale;
		this.info1 = info1;
		this.info2 = info2;
		this.info3 = info3;
		this.info4 = info4;
		this.tid = tid;
		this.pic1 = pic1;
		this.pic2 = pic2;
		this.pic3 = pic3;
		this.pic4 = pic4;
	}

	
	
	
	
	
	
	
}
