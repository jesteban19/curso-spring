package com.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	@GetMapping("/exampleString")
	public String exampleString(Model model) 
	{
		model.addAttribute("people", getPeople());
		return EXAMPLE_VIEW;
	}
	
	@GetMapping("/exampleWAV")
	public ModelAndView exampleMaV()
	{
		ModelAndView wav = new ModelAndView(EXAMPLE_VIEW);
		wav.addObject("person", new Person("Fiorella", 29));
		return wav;
	}
	
	private List<Person> getPeople()
	{
		List<Person> people = new ArrayList<>();
		people.add(new Person("Jhon", 24));
		people.add(new Person("Eva", 14));
		people.add(new Person("Ana", 44));
		people.add(new Person("Petter", 14));
		people.add(new Person("Fiorella", 44));
		people.add(new Person("Saori", 54));
		
		return people;
	}
}
