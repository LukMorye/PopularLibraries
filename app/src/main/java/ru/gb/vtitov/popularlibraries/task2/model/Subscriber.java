package ru.gb.vtitov.popularlibraries.task2.model;

import android.util.Log;

public class Subscriber implements Observer {

	@Override
	public void update(String name, String message) {
		Log.d("Subscriber",
						"New spam message to subscriber: " + name +
							"Message: " + message);
	}
}
