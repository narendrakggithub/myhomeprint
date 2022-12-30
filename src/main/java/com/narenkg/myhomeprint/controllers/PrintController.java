package com.narenkg.myhomeprint.controllers;

import org.springframework.web.bind.annotation.*;

@RequestMapping("")
@RestController
public class PrintController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/print")
	public String print() {
		return "Hello World";
	}
}
