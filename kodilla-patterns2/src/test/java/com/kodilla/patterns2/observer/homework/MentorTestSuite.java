package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
	@Test
	public void testUpdate() {
		//Given
		Mentor mentor = new Mentor("Crevan Espane aep Caomhan Macha");
		HomeworkList student1HomeworkList = new HomeworkList();
		HomeworkList student2HomeworkList = new HomeworkList();
		student1HomeworkList.registerObserver(mentor);
		student2HomeworkList.registerObserver(mentor);
		//When
		student1HomeworkList.addHomework("s1-01");
		student2HomeworkList.addHomework("s2-01");
		student1HomeworkList.addHomework("s1-02");
		//Then
		assertEquals(3, mentor.getUpdateCount());
	}
}