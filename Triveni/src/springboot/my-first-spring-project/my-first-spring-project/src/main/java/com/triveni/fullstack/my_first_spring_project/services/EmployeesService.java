package com.triveni.fullstack.my_first_spring_project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.triveni.fullstack.my_first_spring_project.models.Employee;

@Service
public class EmployeesService {
    
    // public EmployeesService(){
    //     System.out.println("EmployeesService class is being initialized");
    // }

    public List<Employee> retrieve(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Dharshan", "CSE", "darshan@cs.com"));
        employees.add(new Employee(102, "Amardeep", "IT", "amardeep@it.com"));
        employees.add(new Employee(103, "Sudharshan", "ECE", "sudarshan@ece.com"));
        employees.add(new Employee(104, "Preetham", "EEE", "preetham@eee.com"));
        employees.add(new Employee(105, "Hareesh", "Civil", "hareesh@civil.com"));

        return employees;
    }

}
