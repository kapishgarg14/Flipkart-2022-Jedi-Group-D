package com.flipkart.dao;

public interface UserDBInterface {
    public String ifUserExist(String userEmail, String password);
    public int getUserID(String userEmail, String password);
}
