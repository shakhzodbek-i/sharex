package com.king.corp.sharex.dagger;


import com.king.corp.sharex.ShareXApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        BuildersModule.class
})
public interface AppComponent {

    void inject(ShareXApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(ShareXApp application);

        AppComponent build();

    }
}
