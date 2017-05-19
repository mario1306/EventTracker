package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		System.out.println("sayHello()");
		model.addAttribute("greeting", "Hello World");
		
		// a file located under /src/main/webapp
		// try http://localhost:8080/EventTracker/index.jsp !

		return "hello.jsp";		
		// use view resolver
		//return "hello";
	}
}
