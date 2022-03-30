package org.ncu.spring_mvc_app.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=RegistrationConstraintValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RegistrationCode {

	// Declare annotation arguments
	
	// first arguments for value 
	public String value() default "20CSU";
	
	// second argument for message
	public String message() default "must be prefixed with 20CSU";
	
	/*
	 * define declaration for groups 
	 * Groups allow you to restrict the set of
	 * constraints applied during validation
	 */
	public Class<?>[] groups() default {};
	
	/*
	 * define declaration for payload 
	 * Payloads can be used by clients of the Bean
	 * Validation API to assign custom payload objects to a constraint.
	 */ 
	 public Class<? extends Payload>[] payload() default{}; 
	
	
}
