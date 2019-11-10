package com.king.corp.sharex.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.king.corp.sharex.di.ApplicationContext;
import com.king.corp.sharex.di.PreferenceInfo;

import javax.inject.Inject;

public class PreferenceHelperImpl implements PreferenceHelper {

    private final SharedPreferences mPrefs;

    @Inject
    public PreferenceHelperImpl(@ApplicationContext Context context,
                                @PreferenceInfo String prefFileName) {
        this.mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public void saveInt(int value, String key) {
        mPrefs.edit()
                .putInt(key, value)
                .apply();
    }

    @Override
    public void saveString(String value, String key) {
        mPrefs.edit()
                .putString(key, value)
                .apply();
    }

    @Override
    public void saveFloat(float value, String key) {
        mPrefs.edit()
                .putFloat(key, value)
                .apply();
    }

    @Override
    public void saveLong(long value, String key) {
        mPrefs.edit()
                .putLong(key, value)
                .apply();
    }

    @Override
    public int getInt(String key) {
        return mPrefs.getInt(key, -1);
    }

    @Override
    public String getString(String key) {
        return mPrefs.getString(key, null);
    }

    @Override
    public float getFloat(String key) {
        return mPrefs.getFloat(key, -1.0f);
    }

    @Override
    public long getLong(String key) {
        return mPrefs.getLong(key, -1L);
    }
}
