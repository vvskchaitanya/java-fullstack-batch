package com.fullstack.find_capital.dto;

public class Payload {

    public String country;

    public String capital;

    public boolean status;

    public Payload(String country, String capital, boolean status) {
        this.country = country;
        this.capital = capital;
        this.status = status;
    }

    

}
