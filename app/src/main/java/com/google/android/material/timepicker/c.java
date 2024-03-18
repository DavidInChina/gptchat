package com.google.android.material.timepicker;

import D1.C0343c;
import E1.o;
import E1.p;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.openai.chatgpt.R;

/* loaded from: classes.dex */
public final class c extends C0343c {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f27365i0;

    public c(ClockFaceView clockFaceView) {
        this.f27365i0 = clockFaceView;
    }

    @Override // D1.C0343c
    public final void e(View view, p pVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3255Y;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f27365i0.f27336D0.get(intValue - 1));
        }
        pVar.k(o.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        pVar.b(E1.h.f4100e);
    }

    @Override // D1.C0343c
    public final boolean h(View view, int i10, Bundle bundle) {
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f27365i0;
            view.getHitRect(clockFaceView.f27333A0);
            float centerX = clockFaceView.f27333A0.centerX();
            float centerY = clockFaceView.f27333A0.centerY();
            clockFaceView.f27347z0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f27347z0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.h(view, i10, bundle);
    }
}
