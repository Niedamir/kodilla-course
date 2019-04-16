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
		Assert.assertEquals(0, processor.getPostPerUser());
		Assert.assertEquals(0, processor.getCommentsPerUser());
		Assert.assertEquals(0, processor.getCommentsPerPost());
	}
	@Test //#2
	public void testCalculateAdvStatisticsCase2() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		ArrayList<String> users = new ArrayList<String>();
		int i = 0;
		String user = "user";
		while(i < 100) {
			users.add(user);
			i++;
		}
		int postsCount = 1000;
		int commentsCount = 5;
		when(statisticsMock.usersNames()).thenReturn(users);
		when(statisticsMock.postsCount()).thenReturn(postsCount);
		when(statisticsMock.commentsCount()).thenReturn(commentsCount);

		CalculateStatistics processor = new CalculateStatistics();
		//When
		processor.calculateAdvStatistics(statisticsMock);
		//Then
		Assert.assertEquals(100, processor.getUsers());
		Assert.assertEquals(1000, processor.getPosts());
		Assert.assertEquals(5, processor.getComments());
		Assert.assertEquals(1000 / 100, processor.getPostPerUser());
		Assert.assertEquals(5 / 100, processor.getCommentsPerUser());
		Assert.assertEquals(5/ 1000, processor.getCommentsPerPost());
	}
	@Test //#3
	public void testCalculateAdvStatisticsCase3() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		ArrayList<String> users = new ArrayList<String>();
		int i = 0;
		String user = "user";
		while(i < 100) {
			users.add(user);
			i++;
		}
		int postsCount = 20;
		int commentsCount = 0;
		when(statisticsMock.usersNames()).thenReturn(users);
		when(statisticsMock.postsCount()).thenReturn(postsCount);
		when(statisticsMock.commentsCount()).thenReturn(commentsCount);

		CalculateStatistics processor = new CalculateStatistics();
		//When
		processor.calculateAdvStatistics(statisticsMock);
		//Then
		Assert.assertEquals(100, processor.getUsers());
		Assert.assertEquals(20, processor.getPosts());
		Assert.assertEquals(0, processor.getComments());
		Assert.assertEquals(20 / 100, processor.getPostPerUser());
		Assert.assertEquals(0 / 100, processor.getCommentsPerUser());
		Assert.assertEquals(0 / 20, processor.getCommentsPerPost());
	}
	@Test //#4
	public void testCalculateAdvStatisticsCase4() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		ArrayList<String> users = new ArrayList<String>();
		int i = 0;
		String user = "user";
		while(i < 100) {
			users.add(user);
			i++;
		}
		int postsCount = 10;
		int commentsCount = 2;
		when(statisticsMock.usersNames()).thenReturn(users);
		when(statisticsMock.postsCount()).thenReturn(postsCount);
		when(statisticsMock.commentsCount()).thenReturn(commentsCount);

		CalculateStatistics processor = new CalculateStatistics();
		//When
		processor.calculateAdvStatistics(statisticsMock);
		//Then
		Assert.assertEquals(100, processor.getUsers());
		Assert.assertEquals(10, processor.getPosts());
		Assert.assertEquals(2, processor.getComments());
		Assert.assertEquals(10 / 100, processor.getPostPerUser());
		Assert.assertEquals(2 / 100, processor.getCommentsPerUser());
		Assert.assertEquals(2 / 10, processor.getCommentsPerPost());
	}
	@Test //#5
	public void testCalculateAdvStatisticsCase5() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		ArrayList<String> users = new ArrayList<String>();
		int i = 0;
		String user = "user";
		while(i < 100) {
			users.add(user);
			i++;
		}
		int postsCount = 2;
		int commentsCount = 10;
		when(statisticsMock.usersNames()).thenReturn(users);
		when(statisticsMock.postsCount()).thenReturn(postsCount);
		when(statisticsMock.commentsCount()).thenReturn(commentsCount);

		CalculateStatistics processor = new CalculateStatistics();
		//When
		processor.calculateAdvStatistics(statisticsMock);
		//Then
		Assert.assertEquals(100, processor.getUsers());
		Assert.assertEquals(2, processor.getPosts());
		Assert.assertEquals(10, processor.getComments());
		Assert.assertEquals(2 / 100, processor.getPostPerUser());
		Assert.assertEquals(10 / 100, processor.getCommentsPerUser());
		Assert.assertEquals(10 / 2, processor.getCommentsPerPost());
	}
	@Test //#6
	public void testCalculateAdvStatisticsCase6() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		ArrayList<String> users = new ArrayList<String>();
		int postsCount = 10;
		int commentsCount = 15;
		when(statisticsMock.usersNames()).thenReturn(users);
		when(statisticsMock.postsCount()).thenReturn(postsCount);
		when(statisticsMock.commentsCount()).thenReturn(commentsCount);

		CalculateStatistics processor = new CalculateStatistics();
		//When
		processor.calculateAdvStatistics(statisticsMock);
		//Then
		Assert.assertEquals(0, processor.getUsers());
		Assert.assertEquals(10, processor.getPosts());
		Assert.assertEquals(15, processor.getComments());
		Assert.assertEquals(0, processor.getPostPerUser());
		Assert.assertEquals(0, processor.getCommentsPerUser());
		Assert.assertEquals(15 / 10, processor.getCommentsPerPost());
	}
	@Test //#7
	public void testCalculateAdvStatisticsCase7() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		ArrayList<String> users = new ArrayList<String>();
		int i = 0;
		String user = "user";
		while(i < 100) {
			users.add(user);
			i++;
		}
		int postsCount = 10;
		int commentsCount = 2;
		when(statisticsMock.usersNames()).thenReturn(users);
		when(statisticsMock.postsCount()).thenReturn(postsCount);
		when(statisticsMock.commentsCount()).thenReturn(commentsCount);

		CalculateStatistics processor = new CalculateStatistics();
		//When
		processor.calculateAdvStatistics(statisticsMock);
		//Then
		Assert.assertEquals(100, processor.getUsers());
		Assert.assertEquals(10, processor.getPosts());
		Assert.assertEquals(2, processor.getComments());
		Assert.assertEquals(10 / 100, processor.getPostPerUser());
		Assert.assertEquals(2 / 100, processor.getCommentsPerUser());
		Assert.assertEquals(2 / 10, processor.getCommentsPerPost());
	}
}
