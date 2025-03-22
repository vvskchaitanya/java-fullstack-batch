package com.vvsk.fullstack.my_first_spring_project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vvsk.fullstack.my_first_spring_project.models.Student;

@Service
public class StudentsService {

    public StudentsService(){
        System.out.println("StudentService class is being initalizaed by Spring Framework because of @Service");
    }

    public List<Student> retrieve(){

        List<Student> students = new ArrayList<>();

        students.add(new Student("Student1", 10, 98.89));
        students.add(new Student("Student2", 10, 98.89));
        students.add(new Student("Student3", 10, 98.89));
        students.add(new Student("Student4", 10, 98.89));
        students.add(new Student(null, 10, 98.89));

        return students;

    }

}
