package com.employee_system.employee_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_system.employee_system.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
    
}
