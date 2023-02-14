package com.github.tstewart.materialpreferencesfragment.preferences;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.PreferenceViewHolder;
import androidx.preference.SwitchPreference;

import com.github.tstewart.materialpreferencesfragment.R;

public class MaterialSwitchPreference extends SwitchPreference {

    TextView mTitleTextView;
    TextView mSummaryTextView;

    public MaterialSwitchPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutResource(R.layout.material_preference_switch);
    }

    public MaterialSwitchPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override
    public void onBindViewHolder(@NonNull PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);

        mTitleTextView = (TextView) holder.itemView.findViewById(android.R.id.title);
        mSummaryTextView = (TextView) holder.itemView.findViewById(android.R.id.summary);

        if(mSummaryTextView != null) {

            if(mSummaryTextView.getText() == null || mSummaryTextView.getText().toString().isEmpty()) {
                mTitleTextView.setLayoutParams(new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
            }

            mSummaryTextView.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(charSequence != null && !charSequence.toString().isEmpty()) {
                        mTitleTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.WRAP_CONTENT));
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }
    }
}
