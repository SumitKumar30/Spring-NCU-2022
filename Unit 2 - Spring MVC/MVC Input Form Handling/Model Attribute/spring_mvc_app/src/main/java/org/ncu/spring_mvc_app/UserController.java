package org.ncu.spring_mvc_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/verify")
public class UserController {

	@ModelAttribute("user")
	public User getUser() {
		
		return new User();
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("user") User user) {
		
		System.out.println("User Name: "+user.getUserName()+" Aadhar Id: "+user.getAadharId()+" State: "+user.getState());
		
		
		return "confirmation";
	}
	
}
