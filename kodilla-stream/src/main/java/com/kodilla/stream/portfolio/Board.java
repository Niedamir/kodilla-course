package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {
	private final List<TaskList> taskLists = new ArrayList<>();
	private final String name;

	//CONSTRUCTOR
	public Board(final String name) {
		this.name = name;
	}

	//GETTERS
	public String getName() {
		return name;
	}
	public List<TaskList> getTaskLists() {
		return new ArrayList<>(taskLists);
	}

	//TO STRING
	@Override
	public String toString() {
		return "Board{" +
			"taskLists=" + taskLists +
			", name='" + name + '\'' +
			'}';
	}

	//CODE
	public void addTaskList(TaskList taskList) {
		taskLists.add(taskList);
	}
	public boolean removeTaskList(TaskList taskList) {
		return taskLists.remove(taskList);
	}
}
