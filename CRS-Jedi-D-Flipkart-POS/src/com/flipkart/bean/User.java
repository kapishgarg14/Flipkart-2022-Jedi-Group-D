package com.flipkart.bean;

public class User {
    private String userId;
    private String userName;
    private String emailId;
    private String password;
    private String contactNo;

    public User() {
    }

    /**
     * @param userId
     * @param userName
     * @param emailId
     * @param password
     * @param contactNo
     */
    public User(String userId, String userName, String emailId, String password, String contactNo) {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.contactNo = contactNo;
    }

    /**
     *
     * @return user if
     */
    public String getUserId() {
        return userId;
    }

    /**
     * updates user id
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     *
     * @return user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * update user name
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return email id of user
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * updates email id
     * @param emailId
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     *
     * @return login password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     * update password in dbms
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return contact number of the user
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     *
     * @param contactNo
     * amend contact no
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
