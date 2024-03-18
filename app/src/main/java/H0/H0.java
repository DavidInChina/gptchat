package H0;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class H0 {

    /* renamed from: a  reason: collision with root package name */
    public static final H0 f6740a = new Object();

    public final boolean a(MotionEvent motionEvent, int i10) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i10);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            rawY = motionEvent.getRawY(i10);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
