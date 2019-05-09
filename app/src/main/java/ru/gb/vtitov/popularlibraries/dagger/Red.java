package ru.gb.vtitov.popularlibraries.dagger;

import android.util.Log;

import javax.inject.Inject;

import ru.gb.vtitov.popularlibraries.dagger.app.App;

public class Red {

	private final static String TAG = "Red";

	@Inject
	Green green;

	public Red() {
		App.getAppComponent().inject(this);
	}

	void show() {
		Log.d(TAG, "--> " + green.show() + " --> " + green);
	}
}
