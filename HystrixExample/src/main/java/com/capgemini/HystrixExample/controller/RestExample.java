package com.capgemini.HystrixExample.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping("/rest")
public class RestExample {
	
	@HystrixCommand(fallbackMethod="fallbBackHello", commandKey="hello", groupKey="hello")
	@GetMapping("/hello")
	public String helloCapgemini() {
		
		if(RandomUtils.nextBoolean()) {
			
			throw new RuntimeException("failed");
		}
		
		
		return "Hello Capemini";
		
		
	}
	
	public  String  fallbBackHello() {
		
		return "fallback initiated";
	}

}
