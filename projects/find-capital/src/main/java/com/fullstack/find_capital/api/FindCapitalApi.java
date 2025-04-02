package com.fullstack.find_capital.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.find_capital.dto.Payload;
import com.fullstack.find_capital.service.ICountryCapitalService;

@RestController
@RequestMapping("/findcapital")
public class FindCapitalApi {

    @Autowired
    ICountryCapitalService countryCapitalService;

    @GetMapping
    public Payload findCapital(@RequestParam(name="country",required = true) String country){
        String capital = countryCapitalService.getCapital(country);

        return capital!=null ? new Payload(country, capital, true) : new Payload(country, capital, false);
    }

}
