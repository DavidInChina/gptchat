package hh;

import android.view.View;

/* renamed from: hh.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3445m implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ View$OnAttachStateChangeListenerC3446n f32368Y;

    public RunnableC3445m(View$OnAttachStateChangeListenerC3446n view$OnAttachStateChangeListenerC3446n) {
        this.f32368Y = view$OnAttachStateChangeListenerC3446n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View$OnAttachStateChangeListenerC3446n view$OnAttachStateChangeListenerC3446n = this.f32368Y;
        C3443k c3443k = view$OnAttachStateChangeListenerC3446n.f32370Z.f32372a.f32374b;
        View view = view$OnAttachStateChangeListenerC3446n.f32371h0;
        c3443k.a(view.getClass().getName().concat(" received View#onDetachedFromWindow() callback"), view);
    }
}
