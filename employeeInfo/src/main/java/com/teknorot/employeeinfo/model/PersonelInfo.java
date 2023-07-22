package com.teknorot.employeeinfo.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class PersonelInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //Auto mu identity mi kullanayım?
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



    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    public PersonelInfo(int sicil_no,String firstName,String lastName) {
        this.sicil_no = sicil_no;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public PersonelInfo(Integer id, String firstName, String lastName,
                        int age, String gender, SimpleDateFormat birthday, String phone,
                        int sicil_no, String homeAddress, String workAddress, SimpleDateFormat hiredDate,
                        Employee employee) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.sicil_no = sicil_no;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.hiredDate = hiredDate;
        this.employee = employee;

    }

    public PersonelInfo(){

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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "PersonelInfo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", sicil_no=" + sicil_no +
                ", homeAddress='" + homeAddress + '\'' +
                ", workAddress='" + workAddress + '\'' +
                ", hiredDate=" + hiredDate +
                ", employee=" + employee +
                '}';
    }


}
