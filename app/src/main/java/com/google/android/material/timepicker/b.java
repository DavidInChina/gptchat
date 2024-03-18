package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f27364Y;

    public b(ClockFaceView clockFaceView) {
        this.f27364Y = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f27364Y;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f27347z0.f27351k0) - clockFaceView.f27340H0;
        if (height != clockFaceView.f27368x0) {
            clockFaceView.f27368x0 = height;
            clockFaceView.f();
            int i10 = clockFaceView.f27368x0;
            ClockHandView clockHandView = clockFaceView.f27347z0;
            clockHandView.f27359s0 = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
