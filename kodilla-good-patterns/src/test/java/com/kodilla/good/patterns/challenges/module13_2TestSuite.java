package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.submodule2.Customer;
import com.kodilla.good.patterns.challenges.submodule2.Order;
import com.kodilla.good.patterns.challenges.submodule2.Product;
import org.junit.Test;

import java.util.HashMap;

public class module13_2TestSuite {
	//PREPARE TO TEST
	public Order newOrder() {
		Customer client1 = new Customer("Jan Kowalski", "Bydgoszcz", "Cicha", "85-020", 123456789, "zbyniu@gmail.com");

		HashMap<Product, Integer> productList1 = new HashMap<Product, Integer>();
		productList1.put(new Product("Chaperon", "Nakrycie głowy", 0001, 249.99), 1);
		productList1.put(new Product("Aketon", "Kurtki", 0123, 499.99), 1);
		productList1.put(new Product("Kaleta skórzana", "Torby i kaletki", 2578, 179.99), 3);

		return new Order(client1, productList1, "Paczkomat");
	}
	@Test //#1
	public void testProductOrderService() {
		//Given
		ProductOrderService processor = new ProductOrderService();
		processor.createOrder(newOrder());
		processor.setOrderID(0);
		//When
		processor.process();
		//Then

	}

}
