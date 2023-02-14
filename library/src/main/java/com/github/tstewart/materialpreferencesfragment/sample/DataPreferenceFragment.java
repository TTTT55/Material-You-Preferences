package com.github.tstewart.materialpreferencesfragment.sample;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.github.tstewart.materialpreferencesfragment.MaterialPreferencesFragment;

import com.github.tstewart.materialpreferencesfragment.R;

public class DataPreferenceFragment extends MaterialPreferencesFragment {
    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.data_preferences, rootKey);
    }
}
