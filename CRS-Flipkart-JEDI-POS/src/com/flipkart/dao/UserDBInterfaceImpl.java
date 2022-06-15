package com.flipkart.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class UserDBInterfaceImpl implements UserDBInterface{
    @Override
    public String ifUserExist(String userEmail, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs", "root", "sql1234");
            Statement stmt = con.createStatement();
            String query = "select * from user where email = '"+userEmail+"'";
            ResultSet rs = stmt.executeQuery(query);
//            con.close();
            boolean var;
            while (rs.next()){
                var = Objects.equals(rs.getString(3), password);
                if(var){
                    String name = rs.getString(6);
                    int userId = rs.getInt(1);
                    int role = rs.getInt(4);
                    boolean isVerified = rs.getBoolean(5);
                    if(role == 1){
                        //admin
                        return "Admin";
                    }
                    else if(role == 2){
                        //prof
                        return "Professor";
                    }
                    else if(role == 3){
                        //prof
                        return "Student";
                    }
                    else{
                        //student
                        return null;
                    }
                }
            }
            con.close();
            return null;
        } catch (Exception var4) {
            System.out.println("Error in dbms please check");
            return null;
        }
    }

    @Override
    public int getUserID(String userEmail, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs", "root", "sql1234");
            Statement stmt = con.createStatement();
            String query = "select * from user where email = '"+userEmail+"'";
            ResultSet rs = stmt.executeQuery(query);
//            con.close();
            boolean var;
            while (rs.next()){
                var = Objects.equals(rs.getString(3), password);
                if(var){
                    int userId = rs.getInt(1);
                    return userId;
                }
                return 0;
            }
            con.close();
            return 0;
        } catch (Exception var4) {
            System.out.println("Error in dbms please check");
            return 0;
        }
    }
}
