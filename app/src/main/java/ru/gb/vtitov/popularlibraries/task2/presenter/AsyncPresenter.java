package ru.gb.vtitov.popularlibraries.task2.presenter;

import ru.gb.vtitov.popularlibraries.task2.model.AsyncModel;

public class AsyncPresenter implements AsyncPresenterInterface{

	private AsyncModel model = new AsyncModel();

	/* Implementation */
	@Override
	public void onTapButton() {
		if(model.isRunning()) {
			model.setRunning(false);
		} else {
			model.setRunning(true);
			model.beginTask();
		}
	}
}
