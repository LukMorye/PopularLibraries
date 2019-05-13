package ru.gb.vtitov.popularlibraries.task1.view;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;
import ru.gb.vtitov.popularlibraries.task1.presenter.GsonPresenter;
import ru.gb.vtitov.popularlibraries.task1.presenter.GsonViewInterface;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class GsonActivity extends AppCompatActivity implements GsonViewInterface {

	private GsonPresenter presenter;
	private final String TAG = "GsonActivity";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gson);
		setupDI();
	}

	private void setupDI() {
		presenter = new GsonPresenter(this);
		presenter.didStart();
	}

	@Override
	public void initViewElements() {
		findViewById(R.id.gson_button).setOnClickListener(view -> presenter.didTapButotn());
	}

	@Override
	public void printDoomsDay(String timeOfYear, String year) {
		Log.d(TAG, "Doomsday coming soon. In " + timeOfYear + " of the year: " + 	year);
	}
}
