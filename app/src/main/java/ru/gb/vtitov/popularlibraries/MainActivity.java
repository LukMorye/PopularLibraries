package ru.gb.vtitov.popularlibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ViewInterface {

	/* UI Elements */
	private TextView textView;
	private EditText editText;
	/* Presenter */
	private final Presenter presenter = new Presenter(this);


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUIElements();
	}

	private void initUIElements() {
		editText = findViewById(R.id.edit_text);
		Button button = findViewById(R.id.connect_button);
		textView = findViewById(R.id.text_view);
		button.setOnClickListener(view ->
						presenter.onNewText(
										editText.getText().toString())
		);
	}

	@Override
	public void setNewText(String text) {
		textView.setText(text);
	}

	@Override
	public void clearInputField() {
		editText.setText(null);
	}
}
