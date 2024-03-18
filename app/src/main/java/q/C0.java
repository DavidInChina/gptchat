package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43235Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D0 f43236Z;

    public /* synthetic */ C0(D0 d02, int i10) {
        this.f43235Y = i10;
        this.f43236Z = d02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43235Y;
        D0 d02 = this.f43236Z;
        switch (i10) {
            case 0:
                ViewParent parent = d02.f43255i0.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                d02.a();
                View view = d02.f43255i0;
                if (view.isEnabled() && !view.isLongClickable() && d02.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    d02.f43258l0 = true;
                    return;
                }
                return;
        }
    }
}
