package com.kodilla.testing.shape;

public class Circle implements Shape {
	private double pi = 3.14;
	private double r = 0;

	//CONSTRUCTOR
	public Circle(double pi, double r) {
		this.pi = pi;
		this.r = r;
	}

	//METHODS
	public String getShapeName() {
		return "Circle";
	}
	public double getField() {
		return pi * (r * r);
	}
}
