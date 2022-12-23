package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Message {

	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/status")
	public String getMsg() {
		return "Got hit";
	}

}
