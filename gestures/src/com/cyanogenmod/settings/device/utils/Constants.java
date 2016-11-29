/*
 * Copyright (C) 2015 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyanogenmod.settings.device.utils;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Constants {

    // Preference keys
    public static final String TOUCHSCREEN_S2W_RIGHT_GESTURE_KEY = "touchscreen_gesture_s2w_right";
    public static final String TOUCHSCREEN_S2W_LEFT_GESTURE_KEY = "touchscreen_gesture_s2w_left";
    public static final String TOUCHSCREEN_S2W_UP_GESTURE_KEY = "touchscreen_gesture_s2w_up";
    public static final String TOUCHSCREEN_S2W_DOWN_GESTURE_KEY = "touchscreen_gesture_s2w_down";
    public static final String TOUCHSCREEN_DT2W_GESTURE_KEY = "touchscreen_gesture_dt2w";

    // Proc nodes
    public static final String TOUCHSCREEN_S2W_RIGHT_NODE = "/sys/android_touch/sweep2wake_right";
    public static final String TOUCHSCREEN_S2W_LEFT_NODE = "/sys/android_touch/sweep2wake_left";
    public static final String TOUCHSCREEN_S2W_UP_NODE = "/sys/android_touch/sweep2wake_up";
    public static final String TOUCHSCREEN_S2W_DOWN_NODE = "/sys/android_touch/sweep2wake_down";
    public static final String TOUCHSCREEN_DT2W_NODE = "/sys/android_touch/doubletap2wake";

    // Proc nodes default values
    public static final boolean TOUCHSCREEN_S2W_RIGHT_DEFAULT = false;
    public static final boolean TOUCHSCREEN_S2W_LEFT_DEFAULT = false;
    public static final boolean TOUCHSCREEN_S2W_UP_DEFAULT = false;
    public static final boolean TOUCHSCREEN_S2W_DOWN_DEFAULT = false;
    public static final boolean TOUCHSCREEN_DT2W_DEFAULT = false;

    // Holds <preference_key> -> <proc_node> mapping
    public static final Map<String, String> sNodePreferenceMap = new HashMap<String, String>();

    // Holds <preference_key> -> <default_values> mapping
    public static final Map<String, Boolean> sNodeDefaultMap = new HashMap<String, Boolean>();

    static {
        sNodePreferenceMap.put(TOUCHSCREEN_S2W_RIGHT_GESTURE_KEY, TOUCHSCREEN_S2W_RIGHT_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_S2W_LEFT_GESTURE_KEY, TOUCHSCREEN_S2W_LEFT_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_S2W_UP_GESTURE_KEY, TOUCHSCREEN_S2W_UP_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_S2W_DOWN_GESTURE_KEY, TOUCHSCREEN_S2W_DOWN_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_DT2W_GESTURE_KEY, TOUCHSCREEN_DT2W_NODE);

        sNodeDefaultMap.put(TOUCHSCREEN_S2W_RIGHT_GESTURE_KEY, TOUCHSCREEN_S2W_RIGHT_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_S2W_LEFT_GESTURE_KEY, TOUCHSCREEN_S2W_LEFT_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_S2W_UP_GESTURE_KEY, TOUCHSCREEN_S2W_UP_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_S2W_DOWN_GESTURE_KEY, TOUCHSCREEN_S2W_DOWN_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_DT2W_GESTURE_KEY, TOUCHSCREEN_DT2W_DEFAULT);
    }

    public static boolean isPreferenceEnabled(Context context, String key, boolean defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean(key, defaultValue);
    }
}
