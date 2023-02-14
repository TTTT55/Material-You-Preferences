package com.github.tstewart.materialpreferencesfragment.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.SwitchPreference;

import com.github.tstewart.materialpreferencesfragment.R;

public class MaterialHeaderSwitchPreference extends SwitchPreference {

    public MaterialHeaderSwitchPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutResource(R.layout.material_preference_header_switch);
    }

    public MaterialHeaderSwitchPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
}