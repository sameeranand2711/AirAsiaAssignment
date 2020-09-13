package com.assignment.AirAsia.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseObject<T> {
	private String message;
	private String status;
	
	private T data;
}
