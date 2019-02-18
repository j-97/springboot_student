package com.example.Student.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Student.SearchInputMetaData.SearchInputMetaData;

@Component
public class Student {
	
	
	@Autowired
	private SearchInputMetaData searchInputMetaData;
	private String id;
	private String name;
	private String course;
	private String college;
	
	public Student() {};
	public Student(String id,String name,String course,String college) {
		this.id=id;
		this.name=name;
		this.course=course;
		this.college=college;
	}
	
	public Student(Student s) {
		this.searchInputMetaData=s.searchInputMetaData;
		this.id=s.id;
		this.name=s.name;
		this.course=s.course;
		this.college=s.college;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public SearchInputMetaData getSearchInputMetaData() {
		return searchInputMetaData;
	}
	
	public void setSearchInputMetaData(SearchInputMetaData searchInputMetaData) {
		this.searchInputMetaData = searchInputMetaData;
	}
	
	

}
