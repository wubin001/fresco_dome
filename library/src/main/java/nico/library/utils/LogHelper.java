package nico.library.utils;

import android.util.Log;

/**
 * Created by 就这样子 on 2016/4/18.
 */
public final class LogHelper {

    public static final boolean mIsDebugMode = true;//日志打印控制器，发布的时候记得关闭
    private static final String TAG = LogHelper.class.getSimpleName();
    private static final String CLASS_METHOE_LINE_FORMAT = "%s.%s()_%s";

    public static void trace(String str){
        if(mIsDebugMode){

            StackTraceElement traceElement = Thread.currentThread().getStackTrace()[3];
            String className = traceElement.getClassName();
            className = className.substring(className.lastIndexOf(".")+1);
            String logText = String.format(CLASS_METHOE_LINE_FORMAT,
                    className,
                    traceElement.getMethodName(),
                    String.valueOf(traceElement.getLineNumber()));
            Log.e(TAG,logText+"--->"+str);
        }
    }

    public static void printStackTrace(Throwable throwable){

        if(mIsDebugMode){
            Log.i(TAG,"",throwable);
        }
    }

}
