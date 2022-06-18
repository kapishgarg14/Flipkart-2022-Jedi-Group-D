package com.flipkart.bean;

public class Admin extends User {
    private String adminId;
    private String instituteName;

    /**
     * @param userId
     * @param userName
     * @param emailId
     * @param password
     * @param contactNo
     * @param adminId
     * @param instituteName
     */
    public Admin(String userId, String userName, String emailId, String password, String contactNo, String adminId, String instituteName) {
        super(userId, userName, emailId, password, contactNo);
        this.adminId = adminId;
        this.instituteName = instituteName;
    }
    /**
     * @return the adminId
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * @param adminId
     * 	sets admin id
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    /**
     * @return the Institue name
     */
    public String getInstituteName() {
        return instituteName;
    }

    /**
     * @param instituteName
     */
    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
}
