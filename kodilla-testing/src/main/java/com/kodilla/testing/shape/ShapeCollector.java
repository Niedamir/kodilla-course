package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
	public ArrayList<Shape> figures = new ArrayList<Shape>();
	String figureString = "";

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
	public Shape getFigure(int n) {
		return figures.get(n);
	}
	public String showFigure(int n) {
		figureString = "Name: " + figures.get(n).getShapeName() + " Field: " + figures.get(n).getField();
		return figureString;
	}
}
