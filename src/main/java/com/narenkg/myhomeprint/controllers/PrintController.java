package com.narenkg.myhomeprint.controllers;

import org.springframework.web.bind.annotation.*;

@RequestMapping("")
@RestController
public class PrintController {

	@GetMapping("/hello")
	public String health() {
		return "Hello World";
	}
}
