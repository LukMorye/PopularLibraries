package ru.gb.vtitov.popularlibraries.noDI;

import android.util.Log;

public class White {
	private static String TAG = "White";

	public White() {
		Green green = new Green();
		Log.d(TAG, "--> " + green.show() + " --> " + green);
	}
}
