package com.flipkart.dao;

import java.sql.SQLException;

public interface PaymentDaoInterface {
    /**
     * update fee status
     * @param studentId
     * @throws SQLException
     */
    void updateFeeStatus(String studentId) throws SQLException;
    /**
     * Update payment table in the DB
     * @param paymentId
     * @param paymentType
     * @throws SQLException
     */
    void insertIntoPayment(String paymentId, String paymentType) throws SQLException;
    void insertIntoBookkeeper(String paymentId, String paymentType, int semester) throws SQLException;

}
