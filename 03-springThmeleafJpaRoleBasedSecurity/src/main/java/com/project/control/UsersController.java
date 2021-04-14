package com.project.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entity.Users;
import com.project.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService service1;
	
	@RequestMapping("/")
	public String indexPage() {
		return "home";
	}
	
	@RequestMapping("/usersForm")
	public String usersPage(Model model) {
		model.addAttribute("usersmodel", new Users());
		return "users-form";
	}
	
	@RequestMapping("/usersSave")
	public String usersSave(@ModelAttribute("usersmodel")Users users) {
		this.service1.usersSave(users);
		return "redirect:/";
	}

}
