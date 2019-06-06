package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;
import com.kodilla.good.patterns.challenges.ProductOrderService;
import com.kodilla.good.patterns.challenges.submodule2.Delivery;

public class GoodPatternsMain {
	public static void main(String[] args) {
		MovieStore module13_1 = new MovieStore();
		ProductOrderService module13_2 = new ProductOrderService();

		System.out.println("moduł 13.1");
		module13_1.moviesStream();

		System.out.println("\nmoduł 13.2");
		module13_2.process();
	}
}
