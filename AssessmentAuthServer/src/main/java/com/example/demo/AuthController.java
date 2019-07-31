package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	@Autowired
	private UserDAO obj;
	

	
	@RequestMapping("/authenticate/{name}")
	public void add(@PathVariable String name)
	{
		System.out.println("hey2"+name);
		User u=new User();
		u.setUser("sang");
		u.setPwd("sang");
		obj.save(u);

	}
}
