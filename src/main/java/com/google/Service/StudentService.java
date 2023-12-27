package com.google.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.Entity.Student;
import com.google.Repository.StudentRepo;

@Service
public class StudentService {
       
	@Autowired
	private StudentRepo studentRepo;
	
	
	public Student saveDetails(Student student) {
		return studentRepo.save(student);
	}
}
