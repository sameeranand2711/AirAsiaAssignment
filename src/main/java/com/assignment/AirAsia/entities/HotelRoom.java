package com.assignment.AirAsia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "HotelRooms")
@Getter
@Setter
public class HotelRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int numberOfSingleBeds;
	private int numberOfDoubleBeds;
	private int roomCapacity;
	
	private boolean isOccupied;
}
