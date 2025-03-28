package com.fullstack.book_my_show.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="MOVIES")
public class Movie {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="NAME")
    private String name;

    @Column(name="LANGUAGE")
    private String language;

    @Column(name="RELEASE_YEAR")
    private Integer releaseYear;

    @ManyToOne
    @JoinColumn(name="director_id")
    private Director director;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", language=" + language + ", releaseYear=" + releaseYear + "]";
    }

   
    

    

}
