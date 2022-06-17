package com.flipkart.application;

import com.flipkart.dao.StudentDaoImplementation;
import com.flipkart.exception.CourseAlreadyRegisteredException;
import com.flipkart.exception.UserNotFoundException;
import com.flipkart.service.UpdatePassword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class CrsApplication {
    /**
     * @param args
     * Program starts execution from here. Displays initial menu
     */
    public static void main(String[] args) throws IOException, SQLException, UserNotFoundException, CourseAlreadyRegisteredException {
//        final Logger logger = Logger.getLogger(CrsApplication.class);
        while (true) {
            System.out.println("");
            System.out.println("#############################################################");
            System.out.println("----------WELCOME TO COURSE REGISTRATION SYSTEM ----------");
            System.out.println("#############################################################");
            System.out.println("");
            System.out.println("Main Menu \n1. Register as a new student\n2. Login\n3.Exit");
            System.out.println("#############################################################");
            System.out.println("Enter your choice:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    StudentDaoImplementation studentDaoImplementation = new StudentDaoImplementation();
                    studentDaoImplementation.addStudent();
                    break;
                case 2:
                    CrsLoginMenu login = new CrsLoginMenu();
                    login.crsLoginMenu();
                    break;
                case 3:
                    UpdatePassword updatePassword = new UpdatePassword();
                    updatePassword.updatePassword();
                    break;
                case 4:
                    System.out.println("Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!!!! Please enter Details Again");
            }

        }
    }
}