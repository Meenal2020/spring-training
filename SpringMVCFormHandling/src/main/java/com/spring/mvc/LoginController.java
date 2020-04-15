package com.spring.mvc;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String displayLoginPage(Model model) {
		model.addAttribute("msg", "Login Required..");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginProcessing(ModelMap model, @RequestParam String name, @RequestParam String password) {
		if(!loginService.validateUser(name, password)) {
			
			model.addAttribute("errorMessage", "Invalid Username or password..");
			return "login";
		}
		model.addAttribute("user", name);
		return "welcome";
	}

	@RequestMapping(value="/hello")
	public ModelAndView diasplayHelloWorld() {
		LocalDate date = LocalDate.now();
		String message =" Hello World, Today is "+date;
		return new ModelAndView("hello","message", message);
		
	}
}
