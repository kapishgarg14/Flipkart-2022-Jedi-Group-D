package com.flipkart.application;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.dao.AdminDaoImplementation;
import com.flipkart.dao.LoginDaoImplementation;
import com.flipkart.dao.StudentDaoImplementation;
import com.flipkart.exception.CourseAlreadyRegisteredException;
import com.flipkart.exception.UserNotFoundException;
import com.flipkart.service.ProfessorService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class CrsLoginMenu {
    /**
     * method for all users to login
     */
    public void crsLoginMenu() throws IOException, SQLException, UserNotFoundException, CourseAlreadyRegisteredException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter the userId:");
        String userId = br.readLine();
        System.out.println("Enter the password:");
        String password = br.readLine();

        System.out.println("Validating credentials ........");

        LoginDaoImplementation loginImplementation = new LoginDaoImplementation();

        int userType = loginImplementation.getUserType(userId);

        switch (userType) {
            case 1:

                System.out.println("Validating Student credentials ........");
                StudentDaoImplementation studentDaoImplementation = new StudentDaoImplementation();
                Student student = studentDaoImplementation.validateCredentials(userId, password);

                if (student != null && student.isApproved()) {
                    System.out.println("##############################");
                    System.out.println("Hello Student!!  Welcome to the Course Registration portal");
                    System.out.println("##############################");
                    CrsStudentMenu crsStudentMenu = new CrsStudentMenu();
                    crsStudentMenu.studentMenu(student);
                } else if (student == null) {
                    throw new UserNotFoundException(userId);
                } else {
                    System.out.println("************Sorry! Can't Login*************");
                    System.out.println("***Student has not been approved yet !!***");
                    System.out.println("*******************************************");
                }
                break;
            case 2:
                System.out.println("Validating Professor credentials ......");
                ProfessorService profServ = new ProfessorService();
                Professor professor = profServ.validateCredentials(userId, password);
                if (professor != null) {
                    System.out.println("###############################");
                    System.out.println("Hello Professor! Welcome to the Course Registration portal");
                    System.out.println("###############################");
                    CrsProfessorMenu crsProfessorMenu = new CrsProfessorMenu();
                    crsProfessorMenu.professorMenu(professor);
                } else {
                    System.out.println("Ooops! Invalid Password");
                    return;
                }
                break;
            case 3:
                System.out.println("Validating Admin credentials ..........");
                AdminDaoImplementation adminDaoImplementation = new AdminDaoImplementation();
                Admin x = adminDaoImplementation.validateCredentials(userId, password);
                if (x != null) {
                    System.out.println("###############################");
                    System.out.println("Hey Admin. Welcome to the portal");
                    System.out.println("###############################");
                    AdminMenu adminMenu = new AdminMenu();
                    adminMenu.adminMenu();
                } else {
                    System.out.println("Oh no!! Invalid Password. Try Again!");
                    return;
                }
                break;
            default:
                System.out.println("Ooops! Invalid User ID");
        }
    }
}
