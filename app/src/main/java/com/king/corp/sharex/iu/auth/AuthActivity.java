package com.king.corp.sharex.iu.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.king.corp.sharex.R;
import com.king.corp.sharex.core.BaseActivity;

public class AuthActivity extends BaseActivity {

    public static Intent getStartIntent(Context context) {
        return new Intent(context, AuthActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_auth);
    }
}
