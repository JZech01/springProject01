package com.project.JZproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.JZproject.entity.User;
import com.project.JZproject.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/login")
	public User login(@RequestParam String username, @RequestParam String password) {
		return userService.login(username, password);
	}

}
