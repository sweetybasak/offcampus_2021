package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//a. Create a controller
//1. Add annotation Controller to make it controller
@Controller
public class WelcomeController {

	//2. Create an init() with annotation Request mapping and Model as parameter
	@RequestMapping(value="/")
	public String init(Model model)
	{
		//3. Adding heading using addAttribute
		//4.Create folder WEB-INF and a subfolder pages in src
		model.addAttribute("heading","Customer Resource Management");
		return "index";
	}
}
