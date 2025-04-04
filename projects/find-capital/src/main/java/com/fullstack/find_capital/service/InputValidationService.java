package com.fullstack.find_capital.service;

import org.springframework.stereotype.Service;

@Service
public class InputValidationService {

    /**
     * This method validates the input to be always should have capital case alphabets
     * returns true when all chanracters fall in A-Z
     * returns false when all charcters outside of A-Z
     * @param input
     * @return
     */
    public boolean validate(String input){
        return input.matches("^[A-Z]*$");
    }

}
