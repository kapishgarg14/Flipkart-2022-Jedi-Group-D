package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.GradeCard;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseAlreadyRegisteredException;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDaoInterface {
    String addStudent() throws SQLException, ClassNotFoundException;

    Student getStudent(String studentId) throws SQLException;
    /**
     * Method to validate credentials.
     *
     * @param student id of the student, password of student
     * @return returns student object
     */
    Student validateCredentials(String studentId, String password);
    /**
     * Method to check the payment status of a student
     *
     * @param student id of the student
     * @return returns true if student has completed the payment
     */
    String getfeeStatus(String studentId) throws SQLException;
    /**
     * Method to get list of registered courses list.
     *
     * @param student id of the student
     * @return returns list of courseID.
     */
    ArrayList<Integer> registeredCoursesList(String studentId) throws SQLException;
    /**
     * Method to register courses .
     *
     * @param student id of the student , list of courseID to be registered.
     * @return
     */
    void registerCourses(String studentId, ArrayList<Integer> courses) throws SQLException, CourseAlreadyRegisteredException;

    /**
     * View list of courses .
     * @return list of courses of student.
     * @throws SQLException
     */
    ArrayList<Course> viewCourses() throws SQLException;

    Course viewCourse(int courseId) throws SQLException;

    String removeStudent(String studentId) throws SQLException;
    /**
     * Method to view grade card
     *
     * @param student id of the student
     * @param course if of the course to be added
     * @return returns a grade card
     */
    ArrayList<GradeCard> viewGrades(String studentId) throws SQLException;

}
