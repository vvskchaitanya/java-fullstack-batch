package com.vvsk.fullstack.movies.models;

/**
 * Create a java model class Movie with properties name, category, language director, rating
 */
public class Movie {
    private String name;
    private String category;
    private String language;
    private String director;
    private Double rating;

    // Constructor
    public Movie(String name, String category, String language, String director, Double rating) {
        this.name = name;
        this.category = category;
        this.language = language;
        this.director = director;
        this.rating = rating;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // toString method
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", language='" + language + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }
}
