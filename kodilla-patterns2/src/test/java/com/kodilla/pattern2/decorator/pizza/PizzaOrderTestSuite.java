package com.kodilla.pattern2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Test;

public class PizzaOrderTestSuite {
	@Test
	public void testPizzaWithSalami() {
		//Given
		Pizza pizza = new BasicPizza();
		pizza = new SalamiPizzaDecorator(pizza);
		//When
		Double theCost = pizza.getCost();
		//Then
		Assert.assertEquals(17.5, theCost, 0);
	}
	@Test
	public void testPizzaWithSalamiAndDoubleCheese() {
		//Given
		Pizza pizza = new BasicPizza();
		pizza = new SalamiPizzaDecorator(pizza);
		pizza = new DoubleCheeseDecorator(pizza);
		//When
		Double theCost = pizza.getCost();
		//Then
		Assert.assertEquals(19.5, theCost, 0);
	}
	@Test
	public void testPizzaWithAll() {
		//Given
		Pizza pizza = new BasicPizza();
		pizza = new SalamiPizzaDecorator(pizza);
		pizza = new DoubleCheeseDecorator(pizza);
		pizza = new PepperoniPizzaDecorator(pizza);
		//When
		Double theCost = pizza.getCost();
		//Then
		Assert.assertEquals(27, theCost, 0);
	}
}
