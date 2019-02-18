package com.example.Student.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.Student.Model.Student;
import com.example.Student.Validator.StudentRequestor;
import com.example.Student.Validator.StudentResponser;

@Component
public class StudentDao {
	
	
	public StudentDao() {
		super();
	}
	
	public List<Student> studentList=new ArrayList<>();
	public List<StudentResponser> List1=new ArrayList<>();
	
	public Student addStudent(Student student) {
		Student s=new Student(student);
		studentList.add(s);
		System.out.println("Here is the list"+studentList);
		return s;
		
	}
	
	public List<StudentResponser> getAllStudents(){
		for(Student s:studentList) {
			StudentResponser s1=new StudentResponser();
			s1.setName(s.getName());
			s1.setCollege(s.getCollege());
			List1.add(s1);
		}
		return List1;
		
		
	}
	
	public Student getStudentById(StudentRequestor studentRequestor) {
		String id=studentRequestor.getId();
		System.out.println(id);
		
		for(Student s: studentList) {
			if(s.getId().equals(studentRequestor.getId())) {
				
				System.out.println("Inside getStudentById");
				return s;
			}
		}
		System.out.println("Not found");
		return null;
	}

}
