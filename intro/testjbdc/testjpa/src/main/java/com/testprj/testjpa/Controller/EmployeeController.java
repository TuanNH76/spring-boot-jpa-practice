package com.testprj.testjpa.Controller;

import com.testprj.testjpa.Entity.Employee;
import com.testprj.testjpa.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/get-all-employee-api")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get-employee-by-id/{id}")
    public Employee getEmployeeByID(@PathVariable("id") Integer id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/create-employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("/delete-employee/{id}")
    public void deleteEmployee(@PathVariable("id") Integer id){
        employeeService.deleteEmployeeById(id);
    }

    @GetMapping("/find-by-age/{age}")
    public List<Employee> findAllByAge(@PathVariable("age") Integer age){
        return employeeService.findAllByAge(age);
    }
}
