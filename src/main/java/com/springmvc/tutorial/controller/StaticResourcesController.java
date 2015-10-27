package com.springmvc.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticResourcesController {
	
	@RequestMapping(value = "/staticPage/Test.hmtl")
	public String redirect(@PathVariable("page")String pageName) {
		  System.out.println("static page trapped for redirect"+pageName);
	      return "redirect:/"+pageName;
	}

}
