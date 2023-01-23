package com.EmployeeDetails.EmployeeDetails;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Employee {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;
	private String empId;
	private WorkLocation workLocation;
	
	public Employee(String firstName, String lastName, String email, Gender gender, String empId,
			WorkLocation workLocation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.empId = empId;
		this.workLocation = workLocation;
	}
	
	
	
	

}
