package com.kodilla.exception.test;

public class Flight {
	String departureAiport;
	String arrivalAirport;

	//CONSTRUCTOR
	public Flight(String departureAiport, String arrivalAirport) {
		this.departureAiport = departureAiport;
		this.arrivalAirport = arrivalAirport;
	}

	//GETTERS
	public String getDepartureAiport() {
		return departureAiport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
}
