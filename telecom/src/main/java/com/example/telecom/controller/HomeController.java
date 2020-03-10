package com.example.telecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/")
@ApiIgnore
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "login";
	}
	@RequestMapping("/")
	public String home2() {
		return "redirect:swagger-ui.html";
	}

}