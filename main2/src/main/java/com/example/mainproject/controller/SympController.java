package com.example.mainproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SympController {
	@GetMapping("/human")
	public String PicHum() {
		return "symp/human";
	}

	@GetMapping("/Snomal")
	public String SympMain() {
		return "symp/Snomal";
	}

	
	 
	
	 
	 
	 
}
