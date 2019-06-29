package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
	@Test
	public void testTaskAdd() {
		//Given
		ApplicationContext context =
			new AnnotationConfigApplicationContext("com.kodilla.spring");
		Board board = context.getBean(Board.class);
		board.getToDoList().getTasks().add("task to do");
		board.getInProgressList().getTasks().add("task in progress");
		board.getDoneList().getTasks().add("done task");
		//When
		String taskToDo = board.getToDoList().getTasks().get(0);
		String taskInProgress = board.getInProgressList().getTasks().get(0);
		String doneTask = board.getDoneList().getTasks().get(0);
		//Then
		Assert.assertEquals("task to do", taskToDo);
		Assert.assertEquals("task in progress", taskInProgress);
		Assert.assertEquals("done task", doneTask);
	}
}
