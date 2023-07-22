package com.teknorot.employeeinfo.controller;

import com.teknorot.employeeinfo.model.Department;
import com.teknorot.employeeinfo.model.Employee;
import com.teknorot.employeeinfo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {


    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping("/employee")
    public String getEmployee(Model model1){ // model yaratıp
        List<Employee> employeeList = employeeService.getEmployee() ;
        model1.addAttribute("employee",employeeList);
        return "Employee";
    }
    @PostMapping("/employee/addNew")
    public String addNew(Employee employee){
        employee.setStatus("Active");
        employeeService.save(employee);
        return "redirect:/employee";
    }
    @RequestMapping("employee/findById")
    @ResponseBody
    public Optional<Employee>  findById(int id){
        return employeeService.findById(id);
    }
    @RequestMapping(value = "/employee/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Employee employee){
        employeeService.save(employee);
        return "redirect:/employee";
    }
    @RequestMapping(value = "/employee/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        employeeService.delete(id);
        return "redirect:/employee";
    }
}
