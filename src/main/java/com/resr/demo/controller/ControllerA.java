package com.resr.demo.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerA {


	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}

	
	
}
