package com.flipkart.bean;

import com.flipkart.application.Sqlcon;

public class Admin extends User {
	Sqlcon sqlcon = new Sqlcon();
	String t = "Select * from user";
	public Admin(int adminId, String adminName, String adminEmail) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
	}
	private int adminId;
	private String adminName;
	private String adminEmail;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

}
