package ru.gb.vtitov.popularlibraries.di;

import android.util.Log;

public class White {
	private static String TAG = "White";

	public White(Green green) {
		Log.d(TAG, "--> " + green.show() + " --> " + green);
	}
}
