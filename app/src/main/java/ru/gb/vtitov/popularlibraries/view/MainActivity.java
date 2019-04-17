package ru.gb.vtitov.popularlibraries.view;

import ru.gb.vtitov.popularlibraries.presenter.Presenter;
import ru.gb.vtitov.popularlibraries.R;
import ru.gb.vtitov.popularlibraries.presenter.ViewInterface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

public class MainActivity extends MvpAppCompatActivity implements ViewInterface {

	/* UI Elements */
	private TextView textView;
	private EditText editText;
	/* Presenter */
	@InjectPresenter
	Presenter presenter;

	@ProvidePresenter
	Presenter providePresenter() { return new Presenter(); }


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
