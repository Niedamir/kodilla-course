package com.kodilla.good.patterns.challenges.submodule2;

import java.util.HashMap;
import java.util.Map;

public class Payment {
	private Double payment;
	Delivery deliveryCost = new Delivery();

	public Double calculatePayment(HashMap theOrder, String delivery) {
		deliveryCost.prepareDeliveryMap();
		HashMap<Product,Integer> theOrderMap = theOrder;
		for(Map.Entry<Product, Integer> entry : theOrderMap.entrySet()) {
			Product key = entry.getKey();
			Integer value = entry.getValue();
			payment =+ (value * key.getProductPrice());
		}
		return payment + deliveryCost.getDeliveryMap().get(delivery);
	}
}
