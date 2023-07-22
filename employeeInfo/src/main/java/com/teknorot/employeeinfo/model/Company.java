package com.teknorot.employeeinfo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.persistence.GenerationType;
import java.util.List;
import java.util.Objects;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //Auto mu identity mi kullanayım?
    private Integer id;
    private String name;
    private String location;
        @OneToMany(mappedBy ="company",fetch = FetchType.EAGER)
    private List<Department> departments;


    public Company(Integer id, String name, String location, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.departments = departments;
    }

    public Company(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Company(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(location, company.location) && Objects.equals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, departments);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", departments=" + departments +
                '}';
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

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}

