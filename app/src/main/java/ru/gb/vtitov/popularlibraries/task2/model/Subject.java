package ru.gb.vtitov.popularlibraries.task2.model;

public interface Subject {

	void subscribe(Observer subscriber);
	void unsubscribe(Observer subscriber);
	void notifyObservers();
}
