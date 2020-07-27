package com.mycompany.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mycompany.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	//validation rules
	// these messages are shown as error messages
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=18, message="must be 18 years or above")
	@Max(value=38, message="too old")
	//private int age;  // changed to resolve the String->int casting issue with @NotNull
	private Integer age;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 characters allowed")
	private String postalCode;
	
	// custom validation
	// if no values are passed, the defaults are used
	@CourseCode(value="CS", message="Course name must start with CS")
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	

}
