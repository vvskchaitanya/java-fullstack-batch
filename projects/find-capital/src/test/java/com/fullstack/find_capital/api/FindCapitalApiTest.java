package com.fullstack.find_capital.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import com.fullstack.find_capital.dto.Payload;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@ExtendWith(SpringExtension.class)
public class FindCapitalApiTest {

    RestTemplate restTemplate = new RestTemplate();

    @Test
    void testFindCapitalV1() {
        // Given
        String v1_endpoint = "http://localhost:8080/findcapital/v1";
        String country = "INDIA";

        // When
        ResponseEntity<Payload> response = this.restTemplate.getForEntity(v1_endpoint + "?country="+country, Payload.class);

        // Then
        Assertions.assertEquals("new delhi", response.getBody().capital.toLowerCase());
    }

    @Test
    void testFindCapitalV2() {

        // Given
        String v1_endpoint = "http://localhost:8080/findcapital/v2";
        String country = "united states";

        // When
        ResponseEntity<Payload> response = this.restTemplate.getForEntity(v1_endpoint + "?country="+country, Payload.class);

        // Then
        Assertions.assertEquals("washington", response.getBody().capital.toLowerCase());

    }

    @Test
    void testFindCapitalV1_Negative() {
        // Given
        String v1_endpoint = "http://localhost:8080/findcapital/v1";
        String country = "INDIA12344";

        // When
        ResponseEntity<Payload> response = this.restTemplate.getForEntity(v1_endpoint + "?country="+country, Payload.class);

        // Then
        Assertions.assertNull( response.getBody().capital);
    }

    @Test
    void testFindCapitalV2_Negative() {

        // Given
        String v1_endpoint = "http://localhost:8080/findcapital/v2";
        String country = "united states 12345";

        // When
        ResponseEntity<Payload> response = this.restTemplate.getForEntity(v1_endpoint + "?country="+country, Payload.class);

        // Then
        Assertions.assertNull( response.getBody().capital);

    }
}
