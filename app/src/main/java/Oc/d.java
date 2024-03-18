package Oc;

import android.view.MotionEvent;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class d extends WebView {
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
