package ru.gb.vtitov.popularlibraries.task1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Doomsday {
	@Expose
	@SerializedName("time_of_year")
	public String timeOfYear;
	@Expose
	@SerializedName("year")
	public int year;
}
