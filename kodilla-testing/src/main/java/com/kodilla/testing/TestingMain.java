package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;

		Calculator calc = new Calculator();
		//adding test
		if (calc.add(a, b) == a + b) {
			System.out.println("adding test: OK");
		} else {
			System.out.println("adding test: Error!");
		}
		//subtract test
		if (calc.subtract(a, b) == a - b) {
			System.out.println("subtract test: OK");
		} else {
			System.out.println("subtract test: Error!");
		}
	}
}
