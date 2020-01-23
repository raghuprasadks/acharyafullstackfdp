package com.kaushalya.hello.hellorestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	long counter = 1;
	@GetMapping("/greeting")
	public String greet()
	{
		return "Hello.Welcome to world of Spring Boot";
	}

	@GetMapping("/greetings")
	public String greetings(@RequestParam(value = "name", defaultValue = "World") String name)
	{
		return name +" Hello.Welcome to world of Spring Boot";
	}
	
	@GetMapping("/anotherGreeting")
	public Greeting greetingDifferently(@RequestParam(value = "name", defaultValue = "World") String name)
	{
		return new Greeting(++counter,name);
	}
	
}
