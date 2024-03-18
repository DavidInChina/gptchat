package q;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p.ViewTreeObserver$OnGlobalLayoutListenerC5029e;

/* loaded from: classes.dex */
public final class S implements PopupWindow.OnDismissListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f43348Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T f43349Z;

    public S(T t10, ViewTreeObserver$OnGlobalLayoutListenerC5029e viewTreeObserver$OnGlobalLayoutListenerC5029e) {
        this.f43349Z = t10;
        this.f43348Y = viewTreeObserver$OnGlobalLayoutListenerC5029e;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f43349Z.f43358M0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f43348Y);
        }
    }
}
