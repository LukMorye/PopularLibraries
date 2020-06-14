package ru.gb.vtitov.popularlibraries.task2.model;

import android.os.AsyncTask;
import android.util.Log;

import java.util.concurrent.TimeUnit;

public class AsyncModel {

	private final static String TAG = "ASYNC TASK";
	private static boolean isRunning = false;

	public void beginTask() {
		InfinityLogTask task = new InfinityLogTask();
		task.execute();
	}


	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean running) {
		isRunning = running;
	}

	static class InfinityLogTask extends AsyncTask <Void,Void,Void>{

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			Log.d(TAG, "On pre execute method called in thread --> " + Thread.currentThread().getName());
		}

		@Override
		protected Void doInBackground(Void... voids) {
			while (isRunning) {
				try {
					TimeUnit.SECONDS.sleep(1);
					Log.d(TAG, "Happend new event in thread --> " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void aVoid) {
			super.onPostExecute(aVoid);
			Log.d(TAG, "On post execute method called in thread --> " + Thread.currentThread().getName());
		}
	}
}
