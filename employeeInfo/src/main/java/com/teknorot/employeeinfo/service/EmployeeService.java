package com.teknorot.employeeinfo.service;

import com.teknorot.employeeinfo.model.Company;
import com.teknorot.employeeinfo.model.Employee;
import com.teknorot.employeeinfo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //Return List of Employee
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public void save(Employee employee) {

        /*
        if (employee.getDepartment().getName().equals("Bilişim Teknolojileri")) {
            System.out.println("İçerdesin!!!!");
         //  employee.getDepartment().setId(1);
         //  employee.getDepartment().
        }
        else if (employee.getDepartment().getName().equals("Sales")) {
           // employee.getDepartment().setId(2);
        }
        else if (employee.getDepartment().getName().equals("HR")) {
          //  employee.getDepartment().setId(3);
        }
        // Company company = new
       // employee.getDepartment().setCompany();
        System.out.println(employee.getDepartment().getCompany()+" heyyyyyyyyyyyyyyyy");
       // employee.getDepartment().setCompany(new Company(1,"Teknorot","Skyland"));
       */
        employeeRepository.save(employee);
    }

    // find By ID
    public Optional<Employee> findById(int id){
        return employeeRepository.findById(id);
    }

    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }



/*
    // Finding employee total depending on department

    public List<Employee> getDepartmentEmployee(int departmentNo){
        return employeeRepository.findAllByDepartmenId(departmentNo);
    }


    // Save new Employee
    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    //Finding employee by ID **
    public Employee findEmployeeById(Integer id){
        return employeeRepository.findById(id).orElseThrow(()->
                new EmployeeNotFoundException("Customer Could not find by id"+id));
    }

    private EmployeeListDto convertEntityToDto(Employee employee){
        String fullName = employee.getFirstName()+employee.getLastName();
        EmployeeListDto employeeListDto = new EmployeeListDto();
        employeeListDto.setId(employee.getId());
        employeeListDto.setFullName(fullName);
        employeeListDto.setDepartment_(employee.getDepartment().getName());
        employeeListDto.setPosition(employee.getPosition());
        employeeListDto.setEmail(employee.getEmail());
        employeeListDto.setPhone(employee.getPhone());
        employeeListDto.setSicil_no(employee.getSicil_no());
        return employeeListDto;
    }

*/

}
