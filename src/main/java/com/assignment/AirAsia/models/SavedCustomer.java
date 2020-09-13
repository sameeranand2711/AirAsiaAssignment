package com.assignment.AirAsia.models;

import com.assignment.AirAsia.entities.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavedCustomer {

	
	public static SavedCustomer ToModel(Customer entity) {
		SavedCustomer model = null;
		if(entity != null) {
			model = new SavedCustomer();
		}
		return model;
	}
}
