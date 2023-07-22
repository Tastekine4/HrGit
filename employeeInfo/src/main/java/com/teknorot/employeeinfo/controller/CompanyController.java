package com.teknorot.employeeinfo.controller;

import com.teknorot.employeeinfo.model.Company;
import com.teknorot.employeeinfo.model.Department;
import com.teknorot.employeeinfo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CompanyController {


    private CompanyService companyService;
   public CompanyController(CompanyService companyService) {
       super();
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public String getCompany(Model model){ // model yaratıp company'leri ona aktarıyoruz.
        List<Company> companyList = companyService.getAllCompany();
        model.addAttribute("companies",companyList);
        return "Company";
    }
    @GetMapping("/manager")
    public String getManager(){
        return "Manager";
    }
    @GetMapping("/index")
    public String listCompanies(){
        return "index";
    }
}