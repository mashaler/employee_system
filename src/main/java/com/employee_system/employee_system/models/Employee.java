package com.employee_system.employee_system.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String contactNo;

    
    public Employee(int empId, String firstName, String lastName, String email, String department, String contactNo) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.contactNo = contactNo;
     }

     @Id
     @GeneratedValue
     public int getEmpId() {
         return empId;
     }
     public void setEmpId(int empId) {
         this.empId = empId;
     }
     public String getFirstName() {
         return firstName;
     }
     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     public String getLastName() {
         return lastName;
     }
     public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     public String getEmail() {
         return email;
     }
     public void setEmail(String email) {
         this.email = email;
     }
     public String getDepartment() {
         return department;
     }
     public void setDepartment(String department) {
         this.department = department;
     }
     public String getContactNo() {
         return contactNo;
     }
     public void setContactNo(String contactNo) {
         this.contactNo = contactNo;
     }

}
