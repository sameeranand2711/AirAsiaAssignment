package com.assignment.AirAsia.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.AirAsia.models.NewBooking;
import com.assignment.AirAsia.models.SavedBooking;
import com.assignment.AirAsia.response.ResponseObject;
import com.assignment.AirAsia.services.BookingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/Booking")
@RequiredArgsConstructor
public class BookingAPI {
	
	private BookingService _bookingService;
	
	@GetMapping("/")
	public String Index() {
		return "Hello. Welcome to Order API";
	}
	
	@PostMapping("/create")
	public ResponseEntity create(@RequestBody NewBooking model) {
		ResponseObject<SavedBooking> response = _bookingService.save(model);
		return ResponseEntity.ok(response);
	}
}
