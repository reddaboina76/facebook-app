package com.facebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facebook.Impl.RegisterImpl;
import com.facebook.pojo.User;

@Controller
public class RegisterController {
	
	@Autowired
	RegisterImpl regImpl;

	@RequestMapping(value = "/register")
	public String saveUser(User user) {
		System.out.println(user.getName());
		System.out.println(user.getMbl());
		System.out.println(user.getMail());
		System.out.println(user.getPassword());
		regImpl.saveUser(user);
		return "login";
	}

}
