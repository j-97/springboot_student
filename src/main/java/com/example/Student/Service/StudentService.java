package com.example.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Dao.StudentDao;
import com.example.Student.Model.Student;
import com.example.Student.SearchOutputMetaData.SearchOutputMetaData;
import com.example.Student.Validator.StudentRequestor;
import com.example.Student.Validator.StudentResponser;
import com.example.Student.Validator.Validator;

@Service
public class StudentService {
	
	@Autowired
	Student student;
	
	@Autowired
	StudentDao studentDao;//=new StudentDao();
	
	@Autowired
	StudentResponser studentResponser;
	
	@Autowired
	Validator validator;
	
	@Autowired
	SearchOutputMetaData searchOutputMetaData;
	
	public Student addStudent(Student student) {
		return studentDao.addStudent(student);
	}
	
	
//	public List<Student> getAllStudents(){
//		return studentDao.studentList;
//	}
	
	public List<StudentResponser> getAllStudents(){
		return studentDao.getAllStudents();
	}

	public StudentResponser getStudentById(StudentRequestor studentRequestor) {
		
		studentResponser=validator.validateRequest(studentRequestor);
		
		if(studentResponser.getErrorMsg()!=null) {
			studentResponser.setCollege(null);
			studentResponser.setName(null);
			searchOutputMetaData.setStatusCode("Failed");
			studentResponser.setSearchOutputMetaData(searchOutputMetaData);
			return studentResponser;
		}
		else if(studentResponser.getErrorMsg()==null) {
		
		System.out.println("Error message is null");
		student=studentDao.getStudentById(studentRequestor);
		studentResponser.setName(student.getName());
		studentResponser.setCollege(student.getCollege());
		searchOutputMetaData.setStatusCode("OK");
		studentResponser.setSearchOutputMetaData(searchOutputMetaData);
		return studentResponser;
		}
		else
			return studentResponser;
	
}
	
	
}
