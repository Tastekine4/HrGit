package com.teknorot.employeeinfo.service;

import com.teknorot.employeeinfo.dto.EmployeeListDto;
import com.teknorot.employeeinfo.dto.PersonelInfoListDto;
import com.teknorot.employeeinfo.model.Employee;
import com.teknorot.employeeinfo.model.PersonelInfo;
import com.teknorot.employeeinfo.repository.CompanyRepository;
import com.teknorot.employeeinfo.repository.PersonelInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonelInfoService {


    private final PersonelInfoRepository personelInfoRepository;

    public PersonelInfoService(PersonelInfoRepository personelInfoRepository) {
        this.personelInfoRepository = personelInfoRepository;
    }
    /*
    private PersonelInfoListDto convertEntityToDto(PersonelInfo personelInfo){
        PersonelInfoListDto personelInfoListDto = new PersonelInfoListDto();
        personelInfoListDto.setId(personelInfo.getId());
        personelInfoListDto.setFirstName(personelInfo.getFirstName());
        personelInfoListDto.setLastName(personelInfo.getLastName());
        personelInfoListDto.setGender(personelInfo.getGender());
        personelInfoListDto.setBirthday(personelInfo.getBirthday());
        personelInfoListDto.setPhone(personelInfo.getPhone());
        personelInfoListDto.setSicil_no(personelInfo.getSicil_no());
        personelInfoListDto.setHomeAddress(personelInfo.getHomeAddress());
        personelInfoListDto.setWorkAddress(personelInfo.getWorkAddress());
        personelInfoListDto.setHiredDate(personelInfo.getHiredDate());

        return personelInfoListDto;

    }
*/
}

