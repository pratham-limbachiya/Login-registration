package com.example.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.login.Dto.UserDto;
import com.example.login.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//this api is fetch the data from the server
	@GetMapping("/registration")
	public String getregistration(Model model)
	{
		model.addAttribute("user",new UserDto());
		return "register";
	}
	
	//this api is send the data from the server
	@PostMapping("/registration")
	public String saveuser(@ModelAttribute("user") UserDto userdto,RedirectAttributes redirectAttributes)
	{
		 try {
			userService.save(userdto);
			redirectAttributes.addFlashAttribute("success","Registration Successfully!");
			return "redirect:/registration";
		 }
		 catch(Exception e)
		 {
			redirectAttributes.addFlashAttribute("error","Registration failed");
			return "redirect:/registration";
		 }
		
		
	}
}
