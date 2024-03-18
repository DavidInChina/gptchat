package B0;

import android.view.MotionEvent;

/* renamed from: B0.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0191h {

    /* renamed from: a  reason: collision with root package name */
    public static final C0191h f1642a = new Object();

    public final long a(MotionEvent motionEvent, int i10) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i10);
        rawY = motionEvent.getRawY(i10);
        return R4.b.r(rawX, rawY);
    }
}
