package com.nico.app.ui.activity;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.nico.app.R;
import com.nico.app.ui.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends BaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.basic_fresco ,R.id.round_fresco,R.id.rotate_fresco,R.id.load_fresco})
    public void button_onclick(View view){
        Intent intent = new Intent(this,BasicImageActivity.class);
        switch (view.getId()){
            case R.id.basic_fresco:
                intent.putExtra("type_fresco","basic_fresco");
                break;
            case R.id.round_fresco:
                intent.putExtra("type_fresco","round_fresco");
                break;
            case R.id.rotate_fresco:
                intent.putExtra("type_fresco","rotate_fresco");
                break;
            case R.id.load_fresco:
                intent.putExtra("type_fresco","load_fresco");
                break;
        }
        startActivity(intent);
    }



  }
