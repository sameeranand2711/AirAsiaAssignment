package com.assignment.AirAsia.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Bookings")
@Getter
@Setter
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date from;
	private Date to;
	private Long hotelId;
	private Long roomId;
	private Long customerId;
	private int numberOfGuests;
	
	@OneToOne
	private Customer customer;
	@OneToOne
	private Hotel hotel;
	@OneToOne
	private HotelRoom room;
	
	
	@CreationTimestamp
	private Date createdOn;
	
	@UpdateTimestamp
	private Date updatedOn;
	
	
	public Booking(Date from, Date to, Long hotelId, Long roomId, Long customerId, int numberOfGuests) {
		this.from = from;
		this.to = to;
		this.hotelId = hotelId;
		this.roomId = roomId;
		this.customerId = customerId;
		this.numberOfGuests = numberOfGuests;
	}
}
