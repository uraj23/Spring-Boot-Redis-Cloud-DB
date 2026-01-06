package com.codeur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeur.entity.Student;
import com.codeur.repository.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository srepo;

	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		srepo.save(student);
		return "Student saved ";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		Iterable<Student> all = srepo.findAll();
		return (List<Student>)all;
	}
	
}
