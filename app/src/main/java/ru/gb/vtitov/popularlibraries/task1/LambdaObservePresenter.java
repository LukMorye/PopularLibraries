package ru.gb.vtitov.popularlibraries.task1;


import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;


public class LambdaObservePresenter implements LambdaObservePresenterInterface {

	private static String TAG = "LambdaObservePresenter";

	private final LambdaObserveViewInterface viewInterface;
	private final IdealService service = new IdealService();
	private Observable<String> observable;
	private Single<String> single;
	private Disposable disposable;
	private Disposable singleDisposable;

	public LambdaObservePresenter(LambdaObserveViewInterface viewInterface) {
		this.viewInterface = viewInterface;
	}

	@Override
	public void onStart() {
		viewInterface.initViewElements();
		observable = service.getIdealService();
		single = service.getOneGodService();
	}

	@Override
	public void onTapSubscribe() {
		disposable = observable
						.observeOn(AndroidSchedulers.mainThread())
						.subscribe(
										string -> viewInterface.printMessage(string),
										throwable -> viewInterface.printErrorMessage("Error: " + throwable),
										() -> viewInterface.printMessage("God services end :(. Pay more money and get it again!")
						);
	}

	@Override
	public void onTapUnsubscribe() {
		disposable.dispose();
	}

	@Override
	public void onTapServiceFromGod() {
		singleDisposable = single
						.observeOn(AndroidSchedulers.mainThread())
						.subscribe(string -> viewInterface.printMessage(string),
										throwable -> viewInterface.printErrorMessage("Error: " + throwable)
						);
	}
}
