package ru.gb.vtitov.popularlibraries.dagger;

import android.util.Log;

import javax.inject.Inject;

import ru.gb.vtitov.popularlibraries.dagger.app.App;

public class White {

	private final static String TAG = "White";

	@Inject
	Green green;

	public White() {
		App.getAppComponent().inject(this);
	}

	void show() {
		Log.d(TAG, "--> " + green.show() + " --> " + green);
	}
}
