package com.example.myfirstproject.employeeentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AccountingApplication {

    @Id
    private int aid;
    private String aname;
    private String apassword;
    public AccountingApplication(int aid, String aname, String apassword) {
        this.aid = aid;
        this.aname = aname;
        this.apassword = apassword;
    }
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getApassword() {
        return apassword;
    }
    public void setApassword(String apassword) {
        this.apassword = apassword;
    }
    public AccountingApplication() {
    }
}