package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkList implements Observable {
	private List<Observer> observers;
	private List<String> homeworkList;

	public HomeworkList() {
		homeworkList = new ArrayList<>();
	}

	public List<String> getHomeworkList() {
		return homeworkList;
	}

	public void addHomework(String homeworkId) {
		homeworkList.add(homeworkId);
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
}