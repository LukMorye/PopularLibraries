package ru.gb.vtitov.popularlibraries.di;

import android.util.Log;

public class Red {

	private static String TAG = "Red";

	public Red(Green green) {
		Log.d(TAG, "--> " + green.show() + " --> " + green);
	}
}
