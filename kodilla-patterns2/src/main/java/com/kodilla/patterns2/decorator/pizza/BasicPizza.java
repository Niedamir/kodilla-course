package com.kodilla.patterns2.decorator.pizza;

public class BasicPizza implements Pizza {
	@Override
	public Double getCost() { return new Double(15); }
	@Override
	public String getDescription() {
		return "Pizza with: sauce, cheese";
	}
}
