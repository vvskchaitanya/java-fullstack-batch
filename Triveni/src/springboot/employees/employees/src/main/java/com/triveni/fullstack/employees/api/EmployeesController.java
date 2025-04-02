package com.triveni.fullstack.employees.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.triveni.fullstack.employees.entity.Employee;
import com.triveni.fullstack.employees.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    
    private EmployeeService employeeService;
    public EmployeesController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<Employee> get(){
        return this.employeeService.get();
    }
    @GetMapping("/{department}")
    public List<Employee> get(@PathVariable String department){
        return this.employeeService.get(department);
    }
    @PostMapping
    public Integer save(@RequestBody Employee employee){
        return this.employeeService.add(employee).getId();
    }
    @DeleteMapping
    public boolean save(@RequestParam Integer id){
        return this.employeeService.delete(id);
    }
}
