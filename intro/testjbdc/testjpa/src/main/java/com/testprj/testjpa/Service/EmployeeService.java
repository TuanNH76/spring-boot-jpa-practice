package com.testprj.testjpa.Service;

import com.testprj.testjpa.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService  {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);

    Employee createEmployee(Employee employee);
    void saveEmployee(Employee employee);
    void deleteEmployeeById(int id);

    List<Employee> findAllByAge(int age);
}
