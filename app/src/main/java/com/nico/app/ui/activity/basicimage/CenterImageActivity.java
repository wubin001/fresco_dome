package com.nico.app.ui.activity.basicimage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.facebook.drawee.drawable.RoundedBitmapDrawable;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.nico.app.R;
import com.nico.app.ui.base.BaseActivity;
import com.nico.app.utils.Contents;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by 就这样子 on 2016/4/26.
 */
public class CenterImageActivity extends BaseActivity {

    @InjectView(R.id.imageshow)
    SimpleDraweeView simpleDraweeView;

    private ScalingUtils.ScaleType scaleType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.aty_imageshow);
        ButterKnife.inject(this);
//        GenericDraweeHierarchyBuilder builder =
//                new GenericDraweeHierarchyBuilder(getResources());
//        GenericDraweeHierarchy hierarchy = builder
//                .setFadeDuration(300)
//                .setActualImageScaleType(ScalingUtils.ScaleType.FOCUS_CROP)
//                .setPlaceholderImage(getResources().getDrawable(R.color.wait_color))
//                .setActualImageScaleType(Contents.scaleType)
//                .build();
//
//
//
//        simpleDraweeView.setHierarchy(hierarchy);

        simpleDraweeView.setImageURI(Contents.URI);
    }
}

/**

 fresco:placeholderImageScaleType="fitCenter"
 fresco:failureImage="@mipmap/ic_launcher"
 fresco:failureImageScaleType="centerInside"
 fresco:retryImage="@mipmap/axc_icon"
 fresco:retryImageScaleType="centerCrop"
 fresco:progressBarImage="@mipmap/loading_logo"
 fresco:progressBarImageScaleType="centerInside"
 fresco:progressBarAutoRotateInterval="1000"
 fresco:backgroundImage="@color/blue"
 fresco:overlayImage="@color/v1_style_yellow"
 fresco:pressedStateOverlayImage="@color/red"
 fresco:roundAsCircle="false"
 fresco:roundedCornerRadius="1dp"
 fresco:roundTopLeft="true"
 fresco:roundTopRight="false"
 fresco:roundBottomLeft="false"
 fresco:roundBottomRight="true"
 fresco:roundWithOverlayColor="@color/corner_color"
 fresco:roundingBorderWidth="2dp"
 fresco:roundingBorderColor="@color/border_color"
 */
