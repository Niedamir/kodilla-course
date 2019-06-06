package com.kodilla.good.patterns.challenges;


import com.kodilla.good.patterns.challenges.submodule2.Order;
import java.util.ArrayList;

public class ProductOrderService {
	private ArrayList<Order> orderList = new ArrayList<Order>();
	private int orderID;

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public void createOrder(Order order) {
		orderList.add(order);
	}
	public void process() {
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
