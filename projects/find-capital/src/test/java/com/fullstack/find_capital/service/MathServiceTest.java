package com.fullstack.find_capital.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathServiceTest {

    @Test
    void testSum(){
        // Given
        int a = 20, b=25;
        MathService mathService = new MathService();

        // When
        int result = mathService.sum(a, b);

        // Then
        Assertions.assertEquals(45, result);
    }

    @Test
    void testSum_Negative(){
        // Given
        int a = -20, b= -25;
        MathService mathService = new MathService();

        // Then
        Assertions.assertThrows(RuntimeException.class, ()->{
            // When
            int result = mathService.sum(a, b);
        });
    }

    @Test
    void testSum_Negative2(){
        // Given
        int a = 20, b= -25;
        MathService mathService = new MathService();

       

        // Then
        Assertions.assertThrows(RuntimeException.class, ()->{
            // When
            int result = mathService.sum(a, b);
        });
    }

}
