package com.teknorot.employeeinfo.dto;

import com.teknorot.employeeinfo.model.Employee;

import java.util.List;

public class DepartmentListDto {
    private Integer id;
    private String name;
    private String manager; // menager list tutmak iyi olabilir listelemek gerekebilir!
    private List<Employee> employee;
    private int totalDepartmentEmployee ; // total'i hesaplayıp show etmek istiyorum departmana göre

//    private CompanyListDto companyDto;
//    private List<EmployeeListDto> employeeDtos;

    public int getTotalDepartmentEmployee() {
        return totalDepartmentEmployee;
    }

    public void setTotalDepartmentEmployee(int totalDepartmentEmployee) {
        this.totalDepartmentEmployee = totalDepartmentEmployee;
    }

    public DepartmentListDto() {
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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }


}
