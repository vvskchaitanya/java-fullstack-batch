package com.triveni.fullstack.my_first_spring_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.triveni.fullstack.my_first_spring_project.services.EmployeesService;

@Controller
public class EmployeesController {

    EmployeesService employeesService;
    
    public EmployeesController(EmployeesService employeesService) {
        System.out.println("EmployeesController class is being initialized");
        this.employeesService = employeesService;
    }

    @RequestMapping("/employees")
    public String employees(Model model){
        model.addAttribute("employees", employeesService.retrieve());
        System.out.println("User accessed employees endpoint.");
        return "employees";
    }


}
