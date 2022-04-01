package org.ncu.spring_mvc_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/verify")
@SessionAttributes("name") 
public class UserController {

	@ModelAttribute("user")
	public User getUser(HttpServletRequest request) {
		 
		return new User();
	}

	@RequestMapping(value = "/showForm", method = RequestMethod.GET)
	public String showForm(@ModelAttribute("user") User user, HttpServletRequest request, HttpSession session, Model model) {
		
		/*
		 * Reading cookies using getCookies() and setting the name & registration fields
		 */
		
		Cookie[] cookies = request.getCookies();
		for (Cookie temp : cookies) {
			if ("userName".equals(temp.getName())) {
				String myCookie = temp.getValue();
				user.setUserName(myCookie);
			} else if ("registrationId".equals(temp.getName())) {
				String myCode = temp.getValue();
				user.setRegistrationCode(myCode);
			}
		}
		
		/* fetching the session details from HttpSession */
		String sessionVal = (String)session.getAttribute("mySession");
		model.addAttribute("sessionId", sessionVal);
		
		return "showForm";
	}

	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model,
			HttpServletResponse response, HttpServletRequest request) {

		if (bindingResult.hasErrors()) {
			List<ObjectError> error = bindingResult.getAllErrors();
			for (ObjectError temp : error) {
				System.out.println(temp);
			}
			return "showForm";
		} else {
			 
			/* Print all the data to console */
			System.out.println("User Name: " + user.getUserName() + " Aadhar Id: " + user.getAadharId()
					+ "Registration Code: " + user.getRegistrationCode() + " State: " + user.getState() + " Gender: "
					+ user.getGender() + " Other Options: " + user.getOthers());

			String[] list = user.getOthers();
			String others = "";
			for (String l : list) {
				others = others + " " + l + ", ";
				System.out.println(l);
			}

			if (others.endsWith(", ")) {
				others = others.substring(0, others.length() - 2) + ". ";
			}

			System.out.println("Address: " + user.getAddress());

			
			/* Creating cookies */

			Cookie cookie1 = new Cookie("userName", user.getUserName());

			Cookie cookie2 = new Cookie("registrationId", user.getRegistrationCode());

			cookie1.setMaxAge(60 * 60);

			cookie2.setMaxAge(60 * 60);

			response.addCookie(cookie1);
			response.addCookie(cookie2);

			/* send the updated data using model attribute */
			model.addAttribute("list", others);
			model.addAttribute("name", user.getUserName());

			model.addAttribute("userName", cookie1.getValue());
			return "confirmation";
		}
	}

	/* Reading cookies using @CookieValue annotation */
	/*
	 * @RequestMapping(value = "/sendResult", method = RequestMethod.GET) public
	 * String sendResult(@CookieValue("userName") String name, Model model) {
	 * model.addAttribute("cookieName", name); return "sendResult"; }
	 */

	
	/* Reading session parameters using @SessionAttribute annotation */
	/*
	 * @RequestMapping(value="/sendResult", method=RequestMethod.GET) public String
	 * sendResult(@SessionAttribute("name")String name, Model model) { String s =
	 * "Dr. "+name; model.addAttribute("doctor", s); return "sendResult"; }
	 */
	  
	  @RequestMapping(value="/sendResult", method=RequestMethod.GET) public String
	  sendResult(@SessionAttribute("name") String name, Model model) {
		  
		  String str = "Dr. "+name;
		  
		  model.addAttribute("modifiedName", str);
		  return "sendResult"; 
	  }
	 
}
