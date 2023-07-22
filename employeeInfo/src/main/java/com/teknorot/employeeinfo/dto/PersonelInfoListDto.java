package com.teknorot.employeeinfo.dto;

import java.text.SimpleDateFormat;

public class PersonelInfoListDto {
    private Integer id;

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private SimpleDateFormat birthday; //("yyyy-MM-dd" formatında )
    private String phone;
    private int sicil_no;
    private String homeAddress;
    private String workAddress;
    private SimpleDateFormat hiredDate;

    public PersonelInfoListDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public SimpleDateFormat getBirthday() {
        return birthday;
    }

    public void setBirthday(SimpleDateFormat birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSicil_no() {
        return sicil_no;
    }

    public void setSicil_no(int sicil_no) {
        this.sicil_no = sicil_no;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public SimpleDateFormat getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(SimpleDateFormat hiredDate) {
        this.hiredDate = hiredDate;
    }
}
