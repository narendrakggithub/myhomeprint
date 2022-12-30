package com.narenkg.myhomeprint.controllers;

import org.springframework.web.bind.annotation.*;

import com.narenkg.myhomeprint.modal.PrinterSetting;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@RequestMapping("")
@Controller
public class PrintController {

	ArrayList<PrinterSetting> printerSettings = new ArrayList<PrinterSetting>();

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/print")
	public String greetingForm(Model model) {
		PrinterSetting settings = new PrinterSetting();
		settings.setPageNumbers("1-2");
		settings.setBothSide(true);
		settings.setIsColor(false);
		settings.setLandscape(true);
		settings.setPagesPerSheet(1);
		settings.setMessage("India@123");
		model.addAttribute("printSetting", settings);
		return "print";
	}

	@RequestMapping(value = "/print", method = RequestMethod.POST)
	public String greetingSubmit(@ModelAttribute PrinterSetting settings, Model model) {
		

		if (settings.getMessage().equals("India@123")) {
			model.addAttribute("printSetting", settings);
			printerSettings.add(settings);
			System.out.println("Size:"+printerSettings.size());
			return "result";
		} else {
			model.addAttribute("message", "Not a correct password");
			return "error";
		}
	}

	@GetMapping("/getprint")
	public String getPrint(Model model) {
		String output = "";
		for (PrinterSetting setting : printerSettings) {
			output = output + setting.getPageNumbers() + ";" + setting.getBothSide() + ";" + setting.getIsColor() + ";"
					+ setting.getLandscape() + ";" + setting.getPagesPerSheet() + ";;;";
		}
		//printerSettings.clear();
		model.addAttribute("message", output);
		return "printpages";
	}
}
