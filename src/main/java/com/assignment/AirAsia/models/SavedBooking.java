package com.assignment.AirAsia.models;

import java.util.Date;

import com.assignment.AirAsia.entities.Booking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavedBooking {
	
	private Date from;
	private Date to;
	private String hotelName;
	private String customerName;
	private String customerEmail;
	private int numberOfGuests;
	
	
	public static SavedBooking ToModel(Booking entity) {
		SavedBooking model = null;
		if(entity != null) {
			model = new SavedBooking();
			model.from = entity.getFrom();
			model.to = entity.getTo();
			model.hotelName = entity.getHotel().getName();
			model.customerName = entity.getCustomer().getFirstName() + " " + entity.getCustomer().getLastName();
			model.customerEmail = entity.getCustomer().getEmail();
			model.numberOfGuests = entity.getNumberOfGuests();
		}
		return model;
	}
}
