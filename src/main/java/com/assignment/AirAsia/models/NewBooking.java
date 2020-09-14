package com.assignment.AirAsia.models;

import java.util.Date;

import com.assignment.AirAsia.entities.Booking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewBooking {
	private Long customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	private Long hotelId;
	private String hotelName;
	
	private Long roomId;
	private String roomName;
	private int numberOfGuests;
	
//	private float unitAmount;
//	private float totalAmount;
	
	private Date from;
	private Date to;
	
	
	public static Booking ToBooking(NewBooking model) {
		Booking entity = null;
		if(model == null) return null;
		entity = new Booking(model.from, model.to, model.hotelId, model.roomId, model.customerId, model.numberOfGuests);
		return entity;
	}
}
