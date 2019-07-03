package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
	@Test
	public void testDefaultSharingStrategies() {
		//Given
		User littlefinger = new Millenials("Petyr Baelish");
		User halfman = new YGeneration("Thyrion Lannister");
		User theGirl = new ZGeneration("Arya Stark");
		//When
		String littleFingerDefaultMedium = littlefinger.sharePost();
		System.out.println(littlefinger.getUserName() + " default social medium is: " +  littleFingerDefaultMedium);
		String halfmanDefaultMedium = halfman.sharePost();
		System.out.println(halfman.getUserName() + " default social medium is: " +  halfmanDefaultMedium);
		String theGirlDefaultMedium = theGirl.sharePost();
		System.out.println(theGirl.getUserName() + " default social medium is: " +  theGirlDefaultMedium);
		//Then
		Assert.assertEquals("Facebook", littleFingerDefaultMedium);
		Assert.assertEquals("Twitter", halfmanDefaultMedium);
		Assert.assertEquals("Snapchat", theGirlDefaultMedium);
	}

	@Test
	public void testIndividualSharingStategy() {
		//Given
		User motherOfDragons = new YGeneration("Daenerys Targaryen");
		//When
		String motherOfDragonsDefaultMedium = motherOfDragons.sharePost();
		System.out.println( motherOfDragons.getUserName() + " default social medium is: " + motherOfDragonsDefaultMedium);
		motherOfDragons.setSocialPublisher(new FacebookPublisher());
		motherOfDragonsDefaultMedium = motherOfDragons.sharePost();
		System.out.println("Social medium for " + motherOfDragons.getUserName() + " changed to: " + motherOfDragonsDefaultMedium);
		//Then
		Assert.assertEquals("Facebook", motherOfDragonsDefaultMedium);

	}
}
