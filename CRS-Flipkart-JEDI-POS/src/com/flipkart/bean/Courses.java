package com.flipkart.bean;


public class Courses {
	protected int courseID;
	
	protected String courseName;
    private int credits;
    
    public Courses() {
    	
    }
    
    public Courses(int courseID, String courseName, int credits) {
    	this.courseID = courseID;
    	this.courseName = courseName;
    	this.credits = credits;
    }

    public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}

}