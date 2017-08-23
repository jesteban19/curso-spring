package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {
	private static final String EXAMPLE2_VIEW = "example2";
	
	//localhost:8080/example2/request1?nm=jhon
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm", required=false,defaultValue="NULL") String name)
	{
		ModelAndView wav = new ModelAndView(EXAMPLE2_VIEW);
		wav.addObject("nm_in_model", name);
		return wav;
	}
}
