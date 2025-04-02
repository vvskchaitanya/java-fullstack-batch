package com.fullstack.find_capital.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fullstack.find_capital.dto.CountryCapitalObject;
import com.fullstack.find_capital.dto.CountryCapitalResponse;

@Service
public class ContryCapitalService implements ICountryCapitalService{

    @Value("${countryCapitalService}")
    String countryCapitalEndpoint;

    @Override
    public String getCapital(String country) {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<CountryCapitalResponse> responseEntity = restTemplate.getForEntity(countryCapitalEndpoint, CountryCapitalResponse.class);

        Optional<CountryCapitalObject> countryCapitalObject = responseEntity.getBody().getData().stream().filter(object->{
            return object.getName().equalsIgnoreCase(country);
        }).findAny();
       
        if(countryCapitalObject.isPresent()){
            return countryCapitalObject.get().getCapital();
        }else{
            return null;
        }


    }

   

}
