package com.teknorot.employeeinfo.service;

import com.teknorot.employeeinfo.dto.CompanyListDto;
import com.teknorot.employeeinfo.model.Company;
import com.teknorot.employeeinfo.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    //Return list of all companies
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }
/*
    // Autowired eski kullanım artık kullanılmıyor diye final kullanmak daha mantıklı!
    private final CompanyRepository companyRepository; // initial değeri olması lazım ve bu değiştirilemez deniliyor!
    private EmployeeService employeeService;

    public CompanyService(CompanyRepository companyRepository, EmployeeService employeeService) {
        this.companyRepository = companyRepository;
        this.employeeService = employeeService;
    }
    private int totalEmployee = employeeService.getEmployee().size();

    private CompanyListDto convertEntityToDto(Company company){
        CompanyListDto companyListDto = new CompanyListDto();
        companyListDto.setId(company.getId());
        companyListDto.setName(company.getName());
        companyListDto.setLocation(company.getLocation());
        companyListDto.setDepartmentTotal(company.getDepartments().size());
        companyListDto.setEmployeeTotal(totalEmployee);
        return companyListDto;
    }
        public List<Company> getAllCompanies(){
            return companyRepository.findAll();
        }
*/

}