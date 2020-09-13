package com.assignment.AirAsia.repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.AirAsia.entities.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long> {

}
