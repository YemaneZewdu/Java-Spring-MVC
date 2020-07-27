package com.mycompany.springdemo.mvc.validation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;

// defining a custom annotation

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
// where it can be applied 
@Target({ElementType.METHOD, ElementType.FIELD})
//how long will the marked annotation be stored
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	// define default course code
	public String value() default "LUV";
	
	// define default error message
	public String message() default "must start with LUV";
	
	// define default groups
	public Class<?>[] groups() default{};
	
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
}
