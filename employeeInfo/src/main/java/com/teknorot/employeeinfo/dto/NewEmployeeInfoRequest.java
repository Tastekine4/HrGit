package com.teknorot.employeeinfo.dto;

import java.text.SimpleDateFormat;

public class NewEmployeeInfoRequest {
    private int sicilNo;
    private String firstName;
    private String lastName;
    private SimpleDateFormat hiredDate;


    public NewEmployeeInfoRequest() {
    }

    public NewEmployeeInfoRequest(int sicilNo, String firstName, String lastName, SimpleDateFormat hiredDate) {
        this.sicilNo = sicilNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiredDate = hiredDate;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
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

    public SimpleDateFormat getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(SimpleDateFormat hiredDate) {
        this.hiredDate = hiredDate;
    }
}
