package com.example.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Model.Student;
import com.example.Student.Service.StudentService;
import com.example.Student.Validator.StudentRequestor;
import com.example.Student.Validator.StudentResponser;

@RestController
public class Controller {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/Hello")
	public String HelloFun(){
		System.out.println("Hello World");
		return("Hello World");
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/getAllStudents")
	public List<StudentResponser>getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/getStudent")
	public StudentResponser getStudentById(@RequestBody StudentRequestor studentRequestor) {
		return studentService.getStudentById(studentRequestor);
	}

}
