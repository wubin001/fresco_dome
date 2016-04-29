package com.nico.app.ui.activity.basicimage;

import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;
import com.nico.app.R;
import com.nico.app.ui.base.BaseActivity;
import com.nico.app.utils.Contents;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by 就这样子 on 2016/4/29.
 */
public class RoundImageActivity extends BaseActivity {

    @InjectView(R.id.round_fresco_01)
    SimpleDraweeView simpleDraweeView_01;
    @InjectView(R.id.round_fresco_02)
    SimpleDraweeView simpleDraweeView_02;
    @InjectView(R.id.round_fresco_03)
    SimpleDraweeView simpleDraweeView_03;
    @InjectView(R.id.round_fresco_04)
    SimpleDraweeView simpleDraweeView_04;
    @InjectView(R.id.round_fresco_05)
    SimpleDraweeView simpleDraweeView_05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_roundimage);
        ButterKnife.inject(this);

        simpleDraweeView_01.setImageURI(Contents.URI);
        simpleDraweeView_02.setImageURI(Contents.URI);
        simpleDraweeView_03.setImageURI(Contents.URI);
        simpleDraweeView_04.setImageURI(Contents.URI);
        simpleDraweeView_05.setImageURI(Contents.URI);
    }
}
