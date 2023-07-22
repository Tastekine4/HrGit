package com.teknorot.employeeinfo.service;

import com.teknorot.employeeinfo.model.Department;
import com.teknorot.employeeinfo.model.Employee;
import com.teknorot.employeeinfo.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    //Return list of all companies
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

        //add department
    public void save(Department department) {
        departmentRepository.save(department);
    }

    public Optional<Department> findById(int id) {
        return departmentRepository.findById(id);

    }

    public void delete(Integer id) {
        departmentRepository.deleteById(id);
    }
/*
    private final DepartmentRepository departmentRepository;
    private final EmployeeService employeeService;
    public DepartmentService(DepartmentRepository departmentRepository,EmployeeService employeeService) {
        this.departmentRepository = departmentRepository;

        this.employeeService = employeeService;
    }


    private DepartmentListDto convertEntityToDto(Department department){
        DepartmentListDto departmentListDto = new DepartmentListDto();
        departmentListDto.setId(department.getId());
        departmentListDto.setName(department.getName());
        departmentListDto.setManager(department.getManager());
        departmentListDto.setTotalDepartmentEmployee(employeeService.getDepartmentEmployee(department.getId()).size());
        return departmentListDto;
    }


*/

    }
























