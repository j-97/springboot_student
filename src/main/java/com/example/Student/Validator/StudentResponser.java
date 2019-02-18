package com.example.Student.Validator;

import org.springframework.stereotype.Component;

import com.example.Student.SearchOutputMetaData.SearchOutputMetaData;

@Component
public class StudentResponser {
	
	private String name;
	private String college;
	private String errorMsg;
	private SearchOutputMetaData searchOutputMetaData;
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public StudentResponser() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

	public SearchOutputMetaData getSearchOutputMetaData() {
		return searchOutputMetaData;
	}

	public void setSearchOutputMetaData(SearchOutputMetaData searchOutputMetaData) {
		this.searchOutputMetaData = searchOutputMetaData;
	}
	
	

}
