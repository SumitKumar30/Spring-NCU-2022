package org.ncu.spring_mvc_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/inputForm")
	public String renderInput() {
		return "input-form";
	}
	
	@RequestMapping("/processForm")
	public String renderForm() {
		return "process-form";
	}
	
}
