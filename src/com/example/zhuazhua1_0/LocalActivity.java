package com.example.zhuazhua1_0;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class LocalActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_local);}
}
