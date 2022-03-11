package org.ncu.spring_mvc_app.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CountryCodeConstraintValidator implements ConstraintValidator<CountryCode, String>{

	String countryPrefix; 
	
	@Override
	public void initialize(CountryCode constraintAnnotation) {
		// TODO Auto-generated method stub
		/* ConstraintValidator.super.initialize(constraintAnnotation); */
		countryPrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		/* return false; */
		
		Boolean  result = value.startsWith(countryPrefix);
		
		return result;
	}

}
