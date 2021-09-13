package com.awswebapp.awswebapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class homeController {

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
	}
	
	@GetMapping("/about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("about");
	    return modelAndView;
	}
}
