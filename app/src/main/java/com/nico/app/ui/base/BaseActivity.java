package com.nico.app.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import butterknife.ButterKnife;
import nico.library.utils.LogHelper;

/**
 * Created by 就这样子 on 2016/4/18.
 */
public abstract class BaseActivity extends Activity {

    private final String TAG = getClass().getSimpleName();


    /**
     * 简单d生命周期
     * onCreate
     * onStart
     * onResume
     * onReStart
     * onPause
     * onStop
     * onDestory
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogHelper.trace(TAG+"now is onCreate");
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        LogHelper.trace(TAG+"now is onStart");
        super.onStart();
    }


    @Override
    protected void onResume() {
        LogHelper.trace(TAG+"now is onCreate");
        super.onResume();
    }

    @Override
    protected void onPause() {
        LogHelper.trace(TAG+"now is onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        LogHelper.trace(TAG+"now is onRestart");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        LogHelper.trace(TAG+"now is onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        LogHelper.trace(TAG+"now is onDestroy");
        super.onDestroy();
    }
}
