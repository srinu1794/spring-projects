package com.capgemini.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	
	
	@RequestMapping("/service1")
	public String service1() {
		
		return "HelloCapgemini";
	}

}
