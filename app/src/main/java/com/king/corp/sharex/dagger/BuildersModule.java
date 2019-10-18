package com.king.corp.sharex.dagger;

import com.king.corp.sharex.dagger.sign_in.SignInActivityModule;
import com.king.corp.sharex.dagger.sign_in.SignInActivityScope;
import com.king.corp.sharex.iu.sign_in.SignInActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {

    @SignInActivityScope
    @ContributesAndroidInjector(modules = SignInActivityModule.class)
    abstract SignInActivity bindSignInActivity();

    /*@Scope
    @ContributesAndroidInjector(modules = Module.class)
    abstract Activity bindActivity();*/
}
