package com.axis.entity;

import javax.persistence.*;

@Entity
public class Admin {
    private String adminname;
    private String adminemailId;
    private String adminPassword;
    @Id
    private long mobileNo;

    public Admin() {
    }

    public Admin(String adminname, String adminemailId, String adminPassword, long mobileNo) {
        this.adminname = adminname;
        this.adminemailId = adminemailId;
        this.adminPassword = adminPassword;
        this.mobileNo = mobileNo;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminemailId() {
        return adminemailId;
    }

    public void setAdminemailId(String adminemailId) {
        this.adminemailId = adminemailId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminname='" + adminname + '\'' +
                ", adminemailId='" + adminemailId + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }

}
