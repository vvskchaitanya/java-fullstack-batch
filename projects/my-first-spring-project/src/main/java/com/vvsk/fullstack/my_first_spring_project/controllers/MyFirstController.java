package com.vvsk.fullstack.my_first_spring_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController {

    @RequestMapping("hellworld")
    public String helloworld(){
        System.out.println("User is trying to access /helloworld");
        return "helloworld";
    }

    @RequestMapping("hellworld2")
    public String helloworld2(){
        System.out.println("User is trying to access /helloworld2");
        return "search";
    }

    @RequestMapping("/hellworld3")
    public String helloworld3(){
        System.out.println("User is trying to access /helloworld3");
        return "helloworld";
    }



}
