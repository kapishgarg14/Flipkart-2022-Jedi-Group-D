package com.flipkart.dao;

import com.flipkart.constants.NotificationType;

import java.sql.SQLException;

public interface NotificationDaoInterface {
    public void insertNotification(String userID, NotificationType notificationType) throws SQLException;
    public void getAllNotifications(String userID) throws SQLException;
}
