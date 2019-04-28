package ru.gb.vtitov.popularlibraries.task2.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {

	public Observable<Friend> findAFriendBy(String name) {

		Gson gson = new GsonBuilder()
						.excludeFieldsWithoutExposeAnnotation()
						.create();
		GsonConverterFactory factory = GsonConverterFactory.create(gson);

		RetrofitService api = new Retrofit.Builder()
						.baseUrl("https://api.github.com")
						.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
						.addConverterFactory(factory)
						.build()
						.create(RetrofitService.class);
		return api.findAFriend(name).subscribeOn(Schedulers.io());
	}
}
