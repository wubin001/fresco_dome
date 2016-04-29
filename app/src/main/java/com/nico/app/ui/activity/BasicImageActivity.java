package com.nico.app.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.facebook.drawee.drawable.ScalingUtils;
import com.nico.app.R;
import com.nico.app.ui.activity.basicimage.Basicone;
import com.nico.app.ui.activity.basicimage.CenterImageActivity;
import com.nico.app.ui.activity.basicimage.RoundImageActivity;
import com.nico.app.ui.base.BaseActivity;
import com.nico.app.utils.Contents;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemClick;

/**
 * Created by 就这样子 on 2016/4/22.
 *
 * 基础效果展示
 */
public class BasicImageActivity extends BaseActivity{

    @InjectView(R.id.basic_image_list)
    public ListView basic_image_list;
    private List<String> data_list;
    private String type_fresco ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_basicfresco);
        ButterKnife.inject(this);
        initData();
        basic_image_list.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data_list));
    }

    private void initData(){
        String str = getIntent().getStringExtra("type_fresco");
        if(str !=null && str.length()>0){
            type_fresco = str;
        }

        data_list = new ArrayList<String>();
        data_list.add("center");
        data_list.add("centerCrop");
        data_list.add("focusCrop");
        data_list.add("centerInside");
        data_list.add("fitCenter");
        data_list.add("fitStart");
        data_list.add("fitEnd");
        data_list.add("fitXY");
        data_list.add("none");
    }

    @OnItemClick(R.id.basic_image_list)
    public void OnItemClick(int position){

        switch (position){
            case 0:
                Contents.scaleType = ScalingUtils.ScaleType.CENTER;
                break;
            case 1:
                Contents.scaleType = ScalingUtils.ScaleType.CENTER_CROP;
                break;
            case 2:
                Contents.scaleType = ScalingUtils.ScaleType.FOCUS_CROP;
                break;
            case 3:
                Contents.scaleType = ScalingUtils.ScaleType.FIT_CENTER;
                break;
            case 4:
                Contents.scaleType = ScalingUtils.ScaleType.FIT_START;
                break;
            case 5:
                Contents.scaleType = ScalingUtils.ScaleType.FIT_END;
                break;
            case 6:
                Contents.scaleType = ScalingUtils.ScaleType.FIT_XY;
                break;

        }
        Intent intent;
        if(type_fresco.equals("basic_fresco") ){
            intent  = new Intent(this,CenterImageActivity.class);
        }else if(type_fresco.equals("round_fresco")){
             intent = new Intent(this,RoundImageActivity.class);
        }else if(type_fresco.equals("rotate_fresco")){
             intent = new Intent(this,CenterImageActivity.class);
        }else if(type_fresco.equals("load_fresco")){
             intent = new Intent(this,CenterImageActivity.class);
        }else{
             intent = new Intent(this,CenterImageActivity.class);
        }

        startActivity(intent);
    }
}
