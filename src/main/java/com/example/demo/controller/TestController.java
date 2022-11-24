package com.example.demo.controller;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.model.Input;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/message")
	public String getMessage() {
		
		
		
		return "Hello World";
	}
	
	@PostMapping("/palindrome")
	public String palindrom(@RequestBody Input input) {
		
		String inputString = input.getInput();
		String reversString = new StringBuilder(inputString).reverse().toString();
		
		String res = inputString.equals(reversString) ? "palindrome" : "notPAlindrome";
		
		return res;
	}

}
