package com.example.tlqkf.ssproject;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/**
 * Created by tlqkf on 2016-08-04.
 */
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Handler ccuing = new Handler() {
            public void handleMessage(Message msg) {
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
            }
            };
        ccuing.sendEmptyMessageDelayed(0, 1800);

    }
    }
