package org.ncu.spring_mvc_app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class FormController {
	
	@RequestMapping("/inputForm")
	public String renderInput() {
		
		return "input-form";
	}
	
	@RequestMapping("/processForm")
	public String renderForm(@RequestParam("username") String name, @RequestParam("password")String pass, @RequestParam("gender")String gender, @RequestParam("age")String age, @RequestParam("language") String[] languages, @RequestParam("instruction")String instruction, Model mode) {
//		String name = request.getParameter("studentName");
		/*
		 * String result = name.replaceFirst("G", "Je"); mode.addAttribute("namo",
		 * result);
		 */
		if (name == null) {
       	 System.out.println("Username is missing!");
        }
		if (pass.equals("")) {
       	 System.out.println("Password is missing!!");
        }
		String g = null;
		if (gender == null) {
            System.out.println("Please enter your gender!!");
         } else if (gender.equals("m")) {
            g = "male";
         } else {
            g = "female";
         }
		if (age == null) {
            System.out.println("Please enter your age!!");
         }
		
		String lang = null;
        // Get null if the parameter is missing from query string.
        if (languages == null || languages.length == 0) {
           System.out.println("Languages None!");
        } else {
           for (String language : languages) {
              if (language.equals("java")) {
                 lang = "Java";
              } else if (language.equals("cs")) {
                 lang = lang + " C#";
              } else if (language.equals("c")) {
                 lang = lang + " C";
              } else if (language.equals("py")) {
            	  lang += " Python";
              } else if(language.equals("js")) {
            	  lang += " Javascript";
              }
           }
        }
        System.out.println(lang);
        if (instruction == null) {
       	 System.out.println("Instructions Empty!");
        }
        
        
		mode.addAttribute("gender", g);
		mode.addAttribute("languages", lang);
		
		return "process-form";
	}
	
}
