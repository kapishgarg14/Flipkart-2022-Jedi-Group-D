package com.flipkart.bean;

import java.util.*;

public class Student extends User {
	private int studentID;
	private boolean registered;
	private Vector<Integer> registeredCourses = new Vector<>();
	private boolean paymentStatus;
	private String branch;
	private int semester;
	private int admission_year;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public boolean isRegistered() {
		return registered;
	}
	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
	public Vector<Integer> getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(Vector<Integer> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getAdmission_year() {
		return admission_year;
	}
	public void setAdmission_year(int admission_year) {
		this.admission_year = admission_year;
	}
	
}
