package org.ncu.spring_mvc_app;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")	
	public String showView(HttpServletRequest request) {
		/* Creating a random Http session */
		
		  // create instance of Random class 
			Random rand = new Random();
		  
		  // Generate random integers in range 0 to 999 
			int rand_no = rand.nextInt(1000);
		  
			String value = Integer.toString(rand_no);
		  
		  HttpSession session = request.getSession();
		  
		  session.setAttribute("mySession", value);
		 
		
			return "index";
		}
}
