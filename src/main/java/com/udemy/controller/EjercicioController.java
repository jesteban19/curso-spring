package com.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.service.EjercicioService;

@Controller
@RequestMapping("/ejercicio")
public class EjercicioController {
	private static final String EJERCICIO_VIEW = "ejercicio"; 
	
	@Autowired
	@Qualifier("ejercicioService")
	private EjercicioService ejercicioService;
	
	@GetMapping("/test")
	public String test() {
		return "redirect:/ejercicio/final";
	}
	
	@GetMapping("/final")
	public ModelAndView finalRequest() {
		ModelAndView mav = new ModelAndView(EJERCICIO_VIEW);
		ejercicioService.say();
		mav.addObject("mensaje","Este es de prueba");
		return mav;
	}
}
