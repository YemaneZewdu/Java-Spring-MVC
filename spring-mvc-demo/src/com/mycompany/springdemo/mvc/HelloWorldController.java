package com.mycompany.springdemo.mvc;
import org.springframework.stereotype.Controller;
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
}
