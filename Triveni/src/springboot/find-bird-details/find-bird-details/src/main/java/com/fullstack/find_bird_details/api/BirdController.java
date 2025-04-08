package com.fullstack.find_bird_details.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.find_bird_details.service.IBirdsDetailsService;

@RestController
@RequestMapping("/birdsdetails")
public class BirdController {

    @Autowired
    @Qualifier("birdsDetailsService")
    IBirdsDetailsService birdsDetailsService;

    @Autowired
    @Qualifier("specificBirdDetailsService")
    IBirdsDetailsService specificBirdDetailsService;

    @GetMapping
    public String findbirddetails(@RequestParam(name="name", required = true) String name){
        return specificBirdDetailsService.getBirdDetails(name);
    }

}
