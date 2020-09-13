package com.assignment.AirAsia.models;

import com.assignment.AirAsia.entities.Hotel;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SavedHotel {

	private String name;
	
	
	
	public static SavedHotel ToModel(Hotel entity) {
		SavedHotel model = null;
		if(entity != null) {
			model = new SavedHotel();
			model.setName(entity.getName());
		}
		return model;
	}
}
