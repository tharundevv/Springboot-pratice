package com.practice.demo;

import com.practice.demo.controller.StudentController;
import com.practice.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
		SpringApplication.run(DemoApplication.class, args);
		StudentController controller = context.getBean(StudentController.class);

		Student student= new Student(1,"Tharun",22,"JavaFullStack");
		controller.addStudent(student);
	}

}

