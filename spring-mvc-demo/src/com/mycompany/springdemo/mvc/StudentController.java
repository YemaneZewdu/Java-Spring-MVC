package com.mycompany.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
	
	// create a student object
	Student theStudent = new Student();
	
	// add student object to the model
	// name and value pair
	theModel.addAttribute("student", theStudent);
	
	return "student-form";
	}
	
	@RequestMapping("/processForm")
	// @ModelAttribute lets us access the form data modelAttribute
	public String processForm(@ModelAttribute("student") Student theStudent) {
	
		// log the input data
		System.out.println("the Student name:" + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
			
		return "student-confirmation";
	}
	

}
