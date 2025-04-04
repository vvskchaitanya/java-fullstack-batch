package com.fullstack.find_bird_details.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fullstack.find_bird_details.dto.BirdsDetailsObject;

@Service
public class BirdsDetailsService implements IBirdsDetailsService{

    @Value("${birdsDetailsService}")
    String birdEndPoint;
    @Override
    public String getBirdDetails(String name) {
        RestTemplate restTemplate = new RestTemplate();

        //fetching API response as an array
        ResponseEntity<BirdsDetailsObject[]> responseEntity = restTemplate.getForEntity(birdEndPoint, BirdsDetailsObject[].class);
        
        // null
        if(responseEntity.getBody() == null){
            return "Unable to fetch family for the given bird";
        }
      
        //covert array to List
        List<BirdsDetailsObject> birdList = Arrays.asList(responseEntity.getBody());

        // filtering birds by name
        return birdList.stream()
                    .filter(bird -> bird.getName().equalsIgnoreCase(name))
                    .map(bird-> {
                        try {
                            return new ObjectMapper().writeValueAsString(bird);
                        } catch (JsonProcessingException e) {
                            e.printStackTrace();
                        }
                        return null;
                    })
                    .findAny()
                    .orElse("Details not found for provided bird");

    }



}


