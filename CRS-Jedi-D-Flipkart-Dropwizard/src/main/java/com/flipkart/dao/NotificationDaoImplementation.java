package com.flipkart.dao;

import com.flipkart.constants.NotificationType;
import com.flipkart.utils.DBUtils;

import java.sql.*;

import static com.flipkart.constants.NotificationType.REGISTRATION_APPROVAL;

public class NotificationDaoImplementation implements NotificationDaoInterface {
    @Override
    /**
     * @parmams userID, Notification
     * adds an entry to notification table of the dbms
     */
    public void insertNotification(String userID, NotificationType notificationType) throws SQLException {
        String sql = "insert into notification (userID, message) values (?, ?);";
        Connection conn = DBUtils.getConnection();
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, userID);

        if(notificationType == REGISTRATION_APPROVAL){
            statement.setString(2, "Registration Approoved");
        }
        else{
            statement.setString(2, "Payment Done");
        }

        statement.executeUpdate();
    }

    /**
     *
     * @param userID
     * @throws SQLException
     * returms all notification
     */
    @Override
    public void getAllNotifications(String userID) throws SQLException {
        String sql = "select * from notification where userID = ?;";
        Connection conn = DBUtils.getConnection();
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, userID);
        ResultSet res = statement.executeQuery();
        while (res.next()){
            System.out.println(res.getString(2));
        }
    }
}
