package com.jj.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student theStudent = new Student();
		model.addAttribute("student",theStudent);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(
			@ModelAttribute("student") Student thestudent) {
		System.out.println(thestudent.getFirstName());
		System.out.println(thestudent.getLastName());
		System.out.println(thestudent.getCountry());
		return "student-confirmation";
	}
}
