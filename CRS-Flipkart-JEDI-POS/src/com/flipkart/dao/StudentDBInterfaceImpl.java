package com.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDBInterfaceImpl implements StudentDBInterface {
    @Override
    public void viewGradeCard(int userID) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs", "root", "sql1234");
            Statement stmt = con.createStatement();
            String query = "select * from gradeCard where userID = " + userID;
            ResultSet rs = stmt.executeQuery(query);
//            con.close();
            while (rs.next()){
                query = "select * from course where course_id = " + rs.getInt(2);
//                System.out.println(rs.getInt(3));
                int ii = rs.getInt(3);
                ResultSet rsc = stmt.executeQuery(query);
                String course_name = "";
                while (rsc.next()){
                    course_name = rsc.getString(2);
                }
                System.out.println("Course Name: " + course_name + "\t" + "Grade: " + ii);
            }
            con.close();

        } catch (Exception var4) {
//            System.out.println("Error in dbms please check");
        }
    }
}
