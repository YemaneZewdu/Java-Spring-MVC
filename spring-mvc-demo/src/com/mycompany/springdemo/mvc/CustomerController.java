package com.mycompany.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// add an initBinder to convert and trim input strings (pre-processing the input)
	// solves whitespace issues
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		// passing true so that it will trim it to a null value if the string is all whitespace
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}

	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
	

	// name and value pair
	theModel.addAttribute("customer", new Customer());
	
	return "customer-form";
	}
	
	@RequestMapping("/processForm")
	// @Valid tells Spring to validate the customer obj that is being passed in
	//Spring will put the result of the validation in 'theBindingResult'
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult theBindingResult) {
	
		// log the input data
		System.out.println("customer's name:" + customer.getFirstName()
							+ " " + customer.getLastName());
		
		// checking if theBindingResult has error
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
		return "customer-confirmation";
		}
	}
	
}
