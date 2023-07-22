package com.teknorot.employeeinfo.repository;

import com.teknorot.employeeinfo.model.Company;
import com.teknorot.employeeinfo.model.PersonelInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonelInfoRepository extends JpaRepository<PersonelInfo,Integer> {
}
