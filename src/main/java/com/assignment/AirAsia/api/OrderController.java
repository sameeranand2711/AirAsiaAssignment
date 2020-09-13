package com.assignment.AirAsia.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Order")
public class OrderController {

	@GetMapping("/")
	public String Index() {
		return "Hello. Welcome to Order API";
	}
}
