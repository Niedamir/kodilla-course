package com.kodilla.good.patterns.challenges.submodule2;


import java.util.ArrayList;

public class Order {
	private Customer customer;
	private ArrayList<Product> theOrder;

	public Order(Customer customer, ArrayList<Product> theOrder) {
		this.customer = customer;
		this.theOrder = theOrder;
	}
}
