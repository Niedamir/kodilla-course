package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class CollectionTestSuite {
	ArrayList<Integer> inputList = new ArrayList<Integer>();
	ArrayList<Integer> outputList = new ArrayList<Integer>();
	ArrayList<Integer> expectedList = new ArrayList<Integer>();

	@Before
	public void startTest() {
		System.out.println("-- Start test case --");
	}

	@After
	public void endTest() {
		System.out.println("-- Test case end --");
	}

	@Test
	public void testOddNumbersExterminatorEmptyList() {
		//Given
		OddNumbersExterminator testCase1List = new OddNumbersExterminator();
		//When
		outputList = testCase1List.exterminate(inputList);
		//Then
		Assert.assertEquals(expectedList, outputList);
	}
	@Test
	public void testOddNumbersExterminatorNormalList() {
		//Given
		OddNumbersExterminator testCase2List = new OddNumbersExterminator();
		inputList.add(1);
		inputList.add(15);
		inputList.add(22);
		inputList.add(4);
		inputList.add(7);
		expectedList.add(22);
		expectedList.add(4);
		//When
		outputList = testCase2List.exterminate(inputList);
		//Then
		Assert.assertEquals(expectedList, outputList);

	}
}
