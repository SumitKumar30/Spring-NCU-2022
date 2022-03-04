package org.ncu.spring_mvc_app;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/verify")
public class UserController {

	@ModelAttribute("user")
	public User getUser() {
		
		return new User();
	}
	
	@RequestMapping(value="/showForm", method=RequestMethod.GET)
	public String showForm() {
		
		return "showForm";
	}
	
	@RequestMapping(value="/processForm", method=RequestMethod.POST)
	public String processForm(@ModelAttribute("user") User user, Model model) {
		
		System.out.println("User Name: "+user.getUserName()+" Aadhar Id: "+user.getAadharId()+" State: "+user.getState()+ " Gender: "+user.getGender()+" Other Options: "+user.getOthers());
		
		String[] list = user.getOthers();
		String others = "";
		for(String l : list) {
			others = others+" "+l+", "; 
			System.out.println(l);
		}
		
		if (others.endsWith(", ")) {
		    others = others.substring(0, others.length() - 2) + ". ";
		}
		
		System.out.println("Address: "+user.getAddress());
		
		/* send the updated data using model attribute */
		model.addAttribute("list", others);
		
		return "confirmation";
	}
	
}
