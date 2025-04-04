package com.fullstack.find_bird_details.service;

public interface IBirdsDetailsService {
    /***
     * Returns the bird's family name which it belongs to, if name not found returns null
     * @param name
     * @return
     */
    public String getBirdDetails(String name);

}
