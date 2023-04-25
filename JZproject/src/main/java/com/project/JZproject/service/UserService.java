package com.project.JZproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.JZproject.entity.User;
import com.project.JZproject.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	
	public User login(String username, String password) {
		return userRepo.findByUserNameAndPassword(username, password);
		
	}
	
}
