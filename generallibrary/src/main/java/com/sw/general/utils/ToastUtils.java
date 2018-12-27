package com.sw.general.utils;


import android.content.Context;
import android.widget.Toast;

/**
 * Toast工具类
 */
public class ToastUtils {

    private static ToastUtils mToastUtils;
    private Toast mToast;

    private ToastUtils(Context context) {
        mToast = Toast.makeText(context, null, Toast.LENGTH_SHORT);
    }

    public static ToastUtils getInstance(Context context) {
        if (mToastUtils == null) {
            synchronized (ToastUtils.class) {
                if (mToastUtils == null) {
                    mToastUtils = new ToastUtils(context);
                }
            }
        }
        return mToastUtils;
    }

    /**
     * 显示Toast
     *
     * @param msg
     */
    public void showToast(String msg) {
        mToast.setText(msg);
        mToast.show();
    }
}
