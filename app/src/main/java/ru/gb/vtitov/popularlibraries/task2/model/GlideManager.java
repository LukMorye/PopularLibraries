package ru.gb.vtitov.popularlibraries.task2.model;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideManager {

	private  final Context context;

	public GlideManager(Context context) {
		this.context = context;
	}

	public void loadImageBy(String url,
									 ImageView imageView) {
		Glide.with(context)
						.load(url)
						.into(imageView);
	}
}
