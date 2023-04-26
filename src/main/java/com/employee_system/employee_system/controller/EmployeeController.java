package com.employee_system.employee_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_system.employee_system.models.Employee;
import com.employee_system.employee_system.repo.EmployeeRepo;

@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {
    @Autowired 
     private EmployeeRepo employeeRepo;

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeRepo.findAll();
    }
}
