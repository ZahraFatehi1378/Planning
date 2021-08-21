package com.example.myapplication.storage.shared_prefrences;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;

import androidx.appcompat.app.ActionBar;

import com.example.myapplication.R;


public class Utils {
    public static String sTheme = "colored";

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, String theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    /**
     * Set the theme of the activity, according to the configuration.
     */
    public static void onActivityCreateSetTheme(Activity activity, ActionBar supportActionBar) {
        switch (sTheme) {
            case "dark": {
                activity.setTheme(R.style.AppThemeDark);
                supportActionBar.setBackgroundDrawable(new ColorDrawable(activity.getResources().getColor(R.color.colorPrimary2)));
                break;
            }
            case "bright": {
                activity.setTheme(R.style.AppThemeNoActionBArBright);
                supportActionBar.setBackgroundDrawable(new ColorDrawable(activity.getResources().getColor(R.color.colorPrimary)));
                break;
            }
        }
    }

    public static void onActivityCreateThemeForMainActivity(Activity activity) {
        switch (sTheme) {
            case "dark": {
                activity.setTheme(R.style.AppThemeDark);
                break;
            }
            case "bright": {
                activity.setTheme(R.style.AppThemeNoActionBArBright);
                break;
            }
        }
    }
}
