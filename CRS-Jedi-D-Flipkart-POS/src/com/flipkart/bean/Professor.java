package com.flipkart.bean;

public class Professor extends User {
    private String professorId;
    private String areaOfExpertise;
    private int yearsOfExperience;

    /**
     * return Professor Constructor
     */
    public Professor() {
        this.professorId = professorId;
        this.areaOfExpertise = areaOfExpertise;
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * @param userId
     * @param userName
     * @param emailId
     * @param password
     * @param contactNo
     * @param professorId
     * @param areaOfExpertise
     * @param yearsOfExperience
     */
    public Professor(String userId, String userName, String emailId, String password, String contactNo, String professorId, String areaOfExpertise, int yearsOfExperience) {
        super(userId, userName, emailId, password, contactNo);
        this.professorId = professorId;
        this.areaOfExpertise = areaOfExpertise;
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * @return id of professor from dbms
     */
    public String getProfessorId() {
        return professorId;
    }

    /**
     *
     * @param professorId sets professor id
     */
    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    /**
     *
     * @return areo of expertise of professor
     * @ex AI, ML, DBMS
     */
    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    /**
     *
     * @param areaOfExpertise
     * @sets AI, ML, DBMS
     */
    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    /**
     *
     * @return areo of expertise of professor
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * sets the year of experience of professor
     * @param yearsOfExperience
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
