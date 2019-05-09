package ru.gb.vtitov.popularlibraries.noDI;

import android.util.Log;

public class Red {

	private static String TAG = "Red";

	public Red() {
		Green green = new Green();
		Log.d(TAG, "--> " + green.show() + " --> " + green);
	}
}
