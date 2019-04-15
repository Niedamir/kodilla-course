package com.kodilla.testing.shape;

public class Triangle implements Shape {
	private double a = 0;
	private double h = 0;

	//CONSTRUCTOR
	public Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}

	//METHODS
	public String getShapeName() {
		return "Square";
	}
	public double getField() {
		return (a / 2) * h;
	}
}
