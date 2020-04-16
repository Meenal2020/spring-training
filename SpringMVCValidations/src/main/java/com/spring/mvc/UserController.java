package com.spring.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/userSignup")
	public String displayUserSignupPage(Model model) {
		model.addAttribute("usr", new User());
		return "userSignup";
	}
	
	@RequestMapping("saveUser")
	public String saveUser(@Valid @ModelAttribute("usr") User user, BindingResult br) {
		if(br.hasErrors()) {
			System.out.println("Invalid user details");
			return "userSignup";
		}
		System.out.println("User details are correct");
		return "welcome";
	}

}
