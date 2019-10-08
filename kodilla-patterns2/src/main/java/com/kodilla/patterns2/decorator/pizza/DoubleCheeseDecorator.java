package com.kodilla.patterns2.decorator.pizza;

public class DoubleCheeseDecorator extends AbstractPizzaDecorator {
	public DoubleCheeseDecorator(Pizza pizza) {
			super(pizza);
		}

		@Override
		public Double getCost() {
			return super.getCost() + 2;
		}
		@Override
		public String getDescription() {
			return super.getDescription() + ", additional cheese";
	}
}
