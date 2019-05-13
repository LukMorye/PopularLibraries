package ru.gb.vtitov.popularlibraries.task2.presenter;

import android.graphics.Bitmap;

public interface RetrofitViewInterface {

	void initViewElements();
	void showFriendLayout();
	void gotFriendName(String name);
	void loadPhotoBy(String url);
}
