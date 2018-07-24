package com.capgemini.cache.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capgemini.cache.model.User;
import com.capgemini.cache.repository.UserRepository;

@Service
public class UserCache {
	
	
	@Autowired
	UserRepository userRepository;
	
	
	@Cacheable(value="userCache",key="#name")
	public User getUser(String name) {
		
		System.out.println("retriving from data base    "+name);
		
		return userRepository.findByName(name);
	}

}
