package com.kodilla.good.patterns.challenges.submodule2;

import java.util.HashMap;
import java.util.Objects;

public class Delivery {
	public HashMap<String, Double> deliveryMap = new HashMap<>();

	public void prepareDeliveryMap() {
		deliveryMap.put("Kurier", 13.50);
		deliveryMap.put("Paczkomat", 8.70);
		deliveryMap.put("Odbiór osobisty", 0.0);
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Delivery delivery = (Delivery) o;
		return Objects.equals(deliveryMap, delivery.deliveryMap);
	}
	@Override
	public int hashCode() {
		return Objects.hash(deliveryMap);
	}

	public HashMap<String, Double> getDeliveryMap() {
		return deliveryMap;
	}
}
