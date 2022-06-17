package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;

public interface AdminDaoInterface {
    /**
     * dropCourse using database
     * @param courseId
     * @return
     */
    boolean dropCourse(int courseId);
    /**
     * approve students from DB using SQL commands
     * @return
     */
    boolean approveStudents();
    /**
     * validate credentials
     * @param adminId
     * @param password
     * @return
     */
    boolean validateCredentials(String adminId, String password);

    void registerCourse() throws Exception;
    default boolean addProfessor(Professor professor) {
        return false;
    }
    /**
     * add course to Database
     * @param course
     * @return status true or false
     */
    boolean addCourse(Course course);



//    ArrayList<Grade> fetchGrade(int userId);
}
