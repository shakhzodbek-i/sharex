package com.king.corp.sharex.di.module;

import android.app.Application;
import android.content.Context;

import com.king.corp.sharex.di.ApplicationContext;
import com.king.corp.sharex.di.DatabaseInfo;
import com.king.corp.sharex.di.PreferenceInfo;
import com.king.corp.sharex.utils.AppConstants;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }
}
