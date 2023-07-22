package com.teknorot.employeeinfo.dto;

import java.util.List;

public class EmployeeListDto {
    private Integer id;
    private String fullName;
    private String department_;
    private String position;
    private String email;
    private String phone;
    private int sicil_no;
    private boolean status; // Active working or not!
//    private DepartmentListDto departmentDto;
//    private List<PersonelInfoListDto> personelInfoDtos;



    public EmployeeListDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment_() {
        return department_;
    }

    public void setDepartment_(String department_) {
        this.department_ = department_;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
