package com.github.tstewart.materialpreferencesfragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;

import androidx.core.content.ContextCompat;

public class Util {

    private Util(){}

    public static int resolveColorAttr(Context context, int attr) {
        int color = 0;
        TypedArray attrArr = context.obtainStyledAttributes(new int[]{attr});
        color = attrArr.getColor(0, 0);
        attrArr.recycle();
        return color;
    }
}
