package com.practice.demo.controller;

import com.practice.demo.model.Student;
import com.practice.demo.service.StudentService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    public void addStudent(Student student){
        studentService.registerStudent(student);
    }
}
