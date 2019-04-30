package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationTestSuite {

	@Test
	public void testGetAverage() {
		//GIVEN
		int[] numbers = new int[20];
		numbers[0] = 4;
		numbers[1] = 5;
		numbers[2] = 1;
		numbers[3] = 1;
		numbers[4] = 2;
		numbers[5] = 3;
		numbers[6] = 3;
		numbers[7] = 3;
		numbers[8] = 2;
		numbers[9] = 2;
		numbers[10] = 4;
		numbers[11] = 5;
		numbers[12] = 5;
		numbers[13] = 6;
		numbers[14] = 5;
		numbers[15] = 1;
		numbers[16] = 3;
		numbers[17] = 2;
		numbers[18] = 5;
		numbers[19] = 4;
		//WHEN
		double result = ArrayOperations.getAverage(numbers);
		//THEN
		Assert.assertEquals(3.3, result, 0.1);
	}
}
