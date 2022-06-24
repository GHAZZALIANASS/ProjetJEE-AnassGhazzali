package com.example.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.Web.dto.UserRegistrationDto;
import com.example.demo.model.User;


public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
