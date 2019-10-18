package com.king.corp.sharex.dagger.sign_in;

import com.google.firebase.auth.FirebaseAuth;

import dagger.Module;
import dagger.Provides;

@Module
public class SignInActivityModule {

    @Provides
    @SignInActivityScope
    FirebaseAuth provideFirebaseAuth() {
        return FirebaseAuth.getInstance();
    }


}
