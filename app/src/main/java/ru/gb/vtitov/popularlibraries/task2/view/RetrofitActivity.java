package ru.gb.vtitov.popularlibraries.task2.view;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;
import ru.gb.vtitov.popularlibraries.task2.model.GlideManager;
import ru.gb.vtitov.popularlibraries.task2.presenter.RetrofitPresenter;
import ru.gb.vtitov.popularlibraries.task2.presenter.RetrofitViewInterface;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RetrofitActivity extends AppCompatActivity implements RetrofitViewInterface {
	/* UI Elements */
	private LinearLayout friendLayout;
	private TextView greetingView;
	private ImageView friendPhotoView;
	/* Presenter */
	private RetrofitPresenter presenter;
	private GlideManager glideManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_retrofit);
		setupDI();
	}

	private void setupDI() {
		presenter = new RetrofitPresenter(this);
		presenter.didStart();
		glideManager = new GlideManager(this);
	}

	@Override
	public void initViewElements() {
		findViewById(R.id.retrofit_button).setOnClickListener(view -> presenter.didTapButotn());
		friendLayout = findViewById(R.id.friend_layout);
		greetingView = findViewById(R.id.greeating_text_view);
		friendPhotoView = findViewById(R.id.friend_photo);
	}

	@Override
	public void showFriendLayout() {
		friendLayout.setVisibility(View.VISIBLE);
	}

	@Override
	public void gotFriendName(String name) {
		greetingView.setText("Hi "+ name + "!\nNice to meet you!");
	}

	@Override
	public void loadPhotoBy(String url) {
		glideManager.loadImageBy(url,
						friendPhotoView);
	}


}
