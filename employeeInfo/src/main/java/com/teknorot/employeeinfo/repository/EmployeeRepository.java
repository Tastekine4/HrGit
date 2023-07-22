package com.teknorot.employeeinfo.repository;

import com.teknorot.employeeinfo.model.Company;
import com.teknorot.employeeinfo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

  //  List<Employee> findAllByDepartmenId(int departmentNo);

}
