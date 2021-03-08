package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

	@GetMapping(path = "/welcome")
	public String welcome() {
		return "Welcome to the AWS Application";
	}
}
