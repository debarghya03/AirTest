package com.example.Air.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Air.Dao.FlightDao;
import com.example.Air.pojo.FlightDetails;

@Service
public class FlightService {

	@Autowired
	private FlightDao flightDao;

	
	public List<FlightDetails> findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(String name, LocalDate flightDate) {
		return flightDao.findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(name);
	}

	
	public List<FlightDetails> getFlightsByOriginAndDestinationAndFlightDateOrderByFareFare(String origin, String destination,
			LocalDate flightDate) {
		return flightDao.getFlightsByOriginAndDestinationAndFlightDateOrderByFareFare(origin, destination);
	}


	public List<FlightDetails> findByFlightNumberAndOriginAndDestination(int flightNumber, String origin,
			String destination) {
		return flightDao.findByFlightNumberAndOriginAndDestination(flightNumber, origin, destination);
	}
	
	public List<FlightDetails> deleteFlightNumber(int flightNumber) {
		return flightDao.deleteByFlightNumber(flightNumber);
	}

	
	public List<FlightDetails> saveAll(List<FlightDetails> flights) {
		return flightDao.saveAll(flights);
	}
	
	public List<FlightDetails> saveOrUpdate(List<FlightDetails> flights) {
		return flightDao.saveOrUpdate(flights);
	}


}
