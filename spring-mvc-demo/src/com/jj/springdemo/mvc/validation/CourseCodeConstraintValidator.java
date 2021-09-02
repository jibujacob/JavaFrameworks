package com.jj.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;
	
	public void initialize(CourseCode theCourseCode) {
		this.coursePrefix = theCourseCode.value();
	}
	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		if (theCode!= null) {
			boolean result = theCode.startsWith(coursePrefix);
			return result;
		}
		
		
		return true;
	}



}
