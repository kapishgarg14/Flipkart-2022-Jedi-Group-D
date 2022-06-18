package com.flipkart.constants;

public class SQLQueriesConstants {
    /**
     * adding the user
     */
    public static final String ADD_REGISTERCOURSE_QUERY = "insert into registrar values (?, ?, ?, ?)";
    /**
     * adding the professor
     */
    public static final String ADD_PROFESSOR_QUERY = "insert into professor values(?,?,?)";
    /**
     * adding the student
     */
    public static final String ADD_STUDENT_QUERY = "insert into student values (?, ?, ?, ?, ?)";
    /**
     * adding the user
     */
    public static final String ADD_USER_QUERY = "insert into user values (?, ?, ?, ?, ?, ?)";
    /**
     * updating password
     */
    public static final String UPDATE_PASSWORD = "update user set password = ? where userid=?";

    /**
     * getting details
     */
    public static final String GET_DETAILS = "select userid,password from user where userid = ? and password = ?";
    /**
     * view grade card query
     */
    public static final String VIEW_GRADE_CARD = "select * from gradeCard where userId = ?";
    /**
     * view registered courses
     */
    public static final String VIEW_REGISTERED_COURSES = "select * from registrar where userId=? and registered = true";
}
