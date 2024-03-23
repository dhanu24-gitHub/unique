package com.unique.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniqueController {
	
	@GetMapping(value = "/love")
	public String getLove() {
		return "I LOVE YOU <3";
	}

}
