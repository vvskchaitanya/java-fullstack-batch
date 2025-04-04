package com.fullstack.find_capital.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.xmlunit.builder.Input;

public class InputValidationServiceTest {

    @Test
    void testValidate() {
        // Given
        String input1 = "ABCDEFG";
        String input2 = "abcdEFG";
        InputValidationService service = new InputValidationService();

        //When
        boolean output1 = service.validate(input1);
        boolean output2 = service.validate(input2);

        //Then
        assertEquals(true, output1);
        assertEquals(false, output2);



    }
}
