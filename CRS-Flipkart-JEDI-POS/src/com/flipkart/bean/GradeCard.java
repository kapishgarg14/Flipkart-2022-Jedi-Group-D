package com.flipkart.bean;

public class GradeCard {
	public GradeCard(int studentId, int courseID, String courseName, String grade) {
		this.studentId = studentId;
		this.courseID = courseID;
		this.courseName = courseName;
		this.grade = grade;
	}

	private int studentId;
	private int courseID;
	private String courseName;
	private String grade;
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId(){
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName(){
		return courseName;
	}

	public void setCourseName(String courseName){
		this.courseName = courseName;
	}

	public String getGrade(){
		return grade;
	}

	public void setGrade(String grade){
		this.grade = grade;
	}
}
