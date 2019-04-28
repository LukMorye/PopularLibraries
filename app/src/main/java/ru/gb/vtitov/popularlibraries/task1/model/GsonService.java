package ru.gb.vtitov.popularlibraries.task1.model;

import com.google.gson.Gson;

public class GsonService {



	public Doomsday getDoomsday() {

		return  new Gson()
						.newBuilder()
						.create()
						.fromJson(DummyData.dummyString,
											Doomsday.class);

	}
}
