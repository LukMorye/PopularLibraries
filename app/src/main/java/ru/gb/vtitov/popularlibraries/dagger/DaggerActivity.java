package ru.gb.vtitov.popularlibraries.dagger;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;

import android.os.Bundle;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

	private static final String TAG = "DaggerActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dagger);
		new Red().show();
		new White().show();

	}
}
