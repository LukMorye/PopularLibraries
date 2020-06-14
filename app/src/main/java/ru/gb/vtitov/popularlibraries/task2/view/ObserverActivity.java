package ru.gb.vtitov.popularlibraries.task2.view;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;
import ru.gb.vtitov.popularlibraries.task2.presenter.AsyncPresenter;
import ru.gb.vtitov.popularlibraries.task2.presenter.ObserverPresenter;

import android.os.Bundle;
import android.widget.Button;

public class ObserverActivity extends AppCompatActivity {

	private ObserverPresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_observer);
		setupDI();
		initUIElement();
	}

	private void setupDI() {
		presenter = new ObserverPresenter();
	}

	private void initUIElement() {
		findViewById(R.id.subscribe).setOnClickListener(view -> presenter.onTapSubscribe());
		findViewById(R.id.unsubscribe).setOnClickListener(view -> presenter.onTapUnsubscribe());
		findViewById(R.id.spam).setOnClickListener(view -> presenter.onTapSpam());
	}
}
