package com.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourseDBInterfaceImpl implements CourseDBInterface {
    @Override
    public void viewCourses() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs", "root", "sql1234");
            Statement stmt = con.createStatement();
            String query = "select * from course";
            ResultSet rs = stmt.executeQuery(query);
//            con.close();
            while (rs.next()){
                System.out.println("Course ID: " + rs.getString(1) + "\t" + "Course Name: " + rs.getString(2) + "\t" + "Course Credits: " + rs.getString(3));

            }
            con.close();
        } catch (Exception var4) {
            System.out.println("Error in dbms please check");
        }
    }

    @Override
    public void addCourses(int courseID, int userID){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs", "root", "sql1234");
            Statement stmt = con.createStatement();
//            String query = "INSERT INTO crs.course (course_id, name, Credit) VALUES ('"+300+"'," + course_name + "," + course_credits + ")";
            String query = "INSERT INTO crs.courseCatalog (courseID, UserID) VALUES ("+
                    courseID+", "+userID+")";
            int rs = stmt.executeUpdate(query);
//            con.close();
//            while (rs.next()){
//                System.out.println("Course ID: " + rs.getString(1) + "\t" + "Course Name: " + rs.getString(2) + "\t" + "Course Credits: " + rs.getString(3));
//
//            }
            con.close();
        } catch (Exception var4) {
            System.out.println("Error in dbms please check");
        }
    }

    @Override
    public void dropCourses(int courseID, int userID) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs", "root", "sql1234");
            Statement stmt = con.createStatement();
            String query = "DELETE FROM crs.courseCatalog WHERE courseID = "+courseID+" AND UserID = "+userID;
            stmt.executeUpdate(query);
            con.close();
        } catch (Exception var4) {
            System.out.println("Error in dbms please check");
        }
    }
}
