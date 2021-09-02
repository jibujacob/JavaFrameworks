package com.jj.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showform() {
		return "helloworld-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processform() {
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String studentUpperName = request.getParameter("studentName");
		studentUpperName = studentUpperName.toUpperCase();
		model.addAttribute("studentName", "Yo! " + studentUpperName);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String studentName, 
			Model model) {
		
		String studentUpperName = studentName.toUpperCase();
		model.addAttribute("studentName", "Wassupp!!!! " + studentUpperName);
		
		return "helloworld";
	}
}
