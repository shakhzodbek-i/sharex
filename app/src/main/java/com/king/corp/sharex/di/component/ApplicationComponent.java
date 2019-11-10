package com.king.corp.sharex.di.component;

import android.app.Application;
import android.content.Context;

import com.king.corp.sharex.ShareXApp;
import com.king.corp.sharex.di.ApplicationContext;
import com.king.corp.sharex.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(ShareXApp app);

//    void inject(SyncService service);

    @ApplicationContext
    Context context();

    Application application();

}