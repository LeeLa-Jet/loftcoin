package com.loftschool.android.loftcoin;

import android.app.Application;
import android.os.StrictMode;

import com.loftschool.android.loftcoin.util.DebugTree;

import timber.log.Timber;

public class LoftApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            StrictMode.enableDefaults();
            Timber.plant(new DebugTree());
        }
    }

}
