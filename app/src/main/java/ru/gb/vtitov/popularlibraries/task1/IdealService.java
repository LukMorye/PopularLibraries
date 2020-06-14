package ru.gb.vtitov.popularlibraries.task1;


import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class IdealService  {

	private static String TAG = "IdealService";

	public Observable<String> getIdealService() {
		return Observable.create((ObservableOnSubscribe<String>) god -> {
			try {
				for (int i = 0; i < 10; i++) {
					TimeUnit.SECONDS.sleep(1);
					String message = "You got new ideal service by number: " + (i+1) + " from THE GOD!";
					god.onNext(message);
				}
				god.onComplete();
			} catch (InterruptedException e) {
				Log.e(TAG, "Ideal service didn't disposed :(");
			}
		}).subscribeOn(Schedulers.io());
	}

	public Single<String> getOneGodService() {
		return Single.create((SingleOnSubscribe<String>) god -> {
			String result = "You got one of the best god service! You lucky!";
			god.onSuccess(result);
		}).subscribeOn(Schedulers.io());
	}

}
