package com.example.Air.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Air.pojo.FlightDetails;
import com.example.Air.service.FlightService;

public class FlightRestController<SearchCriteria> {
	@Autowired
	private FlightService flightService;

	@RequestMapping(value = "/getFlightNumberAndOriginAndDestination", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = 
			MediaType.APPLICATION_JSON_VALUE )
	public List<FlightDetails> getFlightByNumberFlightDateFlightTime(@RequestBody FlightDetails flight) {
		System.out.println(flight.getFlightNumber());

		return flightService.findByFlightNumberAndOriginAndDestination(flight.getFlightNumber(), flight.getOrigin(), flight.getDestination());
	}
	
	@DeleteMapping("/FlightDetails/{FlightNumber}")  
	private void deleteFlight(@PathVariable("FlightNumber") int FlightNumber)   
	{  
		flightService.deleteFlightNumber(FlightNumber);  
	}  

	@PutMapping("/FlightDetails")  
	private FlightDetails update(@RequestBody FlightDetails FlightNumber)   
	{  
		flightService.saveOrUpdate((List<FlightDetails>) FlightNumber);  
	return FlightNumber;  
	}  

}
