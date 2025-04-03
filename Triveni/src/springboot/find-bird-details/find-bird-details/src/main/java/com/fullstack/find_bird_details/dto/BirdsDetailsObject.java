package com.fullstack.find_bird_details.dto;

public class BirdsDetailsObject {
    private String name;
    private String family;
    private String species;
    private String diet;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getDiet() {
        return diet;
    }
    public void setDiet(String diet) {
        this.diet = diet;
    }
    @Override
    public String toString() {
        return "BirdsDetailsObject [name=" + name + ", family=" + family + ", species=" + species + ", diet=" + diet
                + "]";
    }

    

}
