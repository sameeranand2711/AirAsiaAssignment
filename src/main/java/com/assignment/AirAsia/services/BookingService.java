package com.assignment.AirAsia.services;

import org.springframework.stereotype.Service;

import com.assignment.AirAsia.models.NewBooking;
import com.assignment.AirAsia.models.NewCustomer;
import com.assignment.AirAsia.models.SavedBooking;
import com.assignment.AirAsia.models.SavedCustomer;
import com.assignment.AirAsia.models.SavedHotel;
import com.assignment.AirAsia.repository.BookingRepository;
import com.assignment.AirAsia.repository.CustomerRepository;
import com.assignment.AirAsia.repository.HotelRepository;
import com.assignment.AirAsia.response.ResponseObject;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookingService {

	private BookingRepository _bookingRepository;
	private CustomerRepository _customerRepository;
	private HotelRepository _hotelRepository;

	public ResponseObject<SavedBooking> save(NewBooking newBooking) {
		ResponseObject<SavedBooking> response = new ResponseObject<>();
		SavedHotel existingHotel = SavedHotel.ToModel(_hotelRepository.findById(newBooking.getHotelId()).orElse(null));
		if(existingHotel == null) {
			response.setStatus("failed");
			response.setMessage("Hotel does not exist.");
		}
		else {
			SavedCustomer existingCust = SavedCustomer.ToModel(_customerRepository.findByEmail(newBooking.getEmail()));
			if(existingCust == null) {
				NewCustomer newCust = new NewCustomer(newBooking.getFirstName(), newBooking.getLastName(), newBooking.getEmail(), newBooking.getPhoneNumber());
				existingCust = SavedCustomer.ToModel(_customerRepository.save(NewCustomer.ToEntity(newCust)));
			}
			
			SavedBooking savedBooking = SavedBooking.ToModel(_bookingRepository.save(NewBooking.ToBooking(newBooking)));
			response.setStatus("success");
			response.setMessage("Booking created");
			response.setData(savedBooking);
		}
		return response;
	}
}
