package com.sruthi.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sruthi.employeemanagement.entity.Employee;
import com.sruthi.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }
}