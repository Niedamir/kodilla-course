package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator {
	private int i = 0;
	private int x = 0;

	public ArrayList exterminate(ArrayList<Integer> list) {
		//TEST STARTS AND NEVER END
		x = list.size();
		while(i < x) {
			if(list.get(i) % 2 != 0) {
				list.remove(i);
			}
		}
		// NOT WORKING
		/*for(Integer x : list) {
			if(x % 2 != 0) {
				list.remove(x);
			}
		}*/
		return list;
	}
}
