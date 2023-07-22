package com.teknorot.employeeinfo.dto;

import com.teknorot.employeeinfo.model.Department;
import com.teknorot.employeeinfo.model.Employee;

import java.util.List;


public class CompanyListDto {
    private Integer id;
    private String name;
    private String location;
    // Departman sayısı olmalı
    // çalışan total olmalı!
    private int departmentTotal;
    private int employeeTotal;
    private EmployeeListDto employeeDto;
    private List<Department> departments;
    private List<Employee> employeeList;


    public CompanyListDto() {
    }

    public int getDepartmentTotal() {
        return departmentTotal;
    }

    public void setDepartmentTotal(int departmentTotal) {
        this.departmentTotal = departmentTotal;
    }

    public int getEmployeeTotal() {
        return employeeTotal;
    }

    public void setEmployeeTotal(int employeeTotal) {
        this.employeeTotal = employeeTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public EmployeeListDto getEmployeeDto() {
        return employeeDto;
    }

    public void setEmployeeDto(EmployeeListDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
