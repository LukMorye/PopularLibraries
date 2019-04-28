package ru.gb.vtitov.popularlibraries.task2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Friend {

	@Expose
	@SerializedName("name")
	public String name;
	@Expose
	@SerializedName("avatar_url")
	public String avatarUrl;

}
