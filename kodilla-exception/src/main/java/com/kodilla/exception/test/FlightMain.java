package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class FlightMain {
	public static void main(String[] args) {
		FlightFinder searchingProcessor = new FlightFinder();
		boolean isCanFly;

		List<Flight> flightsList = new ArrayList<>();
		flightsList.add(new Flight("Edinburgh", "Athina"));
		flightsList.add(new Flight("Palermo", "Moscov"));
		flightsList.add(new Flight("Cadiz", "Stockholm"));
		flightsList.add(new Flight("Athina", "Vilno"));
		flightsList.add(new Flight("Sarajevo", "Sevastopol"));

		for(Flight flight : flightsList) {
			try {
				isCanFly = searchingProcessor.findFlight(flight);
				System.out.println("Can fly from " + flight.getDepartureAiport() + " to " + flight.getArrivalAirport() + ": " + isCanFly);
			} catch(RouteNotFoundException e) {
				System.out.println("Exception is occured: " + e);
			}
		}
	}

}
