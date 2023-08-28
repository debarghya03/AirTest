package com.example.Air.service;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import com.example.Air.service.*;

public class FlightnotfoundException extends ResourceNotFoundException {
	
	

	


		private static final long serialVersionUID = -4185306016942664972L;
		private static Throwable flightnumber;

		public FlightnotfoundException(String airportId) {
			super("flightnumber",  flightnumber);
		}


}
