package com.vvsk.fullstack.my_first_spring_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vvsk.fullstack.my_first_spring_project.services.StudentsService;

@Controller
public class StudentsController {

    StudentsService studentsService;

    public StudentsController(StudentsService studentsService){
        System.out.println("StudentsController class is being initalizaed by Spring Framework because of @Controller");
        this.studentsService = studentsService;
    }

    @RequestMapping("students")
    public String students(Model model){
        model.addAttribute("students", studentsService.retrieve());
        System.out.println("User tried to access students endpoint");
        return "students";
    }

}
