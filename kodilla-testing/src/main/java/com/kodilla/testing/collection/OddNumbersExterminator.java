package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator {
	public ArrayList exterminate(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(Integer x : list) {
			if(x % 2 == 0) newList.add(x);
		}
		return newList;
	}
}
