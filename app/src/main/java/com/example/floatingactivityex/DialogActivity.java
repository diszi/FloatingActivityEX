package com.example.floatingactivityex;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.Window;

/**
 * Created by szidonia.laszlo on 2018. 02. 22..
 */

public class DialogActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.floating_activity_layout);
    }
}
