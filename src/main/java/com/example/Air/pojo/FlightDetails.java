package com.example.Air.pojo;

public class FlightDetails {
	
	private int flightnumber;
    private String origin;
    private String destination;
    private String duration;
	
    public int getFlightNumber() {
		return flightnumber;
	}
	public void setFlightNumber(int flightnumber) {
		this.flightnumber = flightnumber;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public FlightDetails(int flightnumber, String origin, String destination, String duration) {
		super();
		this.flightnumber = flightnumber;
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
	}
	
	public FlightDetails() {
		
	}

	
	@Override
	public String toString() {
		return "[flightnumber=" + flightnumber + ", origin=" + origin + ", destination=" + destination + ", duration=" + duration
				+ "]";
	}
	
}
