package com.kodilla.patterns2.decorator.pizza;

public class PepperoniPizzaDecorator extends AbstractPizzaDecorator {
	public PepperoniPizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Double getCost() {
		return super.getCost() + 7.5;
	}
	@Override
	public String getDescription() {
		return super.getDescription() + ", pepperoni, mushrooms, ham.";
	}
}