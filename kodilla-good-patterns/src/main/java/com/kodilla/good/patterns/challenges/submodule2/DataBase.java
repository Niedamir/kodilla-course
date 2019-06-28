package com.kodilla.good.patterns.challenges.submodule2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBase {
	List<Customer> customers = new ArrayList<>();
	HashMap<Product, Integer> orderNo1ProductsList = new HashMap<>();
	List<Order> orderList = new ArrayList<>();

	public void initializeDataBase() {
		customers.add(new Customer("Zdzichu", "Bydgoszcz", "Sułkowskiego", "85-691", 123456789, "zdzichu@gmail.com"));
		orderNo1ProductsList.put(new Product("Trampki", "Buty", 143, 49.99), 1);
		orderNo1ProductsList.put(new Product("śrubokręt", "Narzędzia", 2938, 19.99 ), 3);
		orderList.add(new Order(customers.get(0), orderNo1ProductsList, "Kurier"));
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	public HashMap<Product, Integer> getOrderNo1ProductsList() {
		return orderNo1ProductsList;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
}
