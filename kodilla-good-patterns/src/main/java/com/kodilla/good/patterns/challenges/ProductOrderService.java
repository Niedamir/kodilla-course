package com.kodilla.good.patterns.challenges;


import com.kodilla.good.patterns.challenges.submodule2.Customer;
import com.kodilla.good.patterns.challenges.submodule2.DataBase;
import com.kodilla.good.patterns.challenges.submodule2.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductOrderService {
	DataBase base = new DataBase();
	int orderID = 0;

	public void getOrders() {
		base.initializeDataBase();
	}

	public void process() {
		getOrders();
		List<Order> orderList = base.getOrderList();
		if(orderList.get(orderID).isPrepared() == false) {
			System.out.println("Prepare order number: " + orderID);
			System.out.println(orderList.get(orderID).toString());
			orderList.get(orderID).setPrepared(true);
		} else {
			System.out.println("Sending order with" + orderList.get(orderID).getDelivery());
			orderList.remove(orderID);
			System.out.println("Order removed from orderList");
		}
	}
}
