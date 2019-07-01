package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
	@Test
	public void testGetLastLog() {
		//Given\
		Logger.getInstance().log("example log");
		//When
		String testLog = Logger.getInstance().getLastLog();
		System.out.println("Last log: " + testLog);
		//Then
		Assert.assertEquals("example log", testLog);
	}
}
