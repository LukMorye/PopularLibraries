package ru.gb.vtitov.popularlibraries;

interface PresenterInterface {

	void onNewText(String text);
}

interface ViewInterface {
	void setNewText(String text);
	void clearInputField();
}

public class Presenter implements PresenterInterface {

	private final ViewInterface view;
	private final Model model = new Model();

	Presenter(ViewInterface view) {
		this.view = view;
		model.setText("");
	}

	@Override
	public void onNewText(String text) {
		String newText = model.getText() + text;
		view.setNewText(newText);
		model.setText(newText);
		view.clearInputField();

	}
}
