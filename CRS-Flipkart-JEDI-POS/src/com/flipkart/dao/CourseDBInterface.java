package com.flipkart.dao;

public interface CourseDBInterface {

    public void viewCourses();
    public void addCourses(int courseID, int userID);
    public void dropCourses(int courseID, int userID);
}
