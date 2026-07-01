package com.practice.demo.service;

import com.practice.demo.model.Student;
import com.practice.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository repository;

    public  StudentService(StudentRepository repository){
        this.repository=repository;

    }public void registerStudent(Student student){
        repository.saveStudent(student);

    }




}
