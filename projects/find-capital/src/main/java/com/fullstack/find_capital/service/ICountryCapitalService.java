package com.fullstack.find_capital.service;

public interface ICountryCapitalService {

    /***
     * Returns the capital of the country provided
     * if country is not found returns null
     * @param country
     * @return
     */
    public String getCapital(String country);

}
