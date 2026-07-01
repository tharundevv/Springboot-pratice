package com.practice.demo.repository;

import com.practice.demo.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public void saveStudent(Student student){
        System.out.println(student);
    }
}
