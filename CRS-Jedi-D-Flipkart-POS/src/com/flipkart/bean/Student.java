package com.flipkart.bean;

public class Student extends User {

    private String userId;
    private int semester;
    private String grade;
    private String feeStatus;
    private boolean isApproved;

    /**
     * @param userId
     * @param userName
     * @param emailId
     * @param password
     * @param contactNo
     * @param userId1
     * @param semester
     * @param grade
     * @param feeStatus
     * @param isApproved
     */
    public Student(String userId, String userName, String emailId, String password, String contactNo, String userId1, int semester, String grade, String feeStatus, boolean isApproved) {
        super(userId, userName, emailId, password, contactNo);
        this.userId = userId1;
        this.semester = semester;
        this.grade = grade;
        this.feeStatus = feeStatus;
        this.isApproved = isApproved;
    }
    /**
     * @return the studentEnrollmentId
     *
     */
    @Override
    public String getUserId() {
        return userId;
    }

    /**
     * @param studentEnrollmentId the studentEnrollmentId to set
     */
    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     *
     * @return the semester student is enrolled in
     */
    public int getSemester() {
        return semester;
    }

    /**
     * sets the semester of the student
     * @param semester
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     *
     * @return grade of student
     * @example 1,2,3,4,...,9,10
     */
    public String getGrade() {
        return grade;
    }

    /**
     * sets the grade of student
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     *
     * @return fee Status
     * paid or not
     */
    public String isFeeStatus() {
        return feeStatus;
    }

    /**
     * sets the fee status
     * @param feeStatus
     */
    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus;
    }

    /**
     *
     * @return approval status
     * to be set by admin
     */
    public boolean isApproved() {
        return isApproved;
    }

    /**
     *
     * @param isApproved changing the approval
     */
    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
}
