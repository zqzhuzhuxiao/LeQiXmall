package com.leqi.pojo;

public class User {
	private Integer uid;
	private String uanme;
	private String realname;
	private String upass;
	private String tel;
	private Integer aid;
	private String gender;   //µØÖ·Íâ¼ü
	private String email;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUanme() {
		return uanme;
	}
	public void setUanme(String uanme) {
		this.uanme = uanme;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uanme=" + uanme + ", realname=" + realname + ", upass=" + upass + ", tel=" + tel
				+ ", aid=" + aid + ", gender=" + gender + ", email=" + email + "]";
	}
	public User(Integer uid, String uanme, String realname, String upass, String tel, Integer aid, String gender,
			String email) {
		super();
		this.uid = uid;
		this.uanme = uanme;
		this.realname = realname;
		this.upass = upass;
		this.tel = tel;
		this.aid = aid;
		this.gender = gender;
		this.email = email;
	}
	public User() {
		super();
	}
	
	
	
	
	
	
}