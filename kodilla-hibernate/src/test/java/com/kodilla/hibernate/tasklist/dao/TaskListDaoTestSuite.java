package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
	private static final String DESCRIPTION = "Test: Learn Hibernate";
	private static final String LISTNAME = "module 17.2";
	@Autowired
	private TaskListDao taskListDao;

	@Test
	public void testFindByListName() {
		//Given
		TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
		taskListDao.save(taskList);
		String listName = taskList.getListName();
		//When
		List<TaskList> readTaskList = taskListDao.findByListName(listName);
		//Then
		Assert.assertEquals("module 17.2", readTaskList.get(0).getListName());

		//CleanUp
		int id = readTaskList.get(0).getId();
		taskListDao.deleteById(id);
	}
}
