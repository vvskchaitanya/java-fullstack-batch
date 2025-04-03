package com.fullstack.find_capital.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fullstack.find_capital.dto.CountryCapitalObject;
import com.fullstack.find_capital.dto.CountryCapitalResponse;


/**
 * This class implements getCountry using POST method of Downstream service
 */
@Service
public class CountryCapitalServiceNew implements ICountryCapitalService{

    @Value("${countryCapitalService}")
    String countryCapitalEndpoint;

    @Override
    public String getCapital(String country) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(countryCapitalEndpoint+"/q?country="+country, String.class);

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(Feature.IGNORE_UNKNOWN);

        try{

            CountryCapitalResponse<CountryCapitalObject> countryCapitalObject = objectMapper.readValue(responseEntity.getBody(), new TypeReference<CountryCapitalResponse<CountryCapitalObject>>(){});

            if(countryCapitalObject.getData() != null){
                return countryCapitalObject.getData().getCapital();
            }

        } catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        return null;
    }

}
