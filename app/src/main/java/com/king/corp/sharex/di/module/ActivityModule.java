package com.king.corp.sharex.di.module;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.king.corp.sharex.di.ActivityContext;
import com.king.corp.sharex.di.PerActivity;
import com.king.corp.sharex.utils.rx.AppSchedulerProvider;
import com.king.corp.sharex.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }
}
