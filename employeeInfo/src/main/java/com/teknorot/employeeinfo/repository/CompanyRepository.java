package com.teknorot.employeeinfo.repository;

import com.teknorot.employeeinfo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository <Company,Integer> {

}
