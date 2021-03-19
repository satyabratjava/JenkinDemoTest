package com.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JenkinController {

	@GetMapping("/show")
	public  String msg() {
		return "home";
	}
}
