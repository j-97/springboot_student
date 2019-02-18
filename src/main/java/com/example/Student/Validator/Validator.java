package com.example.Student.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Validator {
	
	@Autowired
	StudentResponser studentResponser;
	String error1=null;
	
	public StudentResponser validateRequest(StudentRequestor studentRequest) {
		
		error1=null;
		if(studentRequest==null) {
			error1="The request object is null";
		}
		
		if(studentRequest!=null) {
			
			if(studentRequest.getId()==null) {
				this.error1="Id is required";
			}
			
			if(studentRequest.getSearchInputMetaData().getUniqueId()==null)
				error1="UniqueId of requestor is required";
			
		}
		
		studentResponser.setErrorMsg(error1);
		System.out.println(error1);
		System.out.println("----------------------------");
		return studentResponser;
		
		
	}

}
