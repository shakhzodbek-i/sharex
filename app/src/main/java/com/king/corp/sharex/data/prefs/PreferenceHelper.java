package com.king.corp.sharex.data.prefs;

public interface PreferenceHelper {

    void saveInt(int value, String key);

    void saveString(String value, String key);

    void saveFloat(float value, String key);

    void saveLong(long value, String key);

    int getInt(String key);

    String getString(String key);

    float getFloat(String key);

    long getLong(String key);
}
