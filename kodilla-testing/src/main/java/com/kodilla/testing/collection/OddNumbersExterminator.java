package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator {
	private int i = 0;
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

	public ArrayList exterminate(ArrayList<Integer> numbers) {
		if(i % 2 == 0) {
			evenNumbers.add(i);
		}
		return evenNumbers;
	}
}
