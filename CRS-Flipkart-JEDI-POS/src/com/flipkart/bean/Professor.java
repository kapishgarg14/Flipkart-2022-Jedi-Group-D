package com.flipkart.bean;

import java.util.*;

public class Professor extends User {
		public Professor(String department, Vector<String> coursesAssigned) {
		this.department = department;
		this.coursesAssigned = coursesAssigned;
	}
		private String department;
		
		private Vector<String> coursesAssigned = new Vector<String>();
		
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public Vector<String> getListOfCourseAssigned() {
			return coursesAssigned;
		}
		public void setListOfCourseAssigned(Vector<String> coursesAssigned) {
			this.coursesAssigned = coursesAssigned;
		}

}
