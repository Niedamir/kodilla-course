package com.kodilla.good.patterns.challenges.food2door;

public class Food2Door {
	public static void main(String[] args) {
		Supplier supplier;

		supplier = new ExtraFoodShop();
		supplier.displayDataBase();
		supplier.process();
		supplier.submitOrder();

		supplier = new GlutenFreeShop();
		supplier.displayDataBase();
		supplier.process();
		supplier.submitOrder();

		supplier = new HealthyShop();
		supplier.displayDataBase();
		supplier.process();
		supplier.submitOrder();
	}
}
