package p;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class y implements PopupWindow.OnDismissListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ A f41672Y;

    public y(A a5) {
        this.f41672Y = a5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f41672Y.c();
    }
}
