package ru.gb.vtitov.popularlibraries.task2.model;

import android.util.Log;

import java.util.ArrayList;

public class Spam implements Subject {

	private final String TAG = "SPAM";
	private final ArrayList<Observer> subscribers;

	public Spam() {
		subscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer subscriber) {
		subscribers.add(subscriber);
		Log.d("TAG","Registered new subscriber by name: Subscriber"+ subscribers.size());
	}

	@Override
	public void unsubscribe(Observer subscriber) {
		if (subscribers.contains(subscriber)) {
			subscribers.remove(subscriber);
			Log.d(TAG,"Subscriber unsubscribed :((");
		}

	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < subscribers.size(); i++) {
			Observer subscriber = subscribers.get(i);
			subscriber.update("Subscruber-"+(i+1), "\nCongrat! New spam here!");
		}
	}
}
