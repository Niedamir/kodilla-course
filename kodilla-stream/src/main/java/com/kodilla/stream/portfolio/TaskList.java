package com.kodilla.stream.portfolio;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class TaskList {
	private final List<Task> tasks = new LinkedList<>();
	private final String name;

	//CONSTRUCTOR
	public TaskList(final String name) {
		this.name = name;
	}

	//GETTERS
	public List<Task> getTasks() {
		return new LinkedList<>(tasks);
	}
	public String getName() {
		return name;
	}

	//TO STRING
	@Override
	public String toString() {
		return "TaskList{" +
			"tasks=" + tasks +
			", name='" + name + '\'' +
			'}';
	}

	//EQUALS
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		TaskList taskList = (TaskList) o;
		return Objects.equals(name, taskList.name);
	}

	//CODE
	public void addTask(Task task) {
		tasks.add(task);
	}
	public boolean removeTask(Task task) {
		return tasks.remove(task);
	}
}
