package com.example.zhuazhua1_0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;

public class GuideLayout extends LinearLayout {

	public GuideLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.guide, this);
		Button guideimage=(Button)findViewById(R.id.guide_image);
		Button guidevideo=(Button)findViewById(R.id.guide_video);
		Button guidefriend=(Button)findViewById(R.id.guide_friend);
		Button guidelocal=(Button)findViewById(R.id.guide_local);
		// TODO Auto-generated constructor stub
		guideimage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_LAUNCHER);
                ((Activity)getContext()).startActivity(intent);
			}
		});
		guidevideo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent("com.example.zhuazhua1_0.Video");
                ((Activity)getContext()).startActivity(intent);
			}
		});
		guidefriend.setOnClickListener(new OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				Intent intent=new Intent("com.example.zhuazhua1_0.Friend");
                ((Activity)getContext()).startActivity(intent);
 			}
 		});
		guidelocal.setOnClickListener(new OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				Intent intent=new Intent("com.example.zhuazhua1_0.Local");
                ((Activity)getContext()).startActivity(intent);
 			}
 		});
	}

}
