package com.google.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.Entity.Student;
import com.google.Service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentServe;
	
	
	@PostMapping("/addStudents")
	public Student postDetails(@RequestBody Student student) {
		return studentServe.saveDetails(student);
	}

}
