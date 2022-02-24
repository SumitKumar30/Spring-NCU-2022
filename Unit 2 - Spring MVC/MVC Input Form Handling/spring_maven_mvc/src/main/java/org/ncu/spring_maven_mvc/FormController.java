package org.ncu.spring_maven_mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class FormController {
	
	@RequestMapping("/inputForm")
	public String inputForm() {
		return "input-form";
	}
	
	@RequestMapping("/processForm")
	public String formHandler(@RequestParam("userName")String name, Model model) {
		/* String name = request.getParameter("userName"); */
		String upper = "Mr. "+name.toUpperCase();
		model.addAttribute("manipulatedName", upper);
		
		return "process-form";
	}
}
