package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
	private String continentName = "";
	List<Country> countries;

	public Continent(String continentName, List<Country> countries) {
		this.continentName = continentName;
		this.countries = countries;
	}

	public List<Country> getCountries() {
		return countries;
	}
}