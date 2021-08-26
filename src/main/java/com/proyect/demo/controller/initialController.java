package com.proyect.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class initialController {

	@GetMapping("/")
	public String inicio() {
		return "DashBoard";
	}
}
