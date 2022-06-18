package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public interface ProfessorDaoInterface {
    public ArrayList<Course> viewAvailableCoursesWithDB(Professor professor) throws SQLException;
    /**
     * Method for retrieving the students enrolled in a course using SQL commands
     *
     * @param courseId unique Id to represent a course
     * @return returns a list of strings indicating the students enrolled in a course from the database
     */
    public Map<String, ArrayList<String>> viewEnrolledStudentsWithDB(Professor professor) throws SQLException;
    /**
     * Method for adding the grades of a student for a course in a semester using SQL commands
     *
     * @param studentId unique Id to represent a student
     * @param courseId unique Id to represent a course
     * @param grade grade point provided for the student enrolled in the course taught by the professor
     * @param semester indicates the semester
     * @return returns a string indicating the if the grade was successfully added in the database
     */
    public void provideGrade(int courseId, String studentId, String Grade) throws SQLException;
    public Professor validateCredentialsWithDB(String userId, String password) throws ClassNotFoundException, SQLException;

    /**
     * Method to obtain the list of courses available
     *
     * @return returns the courses present in the database
     */
    public ArrayList<Course> viewCoursesWithDB() throws SQLException, ClassNotFoundException;

    /**
     * Method to check if the course is already alloted or not, and then to allot the course using SQL commands
     *
     * @param professorId unique Id to represent a professor
     * @param courseId unique Id to represent a course
     * @return returns a string that indicates if the course is successfully alloted in the database
     * @throws CourseNotFoundException if course with courseId not present in the database
     * @throws CourseNotAvailableException if course with courseId already alloted to some professor
     */
    public void registerCoursesWithDB(Professor professor, Course course) throws SQLException;



}
