package hh;

import android.os.Handler;
import android.view.View;
import id.AbstractC3557B;

/* renamed from: hh.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnAttachStateChangeListenerC3446n implements View.OnAttachStateChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public final RunnableC3445m f32369Y = new RunnableC3445m(this);

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3447o f32370Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ View f32371h0;

    public View$OnAttachStateChangeListenerC3446n(C3447o c3447o, View view) {
        this.f32370Z = c3447o;
        this.f32371h0 = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC3557B.d0("v", view);
        ((Handler) ih.c.f33250a.getValue()).removeCallbacks(this.f32369Y);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC3557B.d0("v", view);
        ((Handler) ih.c.f33250a.getValue()).post(this.f32369Y);
    }
}
