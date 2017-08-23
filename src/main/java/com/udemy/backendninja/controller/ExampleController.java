package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	@GetMapping("/exampleString")
	public String exampleString(Model model) 
	{
		model.addAttribute("name", "Jhon");
		return EXAMPLE_VIEW;
	}
	
	@GetMapping("/exampleWAV")
	public ModelAndView exampleMaV()
	{
		ModelAndView wav = new ModelAndView(EXAMPLE_VIEW);
		wav.addObject("name", "Mikel");
		return wav;
	}
}
