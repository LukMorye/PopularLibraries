package ru.gb.vtitov.popularlibraries.task2.presenter;

import java.util.ArrayList;

import ru.gb.vtitov.popularlibraries.task2.model.Spam;
import ru.gb.vtitov.popularlibraries.task2.model.Subscriber;

public class ObserverPresenter implements ObserverPresenterInterface {

	private Spam spamGenerator = new Spam();
	private ArrayList<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void onTapSubscribe() {
		Subscriber subscriber = new Subscriber();
		spamGenerator.subscribe(subscriber);
		subscribers.add(subscriber);
	}

	@Override
	public void onTapUnsubscribe() {
		if (subscribers.size() == 0) { return; }
		Subscriber subscriber = subscribers.remove(subscribers.size()-1);
		spamGenerator.unsubscribe(subscriber);
	}

	@Override
	public void onTapSpam() {
		spamGenerator.notifyObservers();
	}
}
