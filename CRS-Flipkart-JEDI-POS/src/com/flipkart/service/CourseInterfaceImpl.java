package com.flipkart.service;

import com.flipkart.bean.Courses;
import java.util.*;

public class CourseInterfaceImpl implements CourseInterface {
	
	ArrayList<Courses> courseList = new ArrayList<Courses>();
	
	@Override
	public void viewCourseCatalog() {
		// TODO Auto-generated method stub
		System.out.printf("Printing Course Catalog....\n\n\n\n");
		//System.out.printf("Course ID \t Course Name \t Course Units\n");
		for(Courses course: courseList) {
			System.out.println("Course ID: " + course.getCourseID() + "\t" + "Course Name: " + course.getCourseName() + "\t" + "Course Credits: " + course.getCredits());
		}
	}

	@Override
	public void createCourses() {
		// TODO Auto-generated method stub		
		System.out.println("Adding Courses to the Catalog");
		
		Courses c1 = new Courses(1, "Compiler", 3);
		Courses c2 = new Courses(2, "Networks", 4);
		Courses c3 = new Courses(3, "DSA", 3);
		Courses c4 = new Courses(4, "Professional Ethics", 3);
		Courses c5 = new Courses(5, "Current Affairs", 3);
		
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		courseList.add(c4);
		courseList.add(c5);
	}
}
