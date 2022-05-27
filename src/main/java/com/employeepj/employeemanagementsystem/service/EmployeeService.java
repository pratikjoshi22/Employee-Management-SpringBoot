package com.employeepj.employeemanagementsystem.service;

import com.employeepj.employeemanagementsystem.model.Employee;


import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
