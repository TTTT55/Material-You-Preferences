package io.github.tstewart.materialpreferencesfragment;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.PreferenceFragmentCompat;

public abstract class MaterialPreferencesFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
