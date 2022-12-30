package com.narenkg.myhomeprint.controllers;

import org.springframework.web.bind.annotation.*;

import com.narenkg.myhomeprint.modal.PrinterSetting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@RequestMapping("")
@Controller
public class PrintController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/print")
	public String greetingForm(Model model) {
		model.addAttribute("printSetting", new PrinterSetting());
		return "print";
	}

	@RequestMapping(value="/print", method=RequestMethod.POST)    
	public String greetingSubmit(@ModelAttribute PrinterSetting settings, Model model) {
		
		if(settings.getMessage().equals("India@123")) {
			model.addAttribute("printSetting", settings);
			return "result";
		} else {
			model.addAttribute("message", "Not a correct password");
			return "error";
		}
		
		
	}
}
