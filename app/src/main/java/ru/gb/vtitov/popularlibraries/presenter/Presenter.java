package ru.gb.vtitov.popularlibraries.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import ru.gb.vtitov.popularlibraries.model.Model;


@InjectViewState
public class Presenter extends MvpPresenter<ViewInterface> implements PresenterInterface {

	private final Model model;

	public Presenter() {
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
