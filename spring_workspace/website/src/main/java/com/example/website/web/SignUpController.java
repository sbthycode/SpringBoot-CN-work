package com.example.website.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.website.domain.StudentUser;
import com.example.website.domain.User;
import com.example.website.service.UserService;

@Controller
public class SignUpController {
	@Autowired
	UserService userService;
	@RequestMapping("/signup")
	public String getSignUpPage(Model uiModel) {
		User user = userService.getUser();
		uiModel.addAttribute("user",user);
		return "signup";
	}
	@RequestMapping("/registerUser")
	public String createdUser(@ModelAttribute(value = "user") StudentUser studentUser) {
		if(userService.signUp(studentUser.getName(),studentUser.getGender(),studentUser.getLocation(),studentUser.getCollege())) {
			return "welcome";
		}
		
		return "signup agains pls, some problems underway";
	}
}
