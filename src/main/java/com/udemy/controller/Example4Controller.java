package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/example4")
@Controller
public class Example4Controller {

	@GetMapping("/")
	public String index()
	{
		return "404";
	}
}
