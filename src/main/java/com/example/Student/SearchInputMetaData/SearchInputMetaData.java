package com.example.Student.SearchInputMetaData;

import org.springframework.stereotype.Component;

@Component
public class SearchInputMetaData {
	
	private int schoolCode;
	private int abc;
	private String uniqueId;
	
	
	public SearchInputMetaData() {
		super();
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public int getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}
	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	

}
