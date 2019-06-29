package com.kodilla.spring.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
	@Autowired
	private Display display;
	double result;

	public double add(double a, double b) {
		result = a + b;
		display.displayValue(result);
		return result;
	};
	public double sub(double a, double b) {
		result = a - b;
		display.displayValue(result);
		return result;
	};
	public double mul(double a, double b) {
		result = a * b;
		display.displayValue(result);
		return result;
	};
	public double div(double a, double b) {
		if(b != 0) {
			result = a / b;
		} else {
			result = 0;
		}
		display.displayValue(result);
		return result;
	};
}
