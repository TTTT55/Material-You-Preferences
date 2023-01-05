package io.github.tstewart.materialpreferencesfragment.preferences;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.EditTextPreference;

import io.github.tstewart.materialpreferencesfragment.R;

public class MaterialEditTextPreference extends EditTextPreference {

    public MaterialEditTextPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutResource(R.layout.material_preference_edittext);
    }

    public MaterialEditTextPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
}
