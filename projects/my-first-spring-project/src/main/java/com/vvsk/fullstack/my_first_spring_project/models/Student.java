package com.vvsk.fullstack.my_first_spring_project.models;

public class Student {

    private String name;

    private Integer rollNumber;

    private Double score;

    public Student(String name, Integer rollNumber, Double score) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", score=" + score + "]";
    }

    

}
