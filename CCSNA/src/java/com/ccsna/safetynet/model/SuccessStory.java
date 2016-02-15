package com.ccsna.safetynet.model;
// Generated Oct 20, 2015 4:22:25 PM by Hibernate Tools 4.3.1

import com.ccsna.safetynet.Menu;
import java.util.Date;

/**
 * SuccessStory generated by hbm2java
 */
public class SuccessStory implements java.io.Serializable {

    private Integer ssId;
    private String full_name;
    private String content;
    private Date dateCreated;
    private String createdBy;
    private Date dateUpdated;
    private String updatedBy;
    private String approvedBy;
    private String approvalStatus;
    private String email;
    private String agency;

    public SuccessStory() {
    }

    public SuccessStory(String fullname, String email, String agency, String content, Date dateCreated, String createdBy) {
        this.full_name = fullname;
        this.email = email;
        this.agency = agency;
        this.content = content;
        this.dateCreated = dateCreated;
        this.createdBy = createdBy;
        this.approvalStatus = Menu.PENDING;
    }

    public Integer getSsId() {
        return this.ssId;
    }

    public void setSsId(Integer ssId) {
        this.ssId = ssId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateUpdated() {
        return this.dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * @return the approvedBy
     */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * @param approvedBy the approvedBy to set
     */
    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    /**
     * @return the approvalStatus
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * @param approvalStatus the approvalStatus to set
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the agency
     */
    public String getAgency() {
        return agency;
    }

    /**
     * @param agency the agency to set
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /**
     * @return the full_name
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     * @param full_name the full_name to set
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

}
