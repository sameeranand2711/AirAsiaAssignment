package com.assignment.AirAsia.models;

import com.assignment.AirAsia.entities.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewCustomer {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	
	public NewCustomer(String firstName, String lastName, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	
	public static Customer ToEntity(NewCustomer model) {
		Customer entity = null;
		if(model != null) {
			entity = new Customer();
			entity.setFirstName(model.firstName);
			entity.setLastName(model.lastName);
			entity.setEmail(model.email);
			entity.setPhone(model.phone);
		}
		return entity;
	}
}
