package org.ncu.spring_mvc_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")	
	public String showView() {
			return "index";
		}
}
