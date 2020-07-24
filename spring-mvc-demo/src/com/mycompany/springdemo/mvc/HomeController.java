package com.mycompany.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// controller class
//@Controller tells Spring that this class is the controller for the MVC design
@Controller
public class HomeController {
	
	// controller method that handles all types of HTTP request 
	
	@RequestMapping("/")
	public String showPage() {
		
		return "main-menu";
	}
	
	

}
