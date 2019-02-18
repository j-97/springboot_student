package com.example.Student.SearchOutputMetaData;

import org.springframework.stereotype.Component;

@Component
public class SearchOutputMetaData {

	private String statusCode;
	

	public SearchOutputMetaData() {
		super();
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	
}
