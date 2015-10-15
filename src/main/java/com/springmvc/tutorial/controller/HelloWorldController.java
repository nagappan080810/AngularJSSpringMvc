package com.springmvc.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {
	
	@RequestMapping(value="helloworld")
	public ModelAndView getHelloWorld(ModelMap modelMap){
		System.out.println("helloworld controller method got executed");
		modelMap.addAttribute("message", "This Spring MVC tutorial is working fine!!!");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addAllObjects(modelMap);
		modelAndView.addObject("message","This Spring MVC tutorial is working fine!!!");
		modelAndView.setViewName("helloworld");
		return modelAndView;
	}
}
