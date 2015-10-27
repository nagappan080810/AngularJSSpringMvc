package com.springmvc.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.tutorial.bo.bean.MessageBean;


@Controller
public class HelloWorldController {
	
	@RequestMapping(value="helloworld", produces="application/json")
	@ResponseBody
	public MessageBean getHelloWorld(ModelMap modelMap){
		System.out.println("helloworld controller method got executed");
		MessageBean msgBean = new MessageBean("Angular JS with Spring REST Services are working fine!");
		return msgBean;
	}
	
	
}