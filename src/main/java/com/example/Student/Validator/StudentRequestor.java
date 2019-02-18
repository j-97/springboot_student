package com.example.Student.Validator;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.example.Student.SearchInputMetaData.SearchInputMetaData;

@Component
public class StudentRequestor {
	
	@NotNull
	private String id;
	private SearchInputMetaData searchInputMetaData;
	
	public StudentRequestor() {
		super();
	}
	
	public StudentRequestor(@NotNull String id, SearchInputMetaData searchInputMetaData) {
		super();
		this.id = id;
		this.searchInputMetaData = searchInputMetaData;
	}
	public String getId() {
		return id;
	}
	

	public void setId(String id) {
		this.id = id;
	}
	public SearchInputMetaData getSearchInputMetaData() {
		return searchInputMetaData;
	}
	public void setSearchInputMetaData(SearchInputMetaData searchInputMetaData) {
		this.searchInputMetaData = searchInputMetaData;
	}
	

}
