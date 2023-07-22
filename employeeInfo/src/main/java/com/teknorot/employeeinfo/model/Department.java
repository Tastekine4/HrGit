package com.teknorot.employeeinfo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //Auto mu identity mi kullanayım?
    private Integer id;

    private String name;
    private String location;
    private String manager; // Bunu list olarak tutmak gerekiyor olabilir!
    private int totalEmployeeOfDepartment;



    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "companyid",insertable = false,updatable = false)
    private Company company;


    @OneToMany(mappedBy = "department",fetch = FetchType.EAGER) // bunun adı "department" aynı olmalı employee classındaki yerle

    private List<Employee> employee;

    public Department(Integer id){
        if (id ==1){
            this.id = id;
          //  this.name = "IT";
        }
    }

    public Department(Integer id, String name, String location, Company company) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.company = company;
    }

    public Department(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {

    }
    public int getTotalEmployeeOfDepartment() {
        return totalEmployeeOfDepartment;
    }

    public void setTotalEmployeeOfDepartment(int totalEmployeeOfDepartment) {
        this.totalEmployeeOfDepartment = totalEmployeeOfDepartment;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(location,
                that.location) && Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, company);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Company getCompany() {
        return company;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", company=" + company +
                '}';
    }
}
