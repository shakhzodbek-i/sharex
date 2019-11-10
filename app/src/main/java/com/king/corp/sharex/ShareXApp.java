package com.king.corp.sharex;

import android.app.Activity;
import android.app.Application;

import com.facebook.appevents.AppEventsLogger;
import com.king.corp.sharex.di.component.ApplicationComponent;
import com.king.corp.sharex.di.component.DaggerApplicationComponent;
import com.king.corp.sharex.di.module.ApplicationModule;


public class ShareXApp extends Application {

    private ApplicationComponent mApplicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AppEventsLogger.activateApp(this);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }
}
