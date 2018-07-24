package com.capgemini.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cache.imple.UserCache;
import com.capgemini.cache.model.User;

@RestController

@RequestMapping(value="/rest/users")
public class CacheController {
	
	
	@Autowired
	UserCache userCache;
	
	@GetMapping(value="/{name}")
	public User getUser(@PathVariable final String name) {
		
		return userCache.getUser(name);
	}

}
