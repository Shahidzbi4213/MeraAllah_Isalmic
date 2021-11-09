package com.edu.pk.gulehri.meraallah.utils;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

public class Status {

    private final Activity activity;

    public Status(Activity activity) {
        this.activity = activity;
    }

    public void setWindowFlag(boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        } else {
            winParams.flags &= ~WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        }
        win.setAttributes(winParams);
    }

}
