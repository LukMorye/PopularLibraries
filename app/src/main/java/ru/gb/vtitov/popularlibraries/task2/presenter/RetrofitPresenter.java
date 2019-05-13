package ru.gb.vtitov.popularlibraries.task2.presenter;

import android.util.Log;

import com.bumptech.glide.Glide;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import ru.gb.vtitov.popularlibraries.task2.model.Friend;
import ru.gb.vtitov.popularlibraries.task2.model.GlideManager;
import ru.gb.vtitov.popularlibraries.task2.model.RetrofitApi;

public class RetrofitPresenter implements RetrofitPresenterInterface {

	private static String TAG = "RetrofitPresenter";

	private final static String FRIEND_NAME = "JakeWharton";

	private final RetrofitViewInterface view;
	private final RetrofitApi api = new RetrofitApi();

	public RetrofitPresenter(RetrofitViewInterface view) {
		this.view = view;
	}

	@Override
	public void didStart() {
		view.initViewElements();
	}

	@Override
	public void didTapButotn() {
		Observable<Friend> observable = api.findAFriendBy(FRIEND_NAME);
		Disposable disposable = observable.observeOn(AndroidSchedulers.mainThread())
						.subscribe(friend -> {
			view.showFriendLayout();
			view.gotFriendName(friend.name);
			view.loadPhotoBy(friend.avatarUrl);
		}, throwable -> Log.e(TAG, "We couldn't find your friend. My apologize..."));

	}
}
