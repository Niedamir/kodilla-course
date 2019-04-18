package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator {
	public ArrayList exterminate(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(Integer x : list) {
			if(x % 2 == 0) newList.add(x);
		}
		return newList;

		//OLD METHOD - WORKS :)
		/*
		int i = 0;
		int x = list.size();
		while(i < x) {
			if(list.get(i) % 2 != 0) {
				list.remove(i);
			}
			i++;
		}
		return list; */
	}
}
