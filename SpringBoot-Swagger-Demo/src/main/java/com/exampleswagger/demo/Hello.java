package com.exampleswagger.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swag/hello")
public class Hello {

	@GetMapping
	public String hello()
	{
		return "hello Jackson";
	}
	@PostMapping("/post")
	public String hellopost(@RequestBody final String hello)
	{
		return hello;
	}
}
