package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
	public final BigDecimal getPeopleQuantity(List<Continent> continents) {
		BigDecimal worldPopulation = continents.stream()
			.flatMap(continent -> continent.getCountries().stream())
			.map(Country::getPeopleQuantity)
			.reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
		return worldPopulation;
	}
}