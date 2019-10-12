package com.kodilla.good.patterns.challenges.submodule2;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Order {
	private Customer customer;
	private HashMap<Product, Integer> productList;
	private String delivery;
	private Double toPay;
	private boolean isPrepared = false;

	public Order() { }
	public Order(Customer customer, HashMap<Product, Integer> productList, String delivery) {
		this.customer = customer;
		this.productList = productList;
		this.delivery = delivery;
		this.toPay = new Payment().calculatePayment(productList, delivery);
	}

	public Double getToPay() {
		return toPay;
	}
	public HashMap<Product, Integer> getProductList() {
		return productList;
	}
	public Customer getCustomer() {
		return customer;
	}
	public String getDelivery() {
		return delivery;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isPrepared() {
		return isPrepared;
	}
	public void setPrepared(boolean prepared) {
		isPrepared = prepared;
	}

	@Override
	public String toString() {
		String mapAsString = productList.entrySet().stream()
			.map(key -> key + "=" + productList.get(key))
			.collect(Collectors.joining(", ", "{", "}"));
		return "Order{" +
			"customer=" + customer.toString() +
			"\n productList=" + mapAsString +
			"\n delivery='" + delivery + '\'' +
			"\n toPay=" + toPay +
			'}';
	}
}
