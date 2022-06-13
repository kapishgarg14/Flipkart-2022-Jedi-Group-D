package com.flipkart.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.flipkart.bean.GradeCard;
import com.flipkart.bean.Student;

public class StudentInterfaceImpl implements StudentInterface{

	@Override
	public void showCourses() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<GradeCard> viewGrades(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makePayment(Student student, String method) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addPrimaryCourse(int studentId, int courseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePrimaryCourse(int studentId, int courseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSecondaryCourse(int studentId, int courseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeSecondaryCourse(int studentId, int courseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void viewPrimaryRegisteredCourses(int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewSecondaryRegisteredCourses(int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addStudent() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		
		String pass1, pass2;
		
		while(true) {
			System.out.println("Enter password: ");
			pass1 = sc.nextLine();
			System.out.println("Re-enter password");
			pass2 = sc.nextLine();
			if(pass1.equals(pass2)) {
				break;
			}
			else {
				System.out.println("Password Doesn't match, enter again");
			}
		}
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Semester: ");
		int semester = sc.nextInt();
		
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		student.setEmail(email);
		student.setPassword(pass1);
		student.setName(name);
		student.setSemester(semester);
		student.setAdmission_year(year);
		
		//sc.close();
		return true;
	}

	@Override
	public void viewPayments(Student student) {
		// TODO Auto-generated method stub
		
	} 

}
