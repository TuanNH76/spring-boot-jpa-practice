package com.testprj.testjpa.repository;

import com.testprj.testjpa.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("SELECT u FROM Employee u WHERE u.age = :age")
    List<Employee> findAllEmployeeByAge(@Param("age") Integer age);

}
