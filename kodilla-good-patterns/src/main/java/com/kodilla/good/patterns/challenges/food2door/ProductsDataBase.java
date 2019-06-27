package main.java.com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ProductsDataBase {
	Map<String, Integer> extraFoodShopProducts = new HashMap<>();
	Map<String, Integer> healthyShopProducts = new HashMap<>();
	Map<String, Integer> glutenFreeShopProducts = new HashMap<>();

	void dataBaseInitialization() {
		extraFoodShopProducts.put("marchew", 250);
		extraFoodShopProducts.put("jabłko", 125);
		extraFoodShopProducts.put("pietruszka", 83);

		healthyShopProducts.put("olej kokosowy", 22);
		healthyShopProducts.put("mąka żytnia typ 2000", 9);
		healthyShopProducts.put("makaron pełnoziarnisty żytni", 17);

		glutenFreeShopProducts.put("makaron z ciecierzycy", 7);
		glutenFreeShopProducts.put("chleb bezglutenowy", 8);
		glutenFreeShopProducts.put("pierogi bezglutenowe - paczka", 13);
	}

	public Map<String, Integer> getExtraFoodShopProducts() {
		return extraFoodShopProducts;
	}
	public Map<String, Integer> getHealthyShopProducts() {
		return healthyShopProducts;
	}
	public Map<String, Integer> getGlutenFreeShopProducts() {
		return glutenFreeShopProducts;
	}
}
