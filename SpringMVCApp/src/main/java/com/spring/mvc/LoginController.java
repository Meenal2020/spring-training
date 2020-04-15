package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String displayLoginPage(Model model) {
		model.addAttribute("msg", "Login Required..");
		return "login";
	}
	
}
