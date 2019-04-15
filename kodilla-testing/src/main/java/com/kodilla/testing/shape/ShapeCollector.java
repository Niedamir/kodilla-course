package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
	public ArrayList<Shape> figures = new ArrayList<Shape>();

	//METHODS
	public void addFigure(Shape shape) {
		figures.add(shape);
	}
	public void removeFigure(Shape shape) {
		figures.remove(shape);
	}
	public int getFiguresQuantity() {
		return figures.size();
	}
	public String getFigure(int n) {
		return figures.get(n).toString();
	}
}
