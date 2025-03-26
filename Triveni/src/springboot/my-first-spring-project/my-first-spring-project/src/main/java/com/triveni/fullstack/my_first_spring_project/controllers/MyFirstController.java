package com.triveni.fullstack.my_first_spring_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("Hello login page");
        return "login";
    }

    @RequestMapping("helloworld")
    public String helloworld(){
        System.out.println("From hello world");
        return "helloworld";
    }


}
