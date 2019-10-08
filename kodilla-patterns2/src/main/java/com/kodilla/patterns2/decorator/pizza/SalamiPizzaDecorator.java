package com.kodilla.patterns2.decorator.pizza;

public class SalamiPizzaDecorator extends AbstractPizzaDecorator {
	public SalamiPizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Double getCost() {
		return super.getCost() + 2.5;
	}
	@Override
	public String getDescription() {
		return super.getDescription() + ", salami.";
	}
}
