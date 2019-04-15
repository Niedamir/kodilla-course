package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
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
	public void testCalculateAdvStatisticsCase1() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		ArrayList<String> users = new ArrayList<String>();
		int i = 0;
		String user = "user";
		while(i < 100) {
			users.add(user);
			i++;
		}
		int postsCount = 0;
		int commentsCount = 5;
		when(statisticsMock.usersNames()).thenReturn(users);
		when(statisticsMock.postsCount()).thenReturn(postsCount);
		when(statisticsMock.commentsCount()).thenReturn(commentsCount);

		CalculateStatistics processor = new CalculateStatistics();
		//When
		processor.calculateAdvStatistics(statisticsMock);
		//Then
		Assert.assertEquals(100, processor.getUsers());
		Assert.assertEquals(0, processor.getPosts());
		Assert.assertEquals(5, processor.getComments());
		Assert.assertEquals(0, processor.getPostPerUser(), 0.001);
		Assert.assertEquals(0.05, processor.getCommentsPerUser(),0.001);
		Assert.assertEquals(0, processor.getCommentsPerPost(), 0.001);
	}
}
