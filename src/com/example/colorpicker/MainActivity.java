package com.example.colorpicker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity{

	private Button startButton_1;
	private Button startButton_2;
	private ColorPicker colorPicker_1;
	private ColorPicker colorPicker_2;
	private int color_1 = Color.rgb(55, 128, 128);
	private int color_2 = Color.MAGENTA;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		startButton_1 = (Button) findViewById(R.id.startColorPicker_1);
		startButton_1.setBackgroundColor(color_1);
		colorPicker_1 = new ColorPicker(this, color_1);
		startButton_1.setOnClickListener(new OnStartButton(colorPicker_1
				.getDialog()));
		
		startButton_2 = (Button) findViewById(R.id.startColorPicker_2);
		startButton_2.setBackgroundColor(color_2);
		colorPicker_2 = new ColorPicker(this, color_2);
		startButton_2.setOnClickListener(new OnStartButton(colorPicker_2
				.getDialog()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
