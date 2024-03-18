package m1;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: m1.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserver$OnPreDrawListenerC4548e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f38867Y;

    public ViewTreeObserver$OnPreDrawListenerC4548e(CoordinatorLayout coordinatorLayout) {
        this.f38867Y = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f38867Y.p(0);
        return true;
    }
}
