package com.triveni.fullstack.employees.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.triveni.fullstack.employees.entity.Employee;
import com.triveni.fullstack.employees.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> get(){
        return this.employeeRepository.findAll();
    }

    public List<Employee> get(String department){
        return this.employeeRepository.findByDepartment(department);
    }

    public Employee add(Employee employee){
        return this.employeeRepository.save(employee);
    }

    public boolean delete(Integer id){
        this.employeeRepository.deleteById(id);
        return true;
    }
}
