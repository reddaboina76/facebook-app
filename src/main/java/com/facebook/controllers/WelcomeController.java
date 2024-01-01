package com.facebook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/")
	public String welcomPage() {
		
		System.out.println("welcome page requset triggred!!");
		return "Home";
	}
	
}
