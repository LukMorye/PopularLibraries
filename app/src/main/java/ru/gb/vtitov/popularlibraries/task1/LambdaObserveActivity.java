package ru.gb.vtitov.popularlibraries.task1;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;

import android.os.Bundle;
import android.util.Log;

public class LambdaObserveActivity extends AppCompatActivity implements LambdaObserveViewInterface {

	private static final String TAG = "LambdaObserveActivity";
	LambdaObservePresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lambda_observe);
		setupDI();
	}

	private void setupDI() {
		presenter = new LambdaObservePresenter(this);
		presenter.onStart();

	}

	@Override
	public void initViewElements() {
		findViewById(R.id.subscribe).setOnClickListener(view -> presenter.onTapSubscribe());
		findViewById(R.id.unsubscribe).setOnClickListener(view -> presenter.onTapUnsubscribe());
		findViewById(R.id.one_god_service).setOnClickListener(view -> presenter.onTapServiceFromGod());
	}

	@Override
	public void printMessage(String message) {
		Log.d(TAG,message);
	}

	@Override
	public void printErrorMessage(String message) {
		Log.e(TAG,message);
	}
}
