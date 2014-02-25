package org.concordacademy.hangman;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageSwitcher;

public class GallowsActivity extends Activity{

	private ImageSwitcher imageSwitcher;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gallows);

	}
}