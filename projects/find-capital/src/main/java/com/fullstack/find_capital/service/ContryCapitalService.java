package com.fullstack.find_capital.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fullstack.find_capital.dto.CountryCapitalObject;
import com.fullstack.find_capital.dto.CountryCapitalResponse;

/**
 * This class implements getCountry using GET method of Downstream service
 */

@Service
public class ContryCapitalService implements ICountryCapitalService{

    @Value("${countryCapitalService}")
    String countryCapitalEndpoint;

    @Override
    public String getCapital(String country) {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(countryCapitalEndpoint, String.class);

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(Feature.IGNORE_UNKNOWN);

        try{

        CountryCapitalResponse<List<CountryCapitalObject>> countryCapitalObjectResponse = objectMapper.readValue(responseEntity.getBody(), new TypeReference<CountryCapitalResponse<List<CountryCapitalObject>>>(){});

        Optional<CountryCapitalObject> countryCapitalObject = countryCapitalObjectResponse.getData().stream().filter(object->{
            return object.getName().equalsIgnoreCase(country);
        }).findAny();
       
        if(countryCapitalObject.isPresent()){
            return countryCapitalObject.get().getCapital();
        }

          } catch(IOException ioe){
            ioe.printStackTrace();
        }

        return null;


    }

   

}
