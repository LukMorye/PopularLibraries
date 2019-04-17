package ru.gb.vtitov.popularlibraries.presenter;

import com.arellomobile.mvp.MvpView;

public interface ViewInterface extends MvpView {
	void setNewText(String text);
	void clearInputField();
}
