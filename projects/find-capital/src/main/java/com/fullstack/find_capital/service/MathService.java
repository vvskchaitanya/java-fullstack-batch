package com.fullstack.find_capital.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    /**
     * This method only adds the positive integers
     * it throws runtime exception for negative
     * @param a
     * @param b
     * @return
     */
    public Integer sum(Integer a , Integer b){

        if(a < 0 || b < 0){
            throw new RuntimeException("Cannot add negative integers");
        }else{
            return a+b;
        }
    }

}
