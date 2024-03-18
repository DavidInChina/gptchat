package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f27377Y;

    public k(GestureDetector gestureDetector) {
        this.f27377Y = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f27377Y.onTouchEvent(motionEvent);
        }
        return false;
    }
}
