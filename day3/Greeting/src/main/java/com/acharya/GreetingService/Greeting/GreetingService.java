package com.acharya.GreetingService.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingService {
	
	@GetMapping(path="/greet")
	public String greet()
	{
		return "Hello.Welcome to Spring Boot";
	}

}
