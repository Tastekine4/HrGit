package com.teknorot.employeeinfo.repository;

import com.teknorot.employeeinfo.model.Company;
import com.teknorot.employeeinfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {


}
