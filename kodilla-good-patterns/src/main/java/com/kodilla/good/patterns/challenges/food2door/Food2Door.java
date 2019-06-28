package com.kodilla.good.patterns.challenges.food2door;

public class Food2Door {
	public static void main(String[] args) {
		F2DAdress adress = new F2DAdress();
		Supplier supplier;

		supplier = new ExtraFoodShop();
		supplier.displayDataBase();
		supplier.process(adress);
		supplier.submitOrder();

		System.out.println(" ");

		supplier = new GlutenFreeShop();
		supplier.displayDataBase();
		supplier.process(adress);
		supplier.submitOrder();

		System.out.println(" ");

		supplier = new HealthyShop();
		supplier.displayDataBase();
		supplier.process(adress);
		supplier.submitOrder();
	}
}
