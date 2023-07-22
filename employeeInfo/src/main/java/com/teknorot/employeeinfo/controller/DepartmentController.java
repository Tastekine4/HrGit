package com.teknorot.employeeinfo.controller;

import com.teknorot.employeeinfo.model.Company;
import com.teknorot.employeeinfo.model.Department;
import com.teknorot.employeeinfo.model.Employee;
import com.teknorot.employeeinfo.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class DepartmentController {

    private DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService){
        this.departmentService= departmentService;
    }
    // Show departments
    @GetMapping("/departments")
    public String getDepartments(Model model1){ // model yaratıp company'leri ona aktarıyoruz.
        List<Department> departmentList = departmentService.getAllDepartment() ;
        model1.addAttribute("departments",departmentList);
        return "Department";
    }
    // add department
    @PostMapping("/departments/addNew")
    public String addNew(Department department){
      //  department.setCompany(new Company(1,"Teknorot"));
        System.out.println(department + "heyyyyyyyyyyy");

        // Burada manuel değer giriyoruz bunları değiştir otomatik alsın
        department.setTotalEmployeeOfDepartment(23);
    //    department.getCompany().setId(1);
        departmentService.save(department);
        return "redirect:/departments";
    }
    // findb
    @RequestMapping("/departments/findById")
    @ResponseBody
    public Optional<Department> findById(int id){
        System.out.println("İçerdeyim bull");
        return departmentService.findById(id);
    }
    @RequestMapping(value = "/departments/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Department department){
        departmentService.save(department);
        return "redirect:/departments";
    }
    @RequestMapping(value = "/departments/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        departmentService.delete(id);
        return "redirect:/departments";
    }
}
