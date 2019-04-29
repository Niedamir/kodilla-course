package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
	List<Country> asianCountries = new ArrayList<Country>();
	List<Country> africanCountries = new ArrayList<Country>();
	List<Country> europeanCountries = new ArrayList<Country>();
	List<Continent> continents = new ArrayList<Continent>();

	public void generateLists() {
		asianCountries.add(new Country("China", new BigDecimal("1754500005")));
		asianCountries.add(new Country("India", new BigDecimal("1287000978")));
		asianCountries.add(new Country("Iran", new BigDecimal("75450001")));
		asianCountries.add(new Country("Georgia", new BigDecimal("2478376")));

		africanCountries.add(new Country("Egypt", new BigDecimal("52095032")));
		africanCountries.add(new Country("Kongo", new BigDecimal("67787302")));
		africanCountries.add(new Country("Nigeria", new BigDecimal("2342958783")));

		europeanCountries.add(new Country("Poland", new BigDecimal("38209392")));
		europeanCountries.add(new Country("France", new BigDecimal("72568545")));
		europeanCountries.add(new Country("Italy", new BigDecimal("50998387")));
		europeanCountries.add(new Country("Croatia", new BigDecimal("22832023")));
		europeanCountries.add(new Country("Monaco", new BigDecimal("894532")));

		continents.add(new Continent("Asia", asianCountries));
		continents.add(new Continent("Africa", africanCountries));
		continents.add(new Continent("Europe", europeanCountries));
	}

	@Test
	public void testGetPeopleQuantity() {
		//GIVEN
		World world = new World();
		//WHEN
		BigDecimal result = world.getPeopleQuantity(continents);
		//THEN
		Assert.assertEquals(new BigDecimal("5767773356"), result);
	}
}