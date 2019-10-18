package com.king.corp.sharex.dagger;

import android.content.Context;

import com.king.corp.sharex.ShareXApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    @Singleton
    Context provideContext(ShareXApp app){
        return app.getApplicationContext();
    }
}
