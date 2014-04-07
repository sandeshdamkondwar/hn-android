package com.manuelmaly.hn.util;

import android.content.Context;
import android.graphics.Typeface;

public class FontHelper {

    private static Typeface mComfortaaRegular;
    private static Typeface mComfortaaBold;
    private static final Object lock = new Object();

    public static Typeface getComfortaa(Context context, boolean bold) {
        synchronized (lock) {
            if (!bold && mComfortaaRegular == null)
                mComfortaaRegular = Typeface.createFromAsset(context.getAssets(), "OpenSans-Regular.ttf");
            else if (bold && mComfortaaBold == null)
                mComfortaaBold = Typeface.createFromAsset(context.getAssets(), "OpenSans-Semibold.ttf");
        }
        return bold ? mComfortaaBold : mComfortaaRegular;
    }
}
