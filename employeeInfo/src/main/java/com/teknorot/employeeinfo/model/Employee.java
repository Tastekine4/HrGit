package com.teknorot.employeeinfo.model;

import jdk.jfr.Enabled;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Objects;
import javax.persistence.*;
import java.util.Objects;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //Auto mu identity mi kullanayım?
    private Integer id;

    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int sicil_no;
    private String status; // Active working or not!

    @ManyToOne(fetch = FetchType.EAGER,optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentid",nullable = false)
    private Department department; // bu department ismi Department class'ındakiyle aynı olmalı
    @OneToOne(mappedBy = "employee")
    private PersonelInfo personelInfo;

    public Employee() {
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName,
                position, email, phone, sicil_no, status, department, personelInfo);
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public PersonelInfo getPersonelInfo() {
        return personelInfo;
    }

    public void setPersonelInfo(PersonelInfo personelInfo) {
        this.personelInfo = personelInfo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sicil_no=" + sicil_no +
                ", status=" + status +
                ", department=" + department +
                ", personelInfo=" + personelInfo +
                '}';
    }
}
