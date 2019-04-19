package ru.gb.vtitov.popularlibraries.task2.view;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;
import ru.gb.vtitov.popularlibraries.task2.presenter.AsyncPresenter;

import android.os.Bundle;
import android.widget.Button;

public class AsyncActivity extends AppCompatActivity {

	private AsyncPresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_async);
		setupDI();
		initUIElement();
	}

	private void setupDI() {
		presenter = new AsyncPresenter();
	}

	private void initUIElement() {
		Button button = findViewById(R.id.button);
		button.setOnClickListener(view -> presenter.onTapButton());
	}
}
