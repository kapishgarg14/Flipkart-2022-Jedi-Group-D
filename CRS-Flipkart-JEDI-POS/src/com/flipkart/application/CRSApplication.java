package com.flipkart.application;

import java.util.Scanner;

import com.flipkart.bean.Courses;
import com.flipkart.dao.CourseDBInterfaceImpl;
import com.flipkart.dao.StudentDBInterfaceImpl;
import com.flipkart.dao.UserDBInterface;
import com.flipkart.dao.UserDBInterfaceImpl;
import com.flipkart.service.*;

public class CRSApplication {

	public static void main(String[] args) {

		int userID = 0;

		UserDBInterfaceImpl userDBInterfaceImpl = new UserDBInterfaceImpl();
		CourseDBInterfaceImpl courseDBInterfaceImpl = new CourseDBInterfaceImpl();
		StudentDBInterfaceImpl studentDBInterfaceImpl = new StudentDBInterfaceImpl();

		System.out.println(userDBInterfaceImpl.ifUserExist("goelm08@gmail.com", "20082001"));
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
				System.out.println("Enter User email: ");
				sc.nextLine();
				String userEmail = sc.nextLine();
				System.out.println("Enter Password: ");
				String passwd = sc.nextLine();

				String userType = userDBInterfaceImpl.ifUserExist(userEmail, passwd);

				if(userType == null){
					System.out.println("User don't exist");
				} else if(userType == "Student") {

					userID = userDBInterfaceImpl.getUserID(userEmail, passwd);

					while(true){
						System.out.println("##################################################");
						System.out.println("Welcome Student");
						System.out.println("##################################################");
						System.out.println("Enter 1 to View Grade Card");
						System.out.println("Enter 2 to add Course");
						System.out.println("Enter 3 for registering as a new student");
						System.out.println("Enter 0 for exiting the system");

						int studentOption  = sc.nextInt();

						switch(studentOption){

							case 1:
								studentDBInterfaceImpl.viewGradeCard(userID);
								break;
							case 2:
								System.out.println("Enter Course ID: ");
								sc.nextLine();
								int courseID = sc.nextInt();
								courseDBInterfaceImpl.addCourses(courseID, userID);
								break;
							case 3:
								System.out.println("Enter Course ID: ");
								sc.nextLine();
								int courseID1 = sc.nextInt();
								courseDBInterfaceImpl.dropCourses(courseID1, userID);
								break;
							case 0:
								System.out.println("Exiting Course Registration system");
								return;
						}

					}
				}
				break;
			case 2:
				courseDBInterfaceImpl.viewCourses();
//				CourseInterfaceImpl courseInterfaceImpl = new CourseInterfaceImpl();
//				courseInterfaceImpl.createCourses();
//				courseInterfaceImpl.viewCourseCatalog();
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
