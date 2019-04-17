package ru.gb.vtitov.popularlibraries;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.MvpView;

interface PresenterInterface {

	void onNewText(String text);
}

interface ViewInterface extends MvpView {
	void setNewText(String text);
	void clearInputField();
}


@InjectViewState
public class Presenter extends MvpPresenter<ViewInterface> implements PresenterInterface {

	private final Model model;

	Presenter() {
		model = new Model();
		model.setText("");
	}

	@Override
	public void onNewText(String text) {
		String newText = model.getText() + text;
		getViewState().setNewText(newText);
		model.setText(newText);
		getViewState().clearInputField();

	}
}
