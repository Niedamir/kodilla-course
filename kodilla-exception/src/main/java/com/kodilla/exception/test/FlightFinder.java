package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
	public boolean findFlight (Flight flight) throws RouteNotFoundException {
		Map<String, Boolean> flightsMap = new HashMap<String, Boolean>();
		flightsMap.put("Athina", true);
		flightsMap.put("Edinburgh", true);
		flightsMap.put("Cadiz", false);
		flightsMap.put("Stockholm", false);
		flightsMap.put("Palermo", true);
		flightsMap.put("Moscov", false);

		if (flightsMap.containsKey(flight.getArrivalAirport())) {
			if(flightsMap.containsValue(true)) {
				return true;
			} else {
				return false;
			}
		} else {
			throw new RouteNotFoundException();
		}
	}

}
