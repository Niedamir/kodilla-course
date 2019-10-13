package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
	private String name;
	private int updateCount;

	public Mentor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public int getUpdateCount() {
		return updateCount;
	}

	@Override
	public void update(HomeworkList homeworkList) {
		System.out.println(name + ": New homework i queue" + "\n" +
			" (total: " + homeworkList.getHomeworkList().size() + " tasks in queue)");
		updateCount++;
	}
}
