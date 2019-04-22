package ru.gb.vtitov.popularlibraries.task2.presenter;

public class RxPresenter implements RxPresenterInterface {

	private final RxViewInterface viewInterface;

	public RxPresenter(RxViewInterface viewInterface) {
		this.viewInterface = viewInterface;
	}

	@Override
	public void onStart() {
		viewInterface.initUIElements();
	}

	@Override
	public void onTapSubscribe() {

	}

	@Override
	public void onTapUnsibscribe() {

	}
}
