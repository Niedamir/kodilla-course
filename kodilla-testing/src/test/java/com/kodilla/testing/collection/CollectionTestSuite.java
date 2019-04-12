package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class CollectionTestSuite {
	ArrayList<Integer> testEvenList = new ArrayList<Integer>();

	@Before
	public void startTest() {
		System.out.println("-- Start test case --");
	}

	@After
	public void endTest() {
		System.out.println("-- Test case ended --");
	}

	@Test
	public void testOddNumbersExterminatorEmptyList() {
		//Given
		OddNumbersExterminator testCase1List = new OddNumbersExterminator();
		//When
		ArrayList<Integer> testList1 = new ArrayList<Integer>()
		testEvenList = testCase1List.exterminate(testList1);
		//Then
		if () {
			System.out.println("Test case 1 passed");
		} else {
			System.out.println("Error! Test case1 failed");
		}
	}
	@Test
	public void testOddNumbersExterminatorNormalList() {
		//Given
		OddNumbersExterminator testCase2List = new OddNumbersExterminator();
		//When
		ArrayList<Integer> testList2 = new ArrayList<Integer>();
		int i = 0;
		while (i < 10) {
			testList2.add(i);
			i++;
		}
		testEvenList = testCase2List.exterminate(testList2);
		//Then
		if () {
			System.out.println("Test case 2 passed");
		} else {
			System.out.println("Error! Test case 2 failed");
		}
	}
}
