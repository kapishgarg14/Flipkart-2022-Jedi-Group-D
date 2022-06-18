/**
 *
 */
package com.flipkart.dao;

import com.flipkart.utils.DBUtils;

import java.sql.*;

/**
 * @author saumya
 *
 */
public class LoginDaoImplementation implements LoginDaoInterface {

    private static volatile LoginDaoImplementation instance = null;

    public LoginDaoImplementation() {
    }

    public static LoginDaoImplementation getInstance() {
        if (instance == null) {
            synchronized (AdminDaoImplementation.class) {
                instance = new LoginDaoImplementation();
            }
        }
        return instance;
    }

    @Override
    public int getUserType(String userId) {
        // TODO Auto-generated method stub
        try {
            Connection con = DBUtils.getConnection();
            Statement stmt = con.createStatement();
            if (con == null) System.out.println("connection not established");
            PreparedStatement preparedStatement = con.prepareStatement("select role from user where userid = ?");
            preparedStatement.setString(1, userId);

            ResultSet rows = preparedStatement.executeQuery();

            if (rows.next()) {
                return rows.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        return 0;
    }

}
