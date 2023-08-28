package com.example.Air.Dao;


import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Air.pojo.FlightDetails;

@Repository
public interface FlightDao extends JpaRepository {

	// 2.1
	@EntityGraph(attributePaths = { "fare", "flightInfo", "inventory", "flightInfo.airlineInfo" })
	List<FlightDetails> findByFlightInfoAirlineInfoNameOfAirlineAndFlightDate(String name);

	// 2.3
	@EntityGraph(attributePaths = { "fare", "flightInfo", "inventory", "flightInfo.airlineInfo" })
	List<FlightDetails> getFlightsByOriginAndDestinationAndFlightDateOrderByFareFare(String origin, String destination);

	// 2.4
	@EntityGraph(attributePaths = { "fare", "flightInfo", "inventory", "flightInfo.airlineInfo" })
	List<FlightDetails> findByFlightNumberAndOriginAndDestination(int flightNumber, String origin, String destination);

	List<FlightDetails> saveAll(List<FlightDetails> flights);
	List<FlightDetails> deleteByFlightNumber(int flightNumber);

	List<FlightDetails> saveOrUpdate(List<FlightDetails> flights);

	


	
}
