//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.flipkart.application;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class MysqlCon {
    MysqlCon() {
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs", "root", "sql1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user");

            while(rs.next()) {
                PrintStream var10000 = System.out;
                int var10001 = rs.getInt(1);
                var10000.println("" + var10001 + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

            con.close();
        } catch (Exception var4) {
            System.out.println(var4);
        }

    }
}