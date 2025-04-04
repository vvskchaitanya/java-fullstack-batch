package com.fullstack.find_bird_details.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fullstack.find_bird_details.dto.BirdsDetailsObject;

@Service
public class SpecificBirdDetailsService implements IBirdsDetailsService{


    @Value("${birdsDetailsService}")
    String birdEndPoint;
    @Override
    public String getBirdDetails(String name) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<BirdsDetailsObject[]> responseEntity = restTemplate.getForEntity(birdEndPoint+"?search="+name, BirdsDetailsObject[].class);
        if(responseEntity.getBody() == null || responseEntity.getBody().length == 0){
            return "Unable to fetch details of the given bird";
        }
        List<BirdsDetailsObject> birdList = Arrays.asList(responseEntity.getBody());

        // Print API response
        try {
            System.out.println("API Response: " + new ObjectMapper().writeValueAsString(birdList));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // Try to find exact match
        Optional<BirdsDetailsObject> foundBird = birdList.stream()
                .filter(bird -> bird.getName().trim().equalsIgnoreCase(name.trim()))
                .findFirst();

        if (foundBird.isPresent()) {
            try {
                return new ObjectMapper().writeValueAsString(foundBird.get());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return "Error processing bird details.";
            }
        }

        // If exact match not found, return all partial matches
        List<BirdsDetailsObject> partialMatches = birdList.stream()
                .filter(bird -> bird.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());

        if (!partialMatches.isEmpty()) {
            try {
                return new ObjectMapper().writeValueAsString(partialMatches);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return "Error processing bird details.";
            }
        }

        return "Details not found for the provided bird.";
    }
}