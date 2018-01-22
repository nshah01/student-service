package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Student;
import com.example.repositories.StudentRepository;


@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepo;

	
	@RequestMapping(value = "/getStudentByFirstname/{firstname}", method = RequestMethod.GET)
	public Student getPersonByFirstname(@PathVariable String firstname) {
		Student student = studentRepo.findByFirstname(firstname);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + student);
		return student;	
	}	

}
