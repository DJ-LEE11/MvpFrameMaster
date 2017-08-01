package com.example.libutil;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
/**
 * @author 李栋杰
 * @time 2017/8/1  23:56
 * @desc 数据缓存
 */
public class SharedFileUtils {
    public static final String FILE_NAME = "pk_file";
    private SharedPreferences sp;

    public SharedFileUtils(Context context) {
        sp = context.getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
    }

    public void putString(String key, String value) {
        if (key == null || key.equals(""))
            throw new IllegalArgumentException(
                    "Key can't be null or empty string");
        Editor editor = sp.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String getString(String key) {
        if (key == null || key.equals(""))
            throw new IllegalArgumentException(
                    "Key can't be null or empty string");
        return sp.getString(key, "");
    }

    public int getInt(String key) {
        return sp.getInt(key, 0);
    }

    public void putInt(String key, int value) {
        Editor e = sp.edit();
        e.putInt(key, value);
        e.commit();
    }

    public void putBoolean(String key, boolean value) {
        if (key == null || key.equals(""))
            throw new IllegalArgumentException(
                    "Key can't be null or empty string");
        Editor editor = sp.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public void remove(String key) {
        if (key == null || key.equals(""))
            throw new IllegalArgumentException(
                    "Key can't be null or empty string");
        Editor editor = sp.edit();
        editor.remove(key);
        editor.commit();
    }

    public boolean getBoolean(String key) {
        return sp.getBoolean(key, false);
    }

    public boolean isContainsKey(String key) {
        return sp.contains(key);
    }

    public long getLong(String key) {
        return sp.getLong(key, 0);
    }

    public void putLong(String key, long value) {
        Editor editor = sp.edit();
        editor.putLong(key, value);
        editor.commit();
    }
}
