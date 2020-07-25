package com.mycompany.springdemo.mvc;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {

	// create a controller method to show the initial HTML form
	// Spring will append '.jsp' and call /WEB_INF/view/helloworld-form.jsp 
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	// create a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	// new controller method to read data and add data to the model
	@RequestMapping("/processFormVesrionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//create the message
		String result = "Yo! " + theName.toUpperCase();
		
		// add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
