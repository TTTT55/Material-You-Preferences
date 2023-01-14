package io.github.tstewart.materialpreferencesfragment.sample;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

import io.github.tstewart.materialpreferencesfragment.MaterialPreferencesFragment;
import io.github.tstewart.materialpreferencesfragment.R;

public class MainPreferenceFragment extends MaterialPreferencesFragment {
    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.main_preferences, rootKey);

        PreferenceScreen preferenceScreen = getPreferenceScreen();
        Preference versionPreference = findPreference("version_key");

        if(versionPreference != null) {
            versionPreference.setSummary(getCurrentVersion());
        }
    }

    private String getCurrentVersion() {
        Context context = getContext();
        if (context != null) {
            try {
                PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                return pInfo.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        /* If version could not be received from PackageInfo, return default value */
        return "Unknown";
    }
}
