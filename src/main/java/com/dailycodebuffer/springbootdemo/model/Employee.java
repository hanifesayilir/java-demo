package com.dailycodebuffer.springbootdemo.model;

public class Employee {

    private String emloyeeId;
    private String firstName;

    public String getEmloyeeId() {
        return emloyeeId;
    }

    public void setEmloyeeId(String emloyeeId) {
        this.emloyeeId = emloyeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String lastName;
    private String emailId;
    private String department;
}
