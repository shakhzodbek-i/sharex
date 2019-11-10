package com.king.corp.sharex.di.component;

import com.king.corp.sharex.di.PerActivity;
import com.king.corp.sharex.di.module.ActivityModule;
import com.king.corp.sharex.iu.auth.AuthActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(AuthActivity activity);

}
