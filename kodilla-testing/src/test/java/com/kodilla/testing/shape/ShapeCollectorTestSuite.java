package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
	private static int testCounter = 0;

	//TEST SETTINGS
	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("This is the beginning of tests.");
	}
	@AfterClass
	public static void afterAllTests() {
		System.out.println("All tests are finished.");
	}
	@Before
	public void beforeEveryTest() {
		testCounter++;
		System.out.println("Preparing to execute test #" + testCounter);
	}

	@Test //#1
	public void testAddFigure() {
		//Given
		ShapeCollector testCollection = new ShapeCollector();
		Square square = new Square(5.5);
		//When
		testCollection.addFigure(square);
		//Then
		Assert.assertEquals(1, testCollection.getFiguresQuantity());
	}

	@Test //#2
	public void testRemoveFigure() {
		//Given
		ShapeCollector testCollection = new ShapeCollector();
		Square square = new Square(5.5);
		testCollection.addFigure(square);
		//When
		int tempQuantity = testCollection.getFiguresQuantity();
		testCollection.removeFigure(square);
		//Then
		Assert.assertEquals(tempQuantity - 1, testCollection.getFiguresQuantity());
	}

	@Test //#3
	public void testGetFigure() {
		//Given
		ShapeCollector testCollection = new ShapeCollector();
		Square square = new Square(5.5);
		testCollection.addFigure(square);
		//When
		String gettedFigure = testCollection.getFigure(0);
		//Then
		Assert.assertEquals(square.toString(), gettedFigure);
	}
}