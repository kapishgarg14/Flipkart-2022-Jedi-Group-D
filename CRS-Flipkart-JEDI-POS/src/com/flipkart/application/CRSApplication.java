package com.flipkart.application;

import java.util.Scanner;

import com.flipkart.bean.Courses;
import com.flipkart.service.*;

public class CRSApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("##################################################");
			System.out.println("Starting the course registration system");
			System.out.println("##################################################");
			System.out.println("Enter 1 for login");
			System.out.println("Enter 2 for viewing the course Catalog");
			System.out.println("Enter 3 for registering as a new student");
			System.out.println("Enter 0 for exiting the system");
			
			int option  = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter User ID: ");
				sc.nextLine();
				String userID = sc.nextLine();
				System.out.println("Enter Password: ");
				String passwd = sc.nextLine();
				System.out.println("User: " + userID + "\tPassword: " + passwd);
				break;
			case 2:
				CourseInterfaceImpl courseInterfaceImpl = new CourseInterfaceImpl();
				courseInterfaceImpl.createCourses();
				courseInterfaceImpl.viewCourseCatalog();
				break;
			case 3:
				StudentInterfaceImpl studentInterfaceImpl = new StudentInterfaceImpl();
				if(studentInterfaceImpl.addStudent()) {
					System.out.println("Student successfully registered");
				}
				//3sc.nextLine();
				break;
			case 0:
				System.out.println("Exiting registration system");
				sc.close();
				return;
			}
		}
	}

}
