package ru.gb.vtitov.popularlibraries.noDI;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;

import android.os.Bundle;

public class NoDiActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_no_di);
		new Red();
		new White();
	}
}
