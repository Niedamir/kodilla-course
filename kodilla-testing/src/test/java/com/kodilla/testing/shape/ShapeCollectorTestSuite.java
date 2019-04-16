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
		testCollection.removeFigure(square);
		//Then
		Assert.assertEquals(0, testCollection.getFiguresQuantity());
	}
	@Test //#3
	public void testGetFigure() {
		//Given
		ShapeCollector testCollection = new ShapeCollector();
		Square square = new Square(5.5);
		testCollection.addFigure(square);
		//When
		Shape outputFigure = testCollection.getFigure(0);
		//Then
		Assert.assertEquals(square, outputFigure);
	}
	@Test //#4
	public void testShowFigure() {
		//Given
		ShapeCollector testCollection = new ShapeCollector();
		Square square = new Square(2);
		testCollection.addFigure(square);
		String expectedString = "Name: Square Field: 4.0";
		//When
		String outputFigure = testCollection.showFigure(0);
		//Then
		Assert.assertEquals(expectedString, outputFigure);
	}
}