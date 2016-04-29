package com.nico.app.ui.activity.basicimage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.facebook.common.logging.FLog;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestLoggingListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.nico.app.R;
import com.nico.app.ui.base.BaseActivity;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by 就这样子 on 2016/4/25.
 */
public class Basicone extends BaseActivity {

    @InjectView(R.id.simple_drawee_view1)
    SimpleDraweeView mSimpleDraweeView1;
    @InjectView(R.id.simple_drawee_view2)
    SimpleDraweeView mSimpleDraweeView2;
    @InjectView(R.id.simple_drawee_view3)
    SimpleDraweeView mSimpleDraweeView3;

    private Animatable animatableGif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.item_baseone);
        ButterKnife.inject(this);



        Uri uri = Uri.parse("http://apod.nasa.gov/apod/image/1410/20141008tleBaldridge001h990.jpg");
        GenericDraweeHierarchyBuilder builder =
                new GenericDraweeHierarchyBuilder(getResources());
        GenericDraweeHierarchy hierarchy = builder
                .setFadeDuration(3000)
                .setProgressBarImage(new ProgressBarDrawable())
                .build();
        mSimpleDraweeView2.setHierarchy(hierarchy);
        mSimpleDraweeView1.setImageURI(uri);
        mSimpleDraweeView2.setImageURI(uri);

        Uri i = Uri.parse("http://s3.amazonaws.com/giphygifs/media/4aBQ9oNjgEQ2k/giphy.gif");
        DraweeController gifController = Fresco.newDraweeControllerBuilder()
                .setUri(i)
                .setControllerListener(new BaseControllerListener<ImageInfo>() {
                    @Override
                    public void onFinalImageSet(
                            String id,
                            ImageInfo imageInfo,
                            Animatable anim) {
                        if (anim != null) {
                            animatableGif = anim;
                            animatableGif.start();
                        }
                    }
                })
                .build();
        mSimpleDraweeView3.setController(gifController);

    }
}
