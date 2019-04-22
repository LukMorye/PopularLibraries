package ru.gb.vtitov.popularlibraries.task2.view;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;
import ru.gb.vtitov.popularlibraries.task2.presenter.RxPresenter;
import ru.gb.vtitov.popularlibraries.task2.presenter.RxViewInterface;

import android.os.Bundle;
import android.view.View;

public class RxActivity extends AppCompatActivity implements RxViewInterface {

	private RxPresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rx);
		setupDI();
	}

	private void setupDI() {
		presenter = new RxPresenter(this);
		presenter.onStart();
	}

	@Override
	public void initUIElements() {
		findViewById(R.id.subscribe).setOnClickListener(view -> presenter.onTapSubscribe());
		findViewById(R.id.unsubscribe).setOnClickListener(view -> presenter.onTapUnsibscribe());
	}
}
