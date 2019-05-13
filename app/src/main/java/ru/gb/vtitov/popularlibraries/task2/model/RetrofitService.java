package ru.gb.vtitov.popularlibraries.task2.model;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitService {

	@GET("users/{name}")
	Observable<Friend> findAFriend(@Path("name") String user);
}
