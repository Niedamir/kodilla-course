package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
	private String countryName = "";
	private BigDecimal countryPopulation = new BigDecimal("0");

	public Country(String countryName, BigDecimal countryPopulation) {
		this.countryName = countryName;
		this.countryPopulation = countryPopulation;
	}

	public String getCountryName() {
		return countryName;
	}

	public final BigDecimal getPeopleQuantity() {
		return countryPopulation;
	}
}