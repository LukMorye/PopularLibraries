package ru.gb.vtitov.popularlibraries.di;

import androidx.appcompat.app.AppCompatActivity;
import ru.gb.vtitov.popularlibraries.R;

import android.os.Bundle;

public class DiActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_di);
		setDI();
	}

	private void setDI() {
		Green green = new Green();
		new Red(green);
		new White(green);
	}
}
