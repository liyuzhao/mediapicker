package com.easemob.mediapicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dmcbig.mediapicker.PickerActivity;
import com.dmcbig.mediapicker.PickerConfig;

public class MainActivity extends AppCompatActivity {

	protected static final int REQUEST_CODE_CAMERA = 2;
	protected static final int REQUEST_CODE_LOCAL = 3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onSelectPic(View view) {
		Intent intent = new Intent(this, PickerActivity.class);
		intent.putExtra(PickerConfig.SELECT_MODE, PickerConfig.PICKER_IMAGE_VIDEO);
		long maxSize = 10485760L;
		intent.putExtra(PickerConfig.MAX_SELECT_SIZE,maxSize); //default 10MB (Optional)
		intent.putExtra(PickerConfig.MAX_SELECT_COUNT,9);  //default 40 (Optional)
		intent.putExtra(PickerConfig.SHOW_FULL_SIZE, true);
//        intent.putExtra(PickerConfig.DEFAULT_SELECTED_LIST,defaultSelect); //(Optional)默认选中的照片
		startActivityForResult(intent, REQUEST_CODE_LOCAL);
	}
}
