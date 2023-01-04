package io.github.tstewart.materialpreferencesfragment;

import android.os.Bundle;

import androidx.annotation.Nullable;

public class SamplePreferencesFragment extends MaterialPreferencesFragment {
    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.sample_preferences, rootKey);
    }
}
