package com.kodilla.testing.shape;

public class Square implements Shape {
	private double a = 0;

	//CONSTRUCTOR
	public Square(double a) {
		this.a = a;
	}

	//METHODS
	public String getShapeName() {
		return "Square";
	}
	public double getField() {
		return a * a;
	}
}
