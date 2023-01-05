package io.github.tstewart.materialpreferencesfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.color.DynamicColors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DynamicColors.applyToActivitiesIfAvailable(getApplication());
    }
}